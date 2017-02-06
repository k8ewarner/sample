/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculator;

import java.util.Scanner;

/**
 *
 * @author nightingale
 */
public class Caclulator {
    public static void main(String[] args){
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number: ");
        a= scanner.nextInt();
        System.out.print("Second number: ");
        b= scanner.nextInt();
        c= a+b;
        System.out.println("The sum is: " +c);
    }
}
