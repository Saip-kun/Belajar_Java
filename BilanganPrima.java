import java.util.Scanner;
public class BilanganPrima {
    private static int ambilNilaiRekursif(int number, int index) {
        if (index == 1)
            return 1;
        else if (number % index == 0)
            return 1 + ambilNilaiRekursif(number, --index);
        else
            return 0 + ambilNilaiRekursif(number, --index);
    }

    public static boolean cekBilanganPrima (int num) {
        if (num > 1)
            return(ambilNilaiRekursif(num, num) == 2);
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input bilangan prima : ");
        int num = input.nextInt();
        if (cekBilanganPrima(num))
            System.out.println("Ini adalah Bilangan Prima");
        else
            System.out.println("Ini Bukan Bilangan Prima");

    }
}