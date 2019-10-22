package com.mytask.decorator.passport.old;

public class SignServiceImpl implements SignService {

    public ResultMsg login(String username, String password) {
        System.out.println("用户名："+username+",密码："+password+"登陆成功");
        return new ResultMsg(200,"登陆成功",null);
    }
}
