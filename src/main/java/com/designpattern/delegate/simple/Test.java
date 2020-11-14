package com.designpattern.delegate.simple;

public class Test {

    public static void main(String[] args) {
        new Boss().command("爬虫", new Leader());
        new Boss().command("海报图", new Leader());
        new Boss().command("爱清清", new Leader());
    }

}
