import java.util.Scanner;
import java.util.TreeSet;

public class TreesetNama {
    public static void main(String args[]) {
        System.out.println("Program Treeset Nama Mahasiswa\n");
        // TreeSet of String Type
        TreeSet<String> treeSetNama = new TreeSet<String>();
        // Adding elements from console to TreeSet<String>
        Scanner input = new Scanner(System.in);
        Scanner read = new Scanner(System.in);
        System.out.print("Jumlah mahasiswa? ");
        int jumlahNama = input.nextInt();

        for (int i = 0; i < jumlahNama; i++) {
            System.out.print("\tMasukkan nama: ");
            String name = read.nextLine();
            treeSetNama.add(name);
        }

        // Displaying TreeSet
        System.out.println("\nIsi Treeset: " + treeSetNama);

        input.close();
        read.close();
    }
}