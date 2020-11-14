package com.designpattern.template.course;

public class Test {
    public static void main(String[] args) {

        System.out.println("=======架构师课程=======");
        JavaCourse javaCourse = new JavaCourse();
        javaCourse.setNeedCheckHomework(true);
        javaCourse.createCourse();

        System.out.println("=======python课程=======");
        PythonCourse pythonCourse = new PythonCourse();
        pythonCourse.createCourse();

    }

}
