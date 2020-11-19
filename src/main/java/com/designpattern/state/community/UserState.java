package com.designpattern.state.community;


public abstract class UserState {

    protected AppContext context;

    public void setContext(AppContext context) {
        this.context = context;
    }

    public void favorite() {}

    public abstract void comment(String comment);
}
