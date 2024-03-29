package com.kecle.work.pojo;

public class UserAndLock {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UserAndLock.userId
     *
     * @mbggenerated
     */
    private String userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UserAndLock.lockId
     *
     * @mbggenerated
     */
    private String lockid;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UserAndLock
     *
     * @mbggenerated
     */
    public UserAndLock(String userid, String lockid) {
        this.userid = userid;
        this.lockid = lockid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UserAndLock
     *
     * @mbggenerated
     */
    public UserAndLock() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UserAndLock.userId
     *
     * @return the value of UserAndLock.userId
     *
     * @mbggenerated
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UserAndLock.userId
     *
     * @param userid the value for UserAndLock.userId
     *
     * @mbggenerated
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UserAndLock.lockId
     *
     * @return the value of UserAndLock.lockId
     *
     * @mbggenerated
     */
    public String getLockid() {
        return lockid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UserAndLock.lockId
     *
     * @param lockid the value for UserAndLock.lockId
     *
     * @mbggenerated
     */
    public void setLockid(String lockid) {
        this.lockid = lockid == null ? null : lockid.trim();
    }
}