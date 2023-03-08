import java.util.Scanner;

public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoubleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addData(String data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void removeData(String data) {
        if (isEmpty()) {
            return;
        }

        if (head.data.equals(data)) {
            head = head.next;
            head.prev = null;
            size--;
            return;
        }

        if (tail.data.equals(data)) {
            tail = tail.prev;
            tail.next = null;
            size--;
            return;
        }

        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                size--;
                return;
            }
            current = current.next;
        }
    }

    public boolean searchData(String data) {
        if (isEmpty()) {
            return false;
        }

        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void sortData() {
        if (isEmpty() || size == 1) {
            return;
        }

        boolean sorted = false;
        while (!sorted) {
            Node current = head;
            sorted = true;
            while (current.next != null) {
                if (current.data.compareTo(current.next.data) > 0) {
                    String temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    sorted = false;
                }
                current = current.next;
            }
        }
    }

    public void showData() {
        if (isEmpty()) {
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void menu() {
        Scanner input = new Scanner(System.in);
        int pilihan = 0;
        while (pilihan != 6) {
            System.out.println("Menu Double Linked List");
            System.out.println("1. Tambah data barang");
            System.out.println("2. Hapus data barang");
            System.out.println("3. Pencarian data barang");
            System.out.println("4. Pengurutan data barang");
            System.out.println("5. Tampil data barang");
            System.out.println("6. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan data barang: ");
                    String data = input.next();
                    addData(data);
                    break;
                case 2:
                    System.out.print("Masukkan data barang yang akan dihapus: ");
                    data = input.next();
                    removeData(data);
                    break;
                case 3:
                    System.out.print("Masukkan data barang yang dicari: ");
                    data = input.next();
                    if (searchData(data)) {
                        System.out.println("Data ditemukan");
                    } else {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;
                case 4:
                    sortData();
                    break;
                case 5:
                    showData();
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan program ini");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
    }

    private class Node {
        String data;
        Node prev;
        Node next;

        public Node(String data) {
            this.data = data;
            prev = null;
            next = null;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.menu();
    }
}
