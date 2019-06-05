package com.jackie.myapp.model;

public class SysUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_id
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_name
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.full_name
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    private String fullName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.password
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.salt
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    private String salt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.is_applied
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    private Boolean isApplied;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.is_delete
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    private Boolean isDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.column_8
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    private Integer column8;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.is_profile
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    private Boolean isProfile;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_id
     *
     * @return the value of sys_user.user_id
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_id
     *
     * @param userId the value for sys_user.user_id
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_name
     *
     * @return the value of sys_user.user_name
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_name
     *
     * @param userName the value for sys_user.user_name
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.full_name
     *
     * @return the value of sys_user.full_name
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.full_name
     *
     * @param fullName the value for sys_user.full_name
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.password
     *
     * @return the value of sys_user.password
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.password
     *
     * @param password the value for sys_user.password
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.salt
     *
     * @return the value of sys_user.salt
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.salt
     *
     * @param salt the value for sys_user.salt
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.is_applied
     *
     * @return the value of sys_user.is_applied
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    public Boolean getIsApplied() {
        return isApplied;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.is_applied
     *
     * @param isApplied the value for sys_user.is_applied
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    public void setIsApplied(Boolean isApplied) {
        this.isApplied = isApplied;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.is_delete
     *
     * @return the value of sys_user.is_delete
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.is_delete
     *
     * @param isDelete the value for sys_user.is_delete
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.column_8
     *
     * @return the value of sys_user.column_8
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    public Integer getColumn8() {
        return column8;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.column_8
     *
     * @param column8 the value for sys_user.column_8
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    public void setColumn8(Integer column8) {
        this.column8 = column8;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.is_profile
     *
     * @return the value of sys_user.is_profile
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    public Boolean getIsProfile() {
        return isProfile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.is_profile
     *
     * @param isProfile the value for sys_user.is_profile
     *
     * @mbg.generated Wed Jun 05 11:21:23 CST 2019
     */
    public void setIsProfile(Boolean isProfile) {
        this.isProfile = isProfile;
    }
}