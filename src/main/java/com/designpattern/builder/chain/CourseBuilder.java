package com.designpattern.builder.chain;

import lombok.Data;

/**
 * @Author: LiHao
 * @Since: 2020/9/10 15:01
 */
public class CourseBuilder {

    private Course course = new Course();

    public CourseBuilder addName(String name) {
        course.setName(name);
        return this;
    }

    public CourseBuilder addPPT(String ppt) {
        course.setPpt(ppt);
        return this;
    }

    public CourseBuilder addVideo(String video) {
        course.setVideo(video);
        return this;
    }

    public CourseBuilder addNote(String note) {
        course.setNote(note);
        return this;
    }

    public CourseBuilder addHomework(String homework) {
        course.setHomework(homework);
        return this;
    }

    public Course build() {
        return this.course;
    }

    @Data
    public class Course {

        private String name;
        private String ppt;
        private String video;
        private String note;

        private String homework;

        @Override
        public String toString() {
            return "CourseBuilder{" +
                    "name='" + name + '\'' +
                    ", ppt='" + ppt + '\'' +
                    ", video='" + video + '\'' +
                    ", note='" + note + '\'' +
                    ", homework='" + homework + '\'' +
                    '}';
        }
    }
}
