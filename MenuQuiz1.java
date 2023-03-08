import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.util.LinkedList;

public class MenuQuiz1 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        boolean ulang = true;

        System.out.println("\nPROGRAM MENU QUIZ\n");

        do {
            System.out.println("MENU TIPE DATA ABSTRAK:");
            System.out.println("1. Sorting");
            System.out.println("2. Array List");
            System.out.println("3. Linked List");
            System.out.println("4. Binary Tree");
            System.out.println("5. Hash");
            System.out.println("6. Exit Program");
            System.out.print("Masukkan pilihan: ");
            int pilih = userInput.nextInt();

            System.out.println(" ");

            switch (pilih) {
                case 1:
                    sort menuSort = new sort();
                    menuSort.mainMenu1();
                    break;
                case 2:
                    arraylist menuArrayList = new arraylist();
                    menuArrayList.mainMenu2();
                    break;
                case 3:
                    linkedlist menuLinkedList = new linkedlist();
                    menuLinkedList.mainMenu3();
                    break;
                case 4:
                    binarytree menuBinaryTree = new binarytree();
                    menuBinaryTree.mainMenu4();
                    break;
                case 5:
                    hash menuHash = new hash();
                    menuHash.mainMenu5();
                    break;
                case 6:
                    ulang = false;
                    break;
                default:
                    System.out.println("Masukkan Angka 1-7");
                    break;
            }
            System.out.print("Processing...\n");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            System.out.println("\n");
        } while (ulang);
    }
}

// Menu 1_Sort
class sort {

    public static Scanner InputInt = new Scanner(System.in);
    public static Scanner InputString = new Scanner(System.in);
    public static int[] NoArray;
    public static String[] NamaArray;

    public static void SortNama(int daftar) {
        int data, temp, inner, outer;
        String tempnama;
        data = daftar;

        for (outer = 1; outer < data; outer++) {
            temp = NoArray[outer];
            tempnama = NamaArray[outer];
            inner = outer;

            while (inner > 0 && NamaArray[inner - 1].compareTo(tempnama) > 0) {
                NoArray[inner] = NoArray[inner - 1];
                NamaArray[inner] = NamaArray[inner - 1];
                inner -= 1;
            }
            NamaArray[inner] = tempnama;
            NoArray[inner] = temp;
        }

        System.out.println("DAFTAR MAHASISWA SESUAI NAMA\n");
        for (outer = 0; outer < data; outer++) {
            System.out.println("Nama     = " + NamaArray[outer]);
            System.out.println("No.Induk = " + NoArray[outer]);
        }
        System.out.println();

    }

    public static void SortNo(int daftar) {
        int data, temp, inner, outer;
        String tempnama;
        data = daftar;

        for (outer = 1; outer < data; outer++) {
            temp = NoArray[outer];
            tempnama = NamaArray[outer];
            inner = outer;

            while (inner > 0 && NoArray[inner - 1] >= temp) {
                NoArray[inner] = NoArray[inner - 1];
                NamaArray[inner] = NamaArray[inner - 1];
                inner -= 1;
            }
            NoArray[inner] = temp;
            NamaArray[inner] = tempnama;
        }

        System.out.println("DAFTAR MAHASISWA SESUAI NO.INDUK\n");
        for (outer = 0; outer < data; outer++) {
            System.out.println("No.Induk = " + NoArray[outer]);
            System.out.println("Nama     = " + NamaArray[outer]);
        }
        System.out.println();
    }

    public static void mainMenu1() {

        int pilihan = 0, data;
        String nama;

        System.out.println("PROGRAM JAVA SORTING NAMA - NAMA MAHASISWA\n");
        System.out.print("Masukkan jumlah data mahasiswa = ");
        data = InputInt.nextInt();
        NoArray = new int[data];
        NamaArray = new String[data];
        System.out.println("\n==================================================\n");
        System.out.println("DATA MAHASISWA");

        for (int i = 0; i < data; i++) {
            System.out.println("MAHASISWA " + (i + 1));
            System.out.print("Nama     : ");
            NamaArray[i] = InputString.nextLine();
            System.out.print("No.Induk : ");
            NoArray[i] = InputInt.nextInt();
            System.out.println();
        }

        while (pilihan != -1) {
            System.out.println("MENU");
            System.out.println("1. Sorting menurut Nama");
            System.out.println("2. Sorting menurut No.Induk");
            System.out.println("3. Keluar");
            System.out.print("Pilihan = ");
            pilihan = InputInt.nextInt();
            System.out.println();
            switch (pilihan) {
                case 1:
                    SortNama(data);
                    break;
                case 2:
                    SortNo(data);
                    break;
                case 3:
                    System.out.println("Sorting nama mahasiswa telah selesai");
                    pilihan = -1;
                    break;
                default:
                    System.out.println("Pilihan yang anda masukkan salah");
                    pilihan = 0;
                    break;
            }
        }

    }
}

// Menu 2_Array List
class arraylist {
    public static void mainMenu2() {
        ArrayList<String> alist = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan Nama Mahasiswa : ");
            alist.add(scan.nextLine());
        }
        System.out.println("Nama Mahasiswa = " + alist);
    }
}

// Menu 3_Linked List
class linkedlist {
    public static void mainMenu3() {
        LinkedList<String> nama = new LinkedList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("====================================");

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan Nama Mahasiswa : ");
            nama.add(scan.nextLine());
        }

        System.out.println("====================================");
        System.out.println("Nama Mahasiswa (Sebelum Diurutkan) : " + nama);
        nama.sort(String::compareToIgnoreCase);
        System.out.println("Nama Mahasiswa (Setelah Diurutkan) : " + nama);

        System.out.println("====================================");
        System.out.print("Masukkan Nama Yang Ingin Dicari : ");
        String element = scan.nextLine();

        int index = nama.indexOf(element);
        if (index != -1) {
            System.out.println("Nama Mahasiswa ada di index ke-" + index);
        } else {
            System.out.println("Nama Mahasiswa Tidak Ditemukan");
        }
        System.out.println("====================================");
    }
}

// Menu 4_Binary Tree
class BTNode {
    BTNode left, right;
    String data;

    /* Constructor */
    public BTNode() {
        left = null;
        right = null;
        data = "";
    }

    /* Constructor */
    public BTNode(String n) {
        left = null;
        right = null;
        data = n;
    }

    /* Function to set left node */
    public void setLeft(BTNode n) {
        left = n;
    }

    /* Function to set right node */
    public void setRight(BTNode n) {
        right = n;
    }

    /* Function to get left node */
    public BTNode getLeft() {
        return left;
    }

    /* Function to get right node */
    public BTNode getRight() {
        return right;
    }

    /* Function to set data to node */
    public void setData(String d) {
        data = d;
    }

    /* Function to get data from node */
    public String getData() {
        return data;
    }
}

class BT {
    private BTNode root;

    /* Constructor */
    public BT() {
        root = null;
    }

    /* Function to insert data recursively */
    private BTNode insert(BTNode node, String data) {
        if (node == null)
            node = new BTNode(data);
        else {
            if (node.getRight() == null)
                node.right = insert(node.right, data);
            else
                node.left = insert(node.left, data);
        }
        return node;
    }

    /* Function to check if tree is empty */
    public boolean isEmpty() {
        return root == null;
    }

    /* Functions to insert data */
    public void insert(String data) {
        root = insert(root, data);
    }

    /* Function to count number of nodes */
    public int countNodes() {
        return countNodes(root);
    }

    /* Function to count number of nodes recursively */
    private int countNodes(BTNode r) {
        if (r == null)
            return 0;
        else {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }

    /* Function to search for an element */
    public boolean search(String val) {
        return search(root, val);
    }

    /* Function to search for an element recursively */
    private boolean search(BTNode r, String val) {
        if (r.getData().equals(val))
            return true;
        if (r.getLeft() != null)
            if (search(r.getLeft(), val))
                return true;
        if (r.getRight() != null)
            if (search(r.getRight(), val))
                return true;
        return false;
    }

    /* Function for inorder traversal */
    public void inorder() {
        inorder(root);
    }

    private void inorder(BTNode r) {
        if (r != null) {
            inorder(r.getLeft());
            System.out.print(r.getData() + " ");
            inorder(r.getRight());
        }
    }

    /* Function for preorder traversal */
    public void preorder() {
        preorder(root);
    }

    private void preorder(BTNode r) {
        if (r != null) {
            System.out.print(r.getData() + " ");
            preorder(r.getLeft());
            preorder(r.getRight());
        }
    }

    /* Function for postorder traversal */
    public void postorder() {
        postorder(root);
    }

    private void postorder(BTNode r) {
        if (r != null) {
            postorder(r.getLeft());
            postorder(r.getRight());
            System.out.print(r.getData() + " ");
        }
    }
}

/* Class BinaryTree */
class binarytree {

    public static void mainMenu4() {
        Scanner scan = new Scanner(System.in);
        /* Creating object of BT */
        BT bt = new BT();
        /* Perform tree operations */
        System.out.println("Binary Tree Test\n");
        char ch;
        do {
            System.out.println("\nBinary Tree Operations\n");
            System.out.println("1. Masukan");
            System.out.println("2. Cari");
            System.out.println("3. Hitungnodes");
            System.out.println("4. check kosong");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Masukan NIM ");
                    bt.insert(scan.next());
                    break;
                case 2:
                    System.out.println("Masukan NIM yang akan dicari ");
                    System.out.println("Search result : " + bt.search(scan.next()));
                    break;
                case 3:
                    System.out.println("Nodes = " + bt.countNodes());
                    break;
                case 4:
                    System.out.println("Empty status = " + bt.isEmpty());
                    break;
                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            /* Display tree */
            System.out.print("\nPost order : ");
            bt.postorder();
            System.out.print("\nPre order : ");
            bt.preorder();
            System.out.print("\nIn order : ");
            bt.inorder();
            System.out.println("\n\nKamu ingin mau menginput kembali (Ketik y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }
}

// Menu 5_Hash
class hash {
    public static void mainMenu5() {
        Hashtable<String, String> data = new Hashtable<>();
        Scanner userInput = new Scanner(System.in);
        System.out.println("====Program Data Mahasiswa Teknik Infomatika====\n");
        boolean ulang = true;
        do {
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Tampilkan Data");
            System.out.println("4. Cari Data");
            System.out.println("5. Banyaknya Data");
            System.out.println("6. Exit Program");
            System.out.print("Masukkan Pilihan: ");
            int pilih = userInput.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("\nBanyaknya Data: ");
                    int banyak = userInput.nextInt();
                    for (int i = 0; i < banyak; i++) {
                        System.out.print("\n" + (i + 1) + ". Nama : ");
                        String eng = userInput.next();
                        System.out.print("NIM : ");
                        String ind = userInput.next();
                        data.put(eng, ind);
                    }
                    break;
                case 2:
                    System.out.print("\nHapus Nama : ");
                    String hapus = userInput.next();
                    if (data.containsKey(hapus)) {
                        data.remove(hapus);
                        System.out.println("\nData " + hapus + " Berhasil Dihapus");
                    } else {
                        System.out.println("\nGagal Menghapus Data");
                    }
                    break;
                case 3:
                    if (data.isEmpty()) {
                        System.out.println("\nData Kosong.");
                    } else {
                        for (String key : data.keySet()) {
                            System.out.println("\n" + key + "\t=  " + data.get(key));
                        }
                    }
                    break;
                case 4:
                    System.out.print("\nMasukkan Nama yang dicari: ");
                    String cari = userInput.next();
                    boolean ada = false;
                    for (String key : data.keySet()) {
                        if (cari.equalsIgnoreCase(key)) {
                            System.out.println("\n" + key + " dengan NIM " + data.get(key));
                            ada = true;
                        }
                    }
                    if (!ada) {
                        System.out.println("\nNama Tidak Ditemukan");
                    }
                    break;
                case 5:
                    System.out.println("\nIsi Data ada " + data.size() + " Nama");
                    break;
                case 6:
                    ulang = false;
                    break;
                default:
                    System.out.println("Masukkan Angka 1-5");
                    break;
            }
            System.out.print("Processing...\n");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            System.out.println("\n");
        } while (ulang);
    }
}