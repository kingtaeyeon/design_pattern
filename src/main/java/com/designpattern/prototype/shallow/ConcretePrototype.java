package com.designpattern.prototype.shallow;

import com.designpattern.prototype.shallow.ConcretePrototype;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: LiHao
 * @Since: 2020/9/5 17:06
 */
@Data
public class ConcretePrototype implements Cloneable {

    private int age;
    private String name;
    private List<String> hobbies;

    @Override
    public ConcretePrototype clone() {
        try {
            return (ConcretePrototype)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }

}
