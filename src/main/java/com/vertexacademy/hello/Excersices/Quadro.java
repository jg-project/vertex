package com.vertexacademy.hello.Excersices;

import java.util.Scanner;

/**
 * Created by user on 24.04.2016.
 */
public class Quadro implements Quadrable {

    double x1;
    double x2;
    @Override
    public  void countDouble(double a,double b,double c) {

        double dis = Math.pow(b, 2)-4*a*c;
        if (dis<0) {
            System.out.println("Решений нет");
        } else  {
            x1 = (Math.pow(dis,0.5)-b)/(2*a);
            x2 = (-Math.pow(dis,0.5)-b)/(2*a);
            System.out.println(x1+" "+x2);
            System.out.println(dis);
        }

    }

    public static void main(String[] args) {
        Quadro q1 = new Quadro();
        q1.countDouble(5,-9,-2);
    }
}
