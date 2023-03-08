import java.util.ArrayList;

public class Looping {
    
    public static void main(String[]args) {
        ArrayList <String> result =  new ArrayList <String>();

        for (int b = 0; b < 1000; b++){
            for (int a = 0; a < b; a++){
                double calculatedResult = (Math.pow(a, b) + Math.pow(b, b) + 1) / (a * b);
                if (calculatedResult == (int) calculatedResult) {
                    result.add(new String("[" + a + "," + b + "]"));
                } 
            }
        }
        System.out.println("Result : " + result);
    }
}
