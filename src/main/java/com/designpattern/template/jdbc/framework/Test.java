package com.designpattern.template.jdbc.framework;

import com.designpattern.template.jdbc.dao.MemberDao;
import com.designpattern.template.jdbc.entity.Member;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();

    }
}
