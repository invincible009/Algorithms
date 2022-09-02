package com.sdl.ConcurrencyLessons;


import java.util.concurrent.TimeUnit;

public class HelloWorldThreadExample {
    private static String result="";

    public static void hello() throws InterruptedException {
        delay(500);
        result = result.concat("Hello");
    }

    public static void world() throws InterruptedException {
        delay(500);
        result = result.concat("world");

    }

    public static void delay(int i)  {
        try {
            TimeUnit.SECONDS.sleep(i);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
       Thread helloThread = new Thread(()-> {
           try {
               hello();
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       });

        Thread worldThread = new Thread(()-> {
            try {
                hello();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        helloThread.start();
        worldThread.start();

        helloThread.join();
        worldThread.join();

        System.out.println("Result is "+ result);
    }
}
