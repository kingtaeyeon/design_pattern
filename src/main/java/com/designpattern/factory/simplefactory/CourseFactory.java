package com.designpattern.factory.simplefactory;

/**
 * @author lihao
 */
public class CourseFactory {

    public ICourse create(Class<? extends ICourse> clazz) {
//        if("java".equals(name)) {
//            return new JavaICourse();
//        } else if("python".equals(name)) {
//            return new PythonICourse();
//        } else {
//            return null;
//        }
//        try {
//            if(!(null == className || "".equals(className))) {
//                return (ICourse)Class.forName(className).newInstance();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
        try {
            if (null != clazz) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
