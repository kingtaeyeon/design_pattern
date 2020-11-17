package com.designpattern.iterator;

public interface CourseAggregrate {

    void add(Course course);
    void remove(Course course);
    Iterator<Course> iterator();
}
