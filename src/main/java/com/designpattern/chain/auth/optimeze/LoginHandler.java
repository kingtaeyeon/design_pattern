package com.designpattern.chain.auth.optimeze;

import com.designpattern.chain.auth.Member;

public class LoginHandler extends Handler{

    @Override
    public void doHandle(Member member) {
        System.out.println("登陆成功");
        member.setRoteName("管理员");
        chain.doHandle(member);
    }
}
