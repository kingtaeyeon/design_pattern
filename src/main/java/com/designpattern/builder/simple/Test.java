package com.designpattern.builder.simple;

import com.designpattern.builder.chain.CourseBuilder;

public class Test {

    public static void main(String[] args) {
        CourseBuilder builder = new CourseBuilder();
        builder.addHomework("【课后作业】")
                .addName("【设计模式】")
                .addNote("【课程笔记】")
                .addPPT("【PPT课件】")
                .addVideo("【回放视频】");
        System.out.println(builder.build());

    }









}
