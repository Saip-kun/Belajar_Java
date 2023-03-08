import java.util.Scanner;
class LampuLaluLintas {
    public static void main(String [] args) {
    String warna;

        try (Scanner sc = new Scanner (System.in)) {
            System.out.print("Masukkan Warna lampu : ");
                warna =  sc.next();
    }
    if (warna.equals("merah")){
        System.out.println("Berhenti!");
    }else if (warna.equals("kuning")){
        System.out.println("Hati-hati!");
    }else if (warna.equals("hijau")){
        System.out.println("Jalan!");
    }else {
        System.out.println("Warna Salah!");
    }
}
}
