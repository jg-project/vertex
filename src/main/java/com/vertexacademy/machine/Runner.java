package com.vertexacademy.machine;

import com.vertexacademy.machine.writers.Writer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by RASTA on 27.04.2016.
 */
public class Runner extends Thread {

    @Value("${repeatNumber:3}")
    private int repeatNumber;

    @Autowired
    private WriterProvider writerProvider;

    @Override
    public void run() {
        for (int i = 0; i < repeatNumber; i++) {
            Writer writer = writerProvider.getRandomWriter();
            System.out.println(writer.getName());
            System.out.println(writer.getOpus());
            System.out.println();

        }
    }
}
