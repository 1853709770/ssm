package com.baizhi.test;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestBasic {

    protected ClassPathXmlApplicationContext ctx;

    @Before
    public void init() {
        ctx=new ClassPathXmlApplicationContext("spring.xml");
    }

    @Test
    public void testCtx(){
        UserDao userDao = ctx.getBean("userDao", UserDao.class);
        List<User> users = userDao.findall();
        System.out.println(users);
    }

    @After
    public void destory() {
        ctx.close();
    }

}
