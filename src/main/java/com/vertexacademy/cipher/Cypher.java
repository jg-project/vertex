package com.vertexacademy.cipher;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by user on 28.05.16.
 */
public class Cypher {

    static void checkIt(char[] currentKey, int currentPos, char low, char high, Callback<char[]> callback) {
        if (currentPos > -1) {
            for (char i = low; i <= high; i++) {
                currentKey[currentPos] = i;
                if (currentPos == 0) {
                    char[] buf = new char[currentKey.length];
                    System.arraycopy(currentKey, 0, buf, 0, currentKey.length);
                    callback.call(buf);
                } else {
                    checkIt(currentKey, currentPos - 1, low, high, callback);
                }
            }
        }
    }

    public static void main(String[] args) {
        final ExecutorService executors = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        long ts = System.currentTimeMillis();
        char[] buf = new char[8];
        checkIt(buf, buf.length - 1, 'a', 'f', (char[] t) -> {
            executors.submit(() -> {
                int len = t.length;
//                System.out.println(Thread.currentThread().getName() + Arrays.toString(t));
            });
        });

        System.out.println(System.currentTimeMillis() - ts);
        executors.shutdown();
        System.out.println(System.currentTimeMillis() - ts);


    }

    static void fuckTheStack(int levelUp) {
        System.out.println(levelUp);
        fuckTheStack(++levelUp);
    }

    public interface Callback<T> {
        void call(T param);
    }

}
