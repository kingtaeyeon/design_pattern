package com.designpattern.factory.abstractfactory;

/**
 * @author LiHao
 */
public abstract class BaseCourseFactory {

    public void init() {
        System.out.println("初始化数据");
    }

    /***
     * 描述 
     * @param  
     * @return com.designpatterns.factorypatterns.abstractfactory.INote
     * @Author: LiHao 
     * @Since: 2020/7/24 16:47
     */ 
    protected abstract INote createNote();

    /***
     * 描述 
     * @param  
     * @return com.designpatterns.factorypatterns.abstractfactory.IVideo
     * @Author: LiHao 
     * @Since: 2020/7/24 16:47
     */ 
    protected abstract IVideo createVideo();
}