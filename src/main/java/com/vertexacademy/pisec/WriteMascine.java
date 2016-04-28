package com.vertexacademy.pisec;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Vasyl on 28/04/2016.
 */
public class WriteMascine implements MachineWriteable {
    @Autowired
    private Writeable writeable;

    @Override
    public void writeText() {
        System.out.println(writeable.write());
    }
}
