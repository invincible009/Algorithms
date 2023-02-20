package sdl.numberseries;

public class NumberSeries {

    public static double generateRecursion(int num){
        if(num == 1)
            return 2.0;
        return 0.5 * generate5Number(num -1);
    }


    public static double generate5Number(int num){
        return 8 * Math.pow(0.5, num -1);
    }
}
