import java.util.Scanner;
public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namaMahasiswa;
        int nilai;
        char grade;

        System.out.print("Masukkan Nama anda : ");
        namaMahasiswa = input.nextLine();
        System.out.print("Masukkan nilai : ");
        nilai = input.nextInt();
if (nilai >= 80) {
            grade = 'A';
        } else if (nilai >= 70) {
            grade = 'B';
        } else if (nilai >= 60) {
            grade = 'C';
        } else if (nilai >= 50) {
            grade = 'D';
        } else {
            grade = 'E';
        }
System.out.println(namaMahasiswa + " mendapatkan nilai " + nilai);
        System.out.println("Grade : " + grade);
    }
}
