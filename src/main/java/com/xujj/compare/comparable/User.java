package com.xujj.compare.comparable;

/**
 * @description:Comparable��compareTo
 * @author: xujianjie
 * @create: 2020-12-12 10:05
 **/
public class User implements Comparable<User>{

    private Integer userId;

    private String userName;

    @Override
    public int compareTo(User user) {
        //����(����ʹ��һ��������������Լ�-�����������ʱ)
        return user.userId - this.userId;
//        //����
//        return this.userId - user.userId;
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User(Integer userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
}
