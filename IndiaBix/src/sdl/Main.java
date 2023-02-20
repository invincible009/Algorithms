package sdl;

import sdl.numberseries.NumberSeries;

public class Main {
    public static void main(String[] args) {
        NumberSeries numberSeries = new NumberSeries();
//        System.out.println(numberSeries.generate5Number(5));

        for(int i =0; i< 10; i++){
            System.out.print("Without Recursion : "+numberSeries.generate5Number(i)+", ");
            System.out.println();
        }

        for(int i =0; i< 10; i++){
            System.out.print("Using recursion : "+ numberSeries.generateRecursion(i)+" ,");
            System.out.println();
        }
    }
}
