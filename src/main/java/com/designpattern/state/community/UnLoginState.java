package com.designpattern.state.community;

public class UnLoginState extends UserState{
    @Override
    public void favorite() {
        this.switch2Login();
        this.context.getState().favorite();
    }

    private void switch2Login() {
        System.out.println("跳转到登录页面");
        this.context.setState(this.context.STATE_LOGIN);
    }

    @Override
    public void comment(String comment) {
        this.switch2Login();
        this.context.getState().comment(comment);
    }
}
