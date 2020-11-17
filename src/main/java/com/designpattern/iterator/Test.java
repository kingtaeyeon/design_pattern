package com.designpattern.iterator;

public class Test {

    public static void main(String[] args) {
        Course java = new Course("Java架构");
        Course javaBase = new Course("Java入门");
        Course design = new Course("设计模式");
        Course ai = new Course("人工智能");

        CourseAggregrate courseAggregrate = new CourseAggregateImpl();
        courseAggregrate.add(java);
        courseAggregrate.add(javaBase);
        courseAggregrate.add(design);
        courseAggregrate.add(ai);

        System.out.println("---------------课程列表---------------");
        printCourses(courseAggregrate);

        courseAggregrate.remove(javaBase);
        System.out.println("---------------删除之后的课程列表---------------");
        printCourses(courseAggregrate);
    }

    public static void printCourses(CourseAggregrate courseAggregate) {
                   Iterator<Course> iterator = courseAggregate.iterator();
        while(iterator.hasNext()) {
            Course course = iterator.next();
            System.out.println("《"+ course.getName() +"》");
        }
    }

}
