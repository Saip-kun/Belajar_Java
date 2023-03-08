import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistNama {
    public static void main(String[] args) {
        System.out.println("Program Arraylist Nama Mahasiswa\n");
        ArrayList<String> arrayListNama = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        Scanner read = new Scanner(System.in);
        System.out.print("Berapa nama mahasiswa? ");
        int jumlahNama = input.nextInt();

        // masukkan nama ke dalam Arraylist
        System.out.println("Masukkan Nama");
        for (int i = 0; i < jumlahNama; i++) {
            System.out.print("\tNama ke-" + (i + 1) + ": ");
            String nama = read.nextLine();
            arrayListNama.add(nama);
        }

        // tampilkan Arraylist
        System.out.println("\nDaftar nama dalam Arraylist: " + arrayListNama);

        input.close();
        read.close();
    }
}