import java.util.Scanner;
public class rekursif {
   
    public static void main(String[]args) {
        double result;
        double n;
        Scanner input =  new Scanner(System.in);
        System.out.print("Masukkan bilangan n = ");
        n = input.nextDouble();
        result = i(n);
        System.out.print("Hasil = " + result);
    }
    public static double i(double n) {
        double result;
        if (n == 1){
            return 1;
        }
        else{
            result = 2*(n*n);
        }
        return result;
    }
}
