package com.designpattern.factory.abstractfactory;

/**
 * @author LiHao
 */
public class JavaCourseFactory extends BaseCourseFactory{

    @Override
    protected INote createNote() {
        super.init();
        return new JavaNote();
    }

    @Override
    protected IVideo createVideo() {
        return new JavaVideo();
    }
}
