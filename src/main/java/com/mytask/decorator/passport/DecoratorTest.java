package com.mytask.decorator.passport;

import com.mytask.decorator.passport.old.SignServiceImpl;
import com.mytask.decorator.passport.upgrade.SignForThirdService;
import com.mytask.decorator.passport.upgrade.SignForThirdServiceImpl;

public class DecoratorTest {

    public static void main(String[] args) {
        SignForThirdService service = new SignForThirdServiceImpl(new SignServiceImpl());
        service.login("ssss","213");
        service.loginForQQ("ssss");
    }
}
