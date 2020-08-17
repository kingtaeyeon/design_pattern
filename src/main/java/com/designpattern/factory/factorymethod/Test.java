package com.designpattern.factory.factorymethod;

/**
 * @author LiHao
 */
public class Test {
    ICourseFactory factory = new PythonCourseFactory();
    ICourse python = factory.create();

}
