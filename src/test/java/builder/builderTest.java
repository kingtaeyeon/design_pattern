package builder;

import com.designpattern.builder.simple.CourseBuilder;

public class builderTest {

    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseBuilder();

        courseBuilder.addName("设计模式");
        courseBuilder.addPPT("【PPT课件】");
        courseBuilder.addVideo("【回放视频】");
        courseBuilder.addNote("【课程笔记】");
        courseBuilder.addHomework("【课后作业】");

        System.out.println(courseBuilder.build());
    }
}
