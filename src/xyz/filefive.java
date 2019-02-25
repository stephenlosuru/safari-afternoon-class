package xyz;

import java.util.Scanner;

public class filefive {
    public static void main(String[] args) {
        String[] workers;
        int num;
        Scanner take;
        take=new Scanner(System.in);
        System.out.println("how many employees");
        num=take.nextInt();
        workers=new String[num];
        for (int i=0; i<num;i++){
            System.out.println("enter name"+(i+1));
            workers[i]=take.next();

        }
        for (int i=0; i<num; i++){
            System.out.println((i+1)+" "+workers[i]);
        }
    }
}
