package com.sdl.anonymousClasses;

public class HelloWorldAnonymousClasses {
    /**
     * This class has an interface
     */
    interface  HelloWorld{
        void greet();
        void greetSomeone(String name);
    }

    /**
     * There is a method that is meant to greet a user
     */
    void SayHello(){
        /**
         * This method has an anonymous inner class that implements the HelloWorld Interface
         */

        class EnglishGreeting implements HelloWorld{
            String name ="world";
            @Override
            public void greet() {
                greetSomeone("world");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello "+ name);
            }
        }

        HelloWorld englishGreeting = new EnglishGreeting();

        HelloWorld frenchGreeting = new HelloWorld() {
            String name =" tout le monde";
            @Override
            public void greet() {
                greetSomeone(" tout le monde");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("salut "+ name);
            }
        };

        HelloWorld spanishGreeting = new HelloWorld() {
            String name = " mundo";
            @Override
            public void greet() {
                greetSomeone("Mundo");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola "+ name);
            }
        };


        englishGreeting.greet();
        spanishGreeting.greetSomeone("fred");
        frenchGreeting.greet();
    }
}
