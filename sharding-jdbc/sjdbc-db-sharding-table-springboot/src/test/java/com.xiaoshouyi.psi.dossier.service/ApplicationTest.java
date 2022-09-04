package com.xiaoshouyi.psi.dossier.service;

import com.cxytiandi.sharding.ShardingDbTableApplication;
import com.cxytiandi.sharding.controller.UserController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShardingDbTableApplication.class)
public class ApplicationTest {

    @Autowired
    private UserController userController;


    @Test
    public void add() {
        userController.add();
    }

    @Test
    public void get() {
        Object o = userController.get(771854188660391937l);
        System.out.println(o);
    }
}
