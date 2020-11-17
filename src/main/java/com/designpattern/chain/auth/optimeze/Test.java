package com.designpattern.chain.auth.optimeze;

public class Test {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        memberService.login("豪哥", "123");
    }
}
