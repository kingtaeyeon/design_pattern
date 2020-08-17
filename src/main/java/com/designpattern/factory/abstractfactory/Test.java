package com.designpattern.factory.abstractfactory;




/**
 * @author LiHao
 */
public class Test {

    public static void main(String[] args) {
        BaseCourseFactory factory = new JavaCourseFactory();
        factory.createNote();
        factory.createVideo();

    }

}
