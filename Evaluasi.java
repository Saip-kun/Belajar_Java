import java.util.Scanner;
public class Evaluasi {

    public static void main(String[]args){
        try (Scanner input = new Scanner(System.in)) {
            int jumlahLulus = 0;
            int jumlahGagal = 0;
            int counterSiswa = 1;
            int hasil;

            while(counterSiswa <= 8){
                System.out.print("Masukkan hasil ujian (1 =  lulus atau 2 = gagal):");
                hasil = input.nextInt();

                if (hasil == 1){
                    jumlahLulus = jumlahLulus + 1;
                }
                else{
                    jumlahGagal = jumlahGagal + 1;
                }
                counterSiswa = counterSiswa + 1;
            }

            System.out.printf("Lulus : %d\nGagal : %d\n", jumlahLulus, jumlahGagal);

            if (jumlahLulus > 4){
                System.out.print("Kursus telah berhasil!");
            }
            else{
                System.out.print("Kursus tidak berhasil");
            }
        }
    }
}

