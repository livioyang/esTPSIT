/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.yang;

/**
 *
 * @author jacky
 */
public class Fattoriale extends Thread{
    int val;
    

    public int getVal() {
        return val;
    }

    public Fattoriale(int val) {
        this.val = val;
    }
    
    public double calcolo(int a){
        int f=1;
        for(int i=1; i<=a; i=i+1) {
          f=f*i;
        }
        return f;
    }

    @Override
    public void run(){ 
        
        int f=1;
        for(int i=1; i<=val; i=i+1) {
          f=f*i;
        }
        val = f;
        try{
            Thread.sleep(200);
        }catch(InterruptedException e){
            return;
        }
    }
}
    
