package com.designpattern.state.community;

public class Test {

    public static void main(String[] args) {
        AppContext context = new AppContext();
        context.favorite();
        context.comment("评论：好文章");
    }
}
