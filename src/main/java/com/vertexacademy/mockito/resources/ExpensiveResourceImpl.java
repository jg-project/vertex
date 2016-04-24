package com.vertexacademy.mockito.resources;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Sergii on 23.04.2016.
 */
public class ExpensiveResourceImpl implements ExpensiveResource {

    public ExpensiveResourceImpl() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getPreciousValue() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return String.valueOf(ThreadLocalRandom.current().nextLong());
    }
}
