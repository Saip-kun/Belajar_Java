import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

class maku {
    private int No;
    private String menu;
    // private String kantin;
    private double harga;
    private maku next;

    public maku(int No, String menu, double harga) {
        this.No = No;
        this.menu = menu;
        // this.kantin = kantin;
        this.harga = harga;
        this.next = null;
    }

    public int getNo() {
        return No();
    }

    public String getMenu() {
        return menu;
    }

    // public String getKantin(){
    // return kantin;
    // }

    public double getHarga() {
        return harga;
    }

    public maku getNext() {
        return next;
    }

    public void setNext(maku next) {
        this.next = next;
    }
}

class Maku {
    private maku head;
    private maku tail;
    private int size;

    public Maku() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // add menu
    public void addMenu(maku menu) {
        if (head == null) {
            head = menu;
            tail = menu;
        } else {
            tail.setNext(menu);
            tail = menu;
        }
        size++;
    }

    // head of LL
    public maku getHead() {
        return head;
    }

    // update status
    public void updateMenu(int No) {
        maku current = head;
        while (current != null) {
            if (current.getNo() == No) {
                current.setNext(new maku(newNo));
                break;
            }
            current = current.getNext();
        }
    }

    public void deleteMenu(String menu) {
        maku current = head;
        maku prev = null;
        while (current != null) {
            if (current.getMenu().equals(menu)) {
                if (prev == null) {
                    head = current.getNext();
                } else {
                    prev.setNext(current.getNext());
                }
                size--;
                return;
            }
            prev = current;
            current = current.getNext();
        }
    }

    public void search(int NoPesan) {
        maku current = head;
        while (current != null) {
            if (current.getNo() == No) {
                System.out.println("no : " + current.getNo());
                System.out.println("menu : " + current.getMenu());
                System.out.println("harga : " + current.getHarga());
                return;
            }
            current = current.getNext();
        }
        System.out.println("no pesanan tidak ada");
    }

    public void viewMenu() {
        maku current = head;
        while (current != null) {
            System.out.println("menu : " + current.getMenu());
            System.out.println("harga : " + current.getHarga());
        }
    }

    public void viewPesanan() {
        maku current = head;
        while (current != null) {
            System.out.println("no : " + current.getNo());
            System.out.println("menu : " + current.getMenu());
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Makulist makulist = new Makulist();
        int pilih;

        do {
            System.out.println("1. tambah menu");
            System.out.println("2. tampilkan menu");
            System.out.println("3. hapus menu");
            System.out.println("4. tampilkan pesanan masuk");
            System.out.println("5. update status pesanan");
            System.out.println("6. cari no pesanan");
            System.out.println("7. urutkan no pesanan");
            System.out.println("8. kantin tutup");
            System.out.println("9. PANEL PESANAN");
            System.out.println("input pilihan ==> ");
            pilih = in.nextInt();
            in.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("menu yang ingin ditambah : ");
                    String menu = in.nextLine();
                    System.out.println("harga                    : ");
                    double harga = in.nextDouble();
                    in.nextLine();
                    makulist.addMenu(new maku(menu, harga));
                    break;
                case 2:
                    // view menu
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Menu");
                    makulist.viewMenu();
                    break;
                case 3:
                    // hapus menu
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Hapus menu ");
                    System.out.println("menu apa ? ");
                    menu = in.nextLine();
                    makulist.deleteMenu(menu);
                    break;
                case 4:
                    // view pesanan masuk
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Pesanan");
                    makulist.viewPesanan();
                    break;
                case 5:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Update status pesanan");
                    makulist.viewPesanan();
                    System.out.println("no pesanan :");
                    menu = in.nextLine();
                    System.out.println("Status pesanan : ");
                    break;
                // jadi pake if else kalo ketik y nanti di view pesanan hilang
                case 6:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("cari pesanan");
                    System.out.println("no : ");
                    No = in.nextInt();
                    makulist.search(No);
                    break;
                case 7:
                    System.out.println("urutan no pesanan");
                    List<maku> list = new ArrayList<>();
                    maku current = makulist.getHead();
                    while (current != null) {
                        list.add(current);
                        current = current.getNext();
                    }
                    Collections.sort(list, new Comparator<maku>() {
                        @Override
                        public int compare(maku o1, maku o2) {
                            return o1.getNo().compareTo(o2.getNo());
                        }
                    });
                    for (maku menu : list) {
                        System.out.println("no : " + menu.getNo());
                        System.out.println("menu: " + menu.getMenu());
                        System.out.println("harga: " + menu.getHarga());
                    }

                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (pilih != 9);
    }
}