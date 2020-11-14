package com.designpattern.template.course;

public class JavaCourse extends AbstractCourse {

    private boolean needCheckHomework;

    public void setNeedCheckHomework(boolean needCheckHomework) {
        this.needCheckHomework = needCheckHomework;
    }

    @Override
    protected boolean needCheckHomework() {
        return this.needCheckHomework;
    }

    protected void checkHomework() {
        if(needCheckHomework) {
            System.out.println("检查java作业");
        }
    }
}
