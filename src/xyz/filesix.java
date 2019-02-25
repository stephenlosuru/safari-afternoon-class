package xyz;

import javax.swing.*;

public class filesix {
    public static void main(String[] args) {
        String num;
        Integer numconverted;
        String[] voters;
        num= JOptionPane.showInputDialog("how many voters?");
        numconverted=Integer.parseInt(num);
        voters=new String[numconverted];
        for (int i=0; i<numconverted; i++){
            voters[i] = JOptionPane.showInputDialog("enter voter "+(i+1));
        }
        for (int i=0; i<numconverted; i++){
            System.out.println((i+1)+" "+voters[i]);
        }
    }
}
