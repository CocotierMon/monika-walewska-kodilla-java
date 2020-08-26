package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        Board toDoList = context.getBean(Board.class);
        toDoList.getToDoList().getTasks().add("First task");
        Board inProgressList = context.getBean(Board.class);
        inProgressList.getInProgressList().getTasks().add("Second task");
        Board doneList = context.getBean(Board.class);
        doneList.getDoneList().getTasks().add("Third task");
        //Then
        Assert.assertEquals(1,toDoList.getToDoList().getTasks().size());
        Assert.assertEquals("Second task", inProgressList.getInProgressList().getTasks().get(0));
        Assert.assertEquals(1,doneList.getDoneList().getTasks().size());
        }
}
