import java.util.Scanner;
public class rekursifDeret1 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int i, result;

        System.out.print("Masukan batas deret n = ");
        i = input.nextInt();

        for (int n =1; n<=i; n++)
        {
            System.out.print(n+"+");
        }

        result= deret(i);
        System.out.print("\nHasil Jumlah Bilangan Berikut Ialah = "+result);
    }

    public static Integer deret(int n) {
        if (n==0){
            return 0;
        } else {
            return (n + deret (n-1));
        }
    }
}
