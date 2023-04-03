/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.yang;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jacky
 */
public class Yang {

    public static void main(String[] args) {
        System.out.println("inserisci i valori di n e k");
        Scanner myObj1 = new Scanner(System.in);
        Scanner myObj2 = new Scanner(System.in);
        
        int n = myObj1.nextInt();
        int k = myObj2.nextInt();
        
        Fattoriale f1 = new Fattoriale(n);
        Fattoriale f2 = new Fattoriale(n);
        Fattoriale f3 = new Fattoriale(n);
        
        f1.start();
        f2.start();
        f3.start();
        
        try{
            f1.join();
            f2.join();
            f3.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        double c1 = f1.calcolo(n)/(f1.calcolo(k)*f1.calcolo(n-k));
        double c2 = f2.calcolo(n)/(f2.calcolo(k)*f2.calcolo(n-k));
        double c3 = f3.calcolo(n)/(f3.calcolo(k)*f3.calcolo(n-k));
        
        System.out.println("cambinazione 1 :"+c1);
        System.out.println("cambinazione 2 :"+c2);
        System.out.println("cambinazione 3 :"+c3);
        
        
    }
}
