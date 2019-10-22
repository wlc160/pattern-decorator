package com.mytask.decorator.passport.old;

public interface SignService {

    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    ResultMsg login(String username, String password);
}
