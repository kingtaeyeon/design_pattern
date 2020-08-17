package com.designpattern.factory.simplefactory;

public class Test {

    public static void main(String[] args) {
        ICourse ICourse = new CourseFactory().create(JavaCourse.class);
    }
}
