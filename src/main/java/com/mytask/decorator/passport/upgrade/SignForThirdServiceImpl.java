package com.mytask.decorator.passport.upgrade;

import com.mytask.decorator.passport.old.ResultMsg;
import com.mytask.decorator.passport.old.SignService;

public class SignForThirdServiceImpl implements SignForThirdService {

    private SignService signService;

    public SignForThirdServiceImpl(SignService signService){
        this.signService = signService;
    }

    public ResultMsg loginForQQ(String id) {
        System.out.println("qq授权登陆成功");
        return new ResultMsg(200,"qq授权登陆成功",null);
    }

    public ResultMsg loginForWechat(String id) {
        return null;
    }

    public ResultMsg loginForToken(String token) {
        return null;
    }

    public ResultMsg loginForTelphone(String telphone, String code) {
        return null;
    }

    public ResultMsg login(String username, String password) {
        return this.signService.login(username,password);
    }
}
