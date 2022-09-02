package com.sdl.localClasseExample;


import lombok.Data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static com.sdl.ConcurrencyLessons.HelloWorldThreadExample.delay;

public class Main {
    public static void main(String[] args)throws InterruptedException {
        LocalClassesExample myApp =new LocalClassesExample();
        List<String> sl = new ArrayList<>();
        List<Object> ol = Collections.singletonList(sl);

//performRecursion(4);


        //Initiate a background task, complete a task and return the task the monitor
        //thenApply dose a whole lot of transformation
        CompletableFuture.supplyAsync(Main::helloWorld)
                .thenApply(String::toUpperCase)
                .thenAccept((result)-> System.out.println("Result Is "+result))
                .join();



    }

    public static String helloWorld() {
       // delay(1000);
        return "Hello World";
    }

    /**
     * A wild-card basically dose all the heavy lifting for the user
     */
    public static void printCollection(Collection<?> collection){
        collection.forEach(e-> System.out.println(e));
    }

    @Data
    abstract class Person {
        private String name;
        private String department;
        public abstract void getPay();

        public void resumeDuty(){

        }

    }

    //perform recursion
    public static void performRecursion(int number){
        if ( number < 0){
            System.out.println("Recursion can no longer be performed");
        }else {
            performRecursion(number- 1);
            System.out.println( "Recursion can still be performed "+number+ " times");
        }
    }



}
