package xyz;

import com.sun.jndi.ldap.sasl.SaslInputStream;

import java.util.Scanner;

public class filefour {
    public static void main(String[] args) {
        Scanner chukua;
        String[] watu;
        Integer num;

        chukua=new Scanner(System.in);
        System.out.println("how many names do you have?");
        num=chukua.nextInt();
        watu=new String[num];
        for (int i=0; i<num; i++){
            System.out.println("enter name"+(i+1));
            watu[i]=chukua.next();
        }
        for (int i=0; i<num; i++){
            System.out.println(watu[i]);
        }
    }
}
