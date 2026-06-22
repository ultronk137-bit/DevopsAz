package com.example;

/**
 * Hello world!
 */
public class App {
    public int Add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        App app=new App();
        int result=app.Add(2,3);
        System.out.println("result is"+result);

    }
}
