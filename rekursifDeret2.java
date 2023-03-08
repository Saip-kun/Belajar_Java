import java.util.Scanner;
public class rekursifDeret2{
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        int i, result, beda;

        System.out.print("Masukan batas deret n = ");
        i = input.nextInt();

        for (int n =1; n<=i; n++)
        {
            System.out.print(n*2+"+");
        }

        result= deret(i);
        System.out.print("\nHasil Jumlah Bilangan Berikut Ialah = "+result);
    }

    public static Integer deret(int n){
        if (n==1){
            return 2;
        }else {
            return (n*2 + deret (n-1));
        }
    }
}