import java.util.Scanner;

public class SearchMahasiswa {
    String nim, nama;
    Scanner getdata = new Scanner(System.in);

    public void setdata() {
        System.out.print("Masukkan Nama      : ");
        this.nama = getdata.nextLine();
        System.out.print("Masukkan NIM       : ");
        this.nim = getdata.nextLine();
    }

    public String getnim() {
        return this.nim;
    }

    public void tampil() {
        System.out.println("Nama        : " + this.nama);
        System.out.println("NIM         : " + this.nim);
    }

    public static void main(String[] args) {
        Scanner getint = new Scanner(System.in);
        int a, z = 0, menu = 0, ketemu;
        String nim;
        SearchMahasiswa[] mhs = new SearchMahasiswa[100];
        Scanner getdata = new Scanner(System.in);
        while (menu != 4) {
            System.out.print("Menu...\n1.input\n2.view\n3.search\n4.exit\npilihan : ");
            menu = getint.nextInt();
            if (menu == 1) {
                z++;
                mhs[z] = new SearchMahasiswa();
                mhs[z].setdata();
            } else if (menu == 2) {
                if (z < 1) {
                    System.out.println("Data Masih Kosong");
                } else {
                    a = 0;
                    while (a < z) {
                        a++;
                        System.out.println("---" + a + "---");
                        mhs[a].tampil();
                    }
                }
            } else if (menu == 3) {
                if (z < 1) {
                    System.out.println("Data Masih Kosong");
                } else {
                    System.out.print("Masukkan npm yang dicari : ");
                    nim = getdata.nextLine();
                    a = 0;
                    ketemu = 0;
                    while (a < z) {
                        a++;
                        if (nim.equals(mhs[a].getnim())) {
                            mhs[a].tampil();
                            ketemu++;
                        }
                    }
                    if (ketemu < 1)
                        System.out.println("Data Yang Anda Cari Mungkin Tidak Ada");
                }
            } else if (menu == 4) {
                System.out.println("Keluar...");
            } else {
                System.out.println("Masukkan Menu Yang Tersedia");
            }
        }
    }
}
