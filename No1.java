/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.pkg1;

import java.util.Scanner;
/**
 *
 * @author Praktikum
 */
public class No1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=0, b=0, hsl=1, ipt, jml=0;
        Scanner input = new Scanner (System.in);
        
        System.out.println("Program Fibonacci");
        System.out.print("Input : ");
        ipt = input.nextInt();
        System.out.print("Output : ");
        for(int i=1; i<=ipt; i++) {
            a=b;
            b=hsl;
            jml=jml+hsl;
            System.out.print(jml+" ");
            hsl=a+b;
        }
    }
    
}
