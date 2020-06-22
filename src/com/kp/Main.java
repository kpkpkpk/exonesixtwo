package com.kp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num[] = new int[3];
        int x = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }
        if(num[0]>num[1]){
            x=num[1];
            num[1]=num[0];
            num[0]=x;
        }else if(num[0]>num[2]){
            x=num[2];
            num[2]=num[0];
            num[0]=x;
        }if(num[1]>num[2]){
            x=num[2];
            num[2]=num[1];
            num[1]=x;
        }if(num[0]>num[1]){
            x=num[1];
            num[1]=num[0];
            num[0]=x;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(" " + num[i]); // Выводим на экран, полученный массив
        }
        System.out.println();


    }

}

