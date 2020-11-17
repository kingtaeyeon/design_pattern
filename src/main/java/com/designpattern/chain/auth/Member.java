package com.designpattern.chain.auth;

import lombok.Data;

@Data
public class Member {

    private String loginName;
    private String loginPass;
    private String roteName;

    public Member(String loginName, String loginPass) {
        this.loginName = loginName;
        this.loginPass = loginPass;
    }
}
