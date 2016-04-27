package com.vertexacademy.machine.writers;

/**
 * Created by RASTA on 27.04.2016.
 */
public class WriterImpl implements Writer {
    private String name;
    private String opus;

    public WriterImpl(String name, String opus) {
        this.name = name;
        this.opus = opus;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getOpus() {
        return opus;
    }
}
