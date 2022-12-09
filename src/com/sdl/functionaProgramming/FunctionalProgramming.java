package com.sdl.functionaProgramming;

import java.util.Random;
import java.util.function.IntBinaryOperator;

public class FunctionalProgramming {
    public static void main(String[] args) {
        Greeting greeting = new HelloGreeting();
        greeting.sayHello();

        Greeting greeting2 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello world");
            }
        };
        greeting2.sayHello();

        Greeting greeting3 =()-> System.out.println("Hello World");

        greeting3.sayHello();

        IntBinaryOperator calculator = (a, b)->{
            Random random = new Random();
            int randomNumber = random.nextInt(50);
            return a * b + randomNumber;
        };

        System.out.println(calculator.applyAsInt(5,6));

    }



}
