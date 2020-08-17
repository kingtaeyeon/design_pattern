package com.designpattern.factory.factorymethod;

/**
 * @author lihao
 */
public interface ICourseFactory {
    
    /***
     * 创建课程
     * @param  
     * @return ICourse
     * @Author: LiHao
     * @Since: 2020/7/23 20:58
     */ 
    ICourse create();
}
