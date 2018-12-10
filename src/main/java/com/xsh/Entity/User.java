package com.xsh.Entity;

/**
 * @author Zerox
 * @date 2018/12/10 14:25
 */
public class User {

    /**
     * 用户名
     */
    private  String name;
    /**
     * 密码
     */
    private  String password;


    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
