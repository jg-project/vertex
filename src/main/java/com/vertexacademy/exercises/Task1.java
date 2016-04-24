package com.vertexacademy.exercises;

/**
 * Created by Дмитрий on 24.04.2016.
 */
public class Task1 implements ITask1 {

    @Override
    public boolean isSimpleNumber(int n) {
        for(int i = 2;i<n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
