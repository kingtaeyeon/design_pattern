package com.designpattern.chain.auth.optimeze;

import com.designpattern.chain.auth.Member;

public abstract class Handler {

    protected Handler chain;

    public void next(Handler handler) {
        this.chain = handler;
    }

    public abstract void doHandle(Member member);
}
