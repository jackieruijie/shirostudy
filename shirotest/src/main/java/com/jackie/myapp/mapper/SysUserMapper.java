package com.jackie.myapp.mapper;

import com.jackie.myapp.model.SysUser;

public interface SysUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    int deleteByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    int insert(SysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    int insertSelective(SysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    SysUser selectByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    int updateByPrimaryKeySelective(SysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    int updateByPrimaryKey(SysUser record);
}