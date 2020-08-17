package com.designpattern.factory.factorymethod;


/**
 * @author lihao
 */
public class PythonCourseFactory implements ICourseFactory{

    public ICourse create() {
        return new JavaCourse();
    }
}
