package com.designpattern.factory.abstractfactory;

/**
 * @author LiHao
 */
public class PythonCourseFactory extends BaseCourseFactory{

    @Override
    protected INote createNote() {
        super.init();
        return new PythonNote();
    }

    @Override
    protected IVideo createVideo() {
        super.init();
        return new PythonVideo();
    }
}
