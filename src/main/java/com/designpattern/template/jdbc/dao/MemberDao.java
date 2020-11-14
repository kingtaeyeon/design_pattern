package com.designpattern.template.jdbc.dao;

import com.designpattern.template.jdbc.entity.Member;
import com.designpattern.template.jdbc.framework.JdbcTemplate;
import com.designpattern.template.jdbc.framework.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

public class MemberDao extends JdbcTemplate {
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll() {
        String sql = "select * from t_member";
        return super.executeQuery(sql, new RowMapper<Member>() {
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setUsername(rs.getString("username"));
                member.setPassword(rs.getString("password"));
                member.setAge(rs.getString("age"));
                member.setAddr(rs.getString("addr"));

                return member;
            }
        }, null);
    }

}
