package com.vertexacademy.machine;

import com.vertexacademy.machine.writers.Writer;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by RASTA on 27.04.2016.
 */
public class WriterProvider {


    private List<Writer> writers;

    public WriterProvider(List<Writer> writers) {
        this.writers = writers;
    }

    private static final Writer DEFAULT_WRITER = new Writer() {

        @Override
        public String getName() {
            return "default";
        }

        @Override
        public String getOpus() {
            return "default";
        }
    };

    public Writer getRandomWriter() {
        return (writers == null || writers.size() == 0) ? DEFAULT_WRITER : writers.get(ThreadLocalRandom.current().nextInt(writers.size()));
    }
}
