package com.vertexacademy.pisec;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Vasyl on 28/04/2016.
 */
public class WriteMascineTest {
    private Writeable writeable = new Poet();

    @Test
    public void waitingNotNull() {
        assertNotNull(writeable);
    }

    @Test
    public void testWriteText() throws Exception {
        assertEquals("Poet write: tra-la-la tra-la-la", writeable.write());
    }
}