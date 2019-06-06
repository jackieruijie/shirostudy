package com.jackie.myapp.shiro;

import com.jackie.myapp.mapper.SysUserMapper;
import com.jackie.myapp.model.SysUser;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 对用户进行用户名和密码验证
 *
 * @author jackie
 */
public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private SysUserMapper userMapper;

    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /**
     * 认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //把authenticationToken转换为UsernamePasswordToken
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        SysUser user = userMapper.getUserByUsername(token.getUsername());
        if (user == null) {
            throw new UnknownAccountException("用户不存在！");
        }
        // 根据用户的情况，来构建AuthenticationInfo对象并返回，通常使用的实现类为SimpleAuthenticationInfo
        // 以下信息从数据库中获取
        // （1）principal：认证的实体信息，可以是email，也可以是数据表对应的用户的实体类对象
        Object principal = token.getUsername();
        // （2）credentials：密码
        Object credentials = user.getPassword();
        // （3）realmName：当前realm对象的name，调用父类的getName()方法即可
        String realmName = getName();
        // （4）盐值：取用户信息中唯一的字段来生成盐值，避免由于两个用户原始密码相同，加密后的密码也相同
          ByteSource credentialsSalt = ByteSource.Util.bytes(user.getSalt());
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(principal, credentials,credentialsSalt, realmName);
        //返回比对结果
        return info;
    }
}
