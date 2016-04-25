package com.vertexacademy.spring.rectangle;

import com.vertexacademy.spring.studySpring.Point;
import com.vertexacademy.spring.studySpring.Rectangle;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Дмитрий on 26.04.2016.
 */
public class SquareTest {


    @Test
    public void squareTest(){
        Assert.assertEquals(4,new Rectangle(new Point(5,6),new Point(7,8)).square(),0.00001);
    }

}
