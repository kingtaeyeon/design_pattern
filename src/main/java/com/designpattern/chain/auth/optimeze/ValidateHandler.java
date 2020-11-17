package com.designpattern.chain.auth.optimeze;

import com.designpattern.chain.auth.Member;
import org.springframework.util.StringUtils;

/**
 * 非空校验类
 * @Author: LiHao
 * @Since: 2020/11/17 9:43
 */
public class ValidateHandler extends Handler{

    @Override
    public void doHandle(Member member) {
        if(StringUtils.isEmpty(member.getLoginName())||
                StringUtils.isEmpty(member.getLoginPass())) {
            System.out.println("用户名或密码为空");
            return;
        }
        System.out.println("用户名和密码校验成功，可以往下执行");
        chain.doHandle(member);
    }
}
