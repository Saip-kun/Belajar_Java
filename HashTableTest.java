import java.util.Hashtable;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Scanner;

public class HashTableTest {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Enumeration names;
        String key;

        Hashtable<String, String> hashtable = new Hashtable<String, String>();

        System.out.println("=================== KAMUS ISTILAH INFORMATIKA==================");

        hashtable.put("Agile",
                "Agile adalah pendekatan software development yang mempercepat proses kerja. Dengan metode ini, kamu akan bekerja dalam porsi yang kecil-kecil tetapi mudah diselesaikan.");
        hashtable.put("API",
                "API adalah istilah dalam programming yang merupakan singkatan dari Application Programming Interface.");
        hashtable.put("AJAX",
                "ynchronous JavaScript and XML (AJAX) adalah teknik yang memungkinkan XMLHttpRequest object untuk berkomunikasi dengan server.");
        hashtable.put("Bug", "ug didefinisikan sebagai masalah yang terjadi dalam kode pemrogramanmu.");
        hashtable.put("Wireframe", "wireframe adalah purwarupa sebuah desain web atau aplikasi.");
        hashtable.put("Compiling", "Proses penerjemahan ke bahasa mesin");
        hashtable.put("Coding", "Penulisan Program");
        hashtable.put("Flow Chart", "Salah satu tool untuk mereferensikan algoritma");
        hashtable.put("Gateway", "Sebuah mekanisme yang menyediakan akses ke sebuahsistem lain yang terhubung dalam sebuah network");
        hashtable.put("HTML", "Hyper Text Markup Language yaitu bahasa pemograman untuk membuat web");

        // Print the Hashtable object.
        System.out.println("DAFTAR ISTILAH DALAM KAMUS\t:");
        Enumeration enu = hashtable.keys();
        while(enu.hasMoreElements()){
            System.out.println(""+enu.nextElement());
        }
        System.out.println("\nMASUKKAN ISTILAH INFORMATIKA YANG ANDA CARI : \t");
        String cari = input.nextLine();
        System.out.println("----------------------------------------------------------------");
		System.out.println(" |"+cari+ "| adalah  " +hashtable.get(cari));
		System.out.println("----------------------------------------------------------------");

	}
}
