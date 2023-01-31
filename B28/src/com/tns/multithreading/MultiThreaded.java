package com.tns.multithreading;

public class MultiThreaded {



        public static void main(String[] args)  
        { 
        System.out.println("Main method...!"); 
        MyThread1 t1=new MyThread1(); 
        MyThread2 t2=new MyThread2(); 
         
        t1.start(); 
        t2.start(); 
} 
 
}