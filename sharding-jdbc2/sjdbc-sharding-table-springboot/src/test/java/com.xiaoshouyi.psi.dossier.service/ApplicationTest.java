package com.xiaoshouyi.psi.dossier.service;

import com.cxytiandi.sharding.table.ShardingTableApplication;
import com.cxytiandi.sharding.table.controller.UserController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShardingTableApplication.class)
public class ApplicationTest {

    @Autowired
    private UserController userController;


    @Test
    public void add() {

        userController.add();
    }

    @Test
    public void get() {
        Object o = userController.get(44l);
        System.out.println(o);
    }

    @Test
    public void getByMemberId() {
        Object o = userController.getByMemberId("20220801");
        System.out.println(o);
    }
}
