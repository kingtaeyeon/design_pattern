package com.designpattern.factory.factorymethod;


/**
 * @author lihao
 */
public class JavaCourseFactory implements ICourseFactory{

    public ICourse create() {
        return new JavaCourse();
    }

}
