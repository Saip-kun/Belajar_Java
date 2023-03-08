import java.util.*;

public class Linkedlist{

    Node first;

    class Node{
        String data;
        Node next;

        public Node (String data){
            this.data = data;
        }

        public void tampil(){
            System.out.print(data);
            if(next != null){
                System.out.print(", ");
            }
        }
    }

    public Linkedlist(){
        first = null;
    }

    public boolean isEmpty(){
        return(first == null);
    }

    //methods scanner
    private static Scanner scan(){
        return new Scanner(System.in);
    }

    //menambahkan data
    public void addData(String data){
        Node node, help;
        node = new Node(data);
        node.next = null;

        if(isEmpty()){
            first = node;
            first.next = null;
        }else{
        help = first;
        while(help.next != null){
            help = help.next;
        }
        help.next = node;
    }
}
// menampilkan isi liinked list
public void tampilkan(){
    Node current = first;
    if(current == null){
        System.out.println("Data kosong");
    }else{
        while(current != null){
            current.tampil();
            current = current.next;
        }
    }
}
//mengurutkan isi linked list
public void mengurutkanList(){
    Node current = first;
    Node index = null;
    String temp;
    if(first == null){
        return;
    }else{
        while(current != null){
            index = current.next;
            while(index != null){
                if(current.data.compareTo(index.data) > 0){
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }
}
//mencari dari linked list
public void cariData(String key){
    Node p = first;
    boolean status = false;

    while(p != null){
        if(key.equals(p.data)){
            System.out.println("["  + key +"] terdapat pada list");
            status = true;
            return;
        }
        p = p.next;
    }
    if(status == false){
        System.out.println("[" + key + "] tidak ditemukan");
    }
}
public static void main(String[]args){
    Linkedlist list = new Linkedlist();
    int num = 1;
    System.out.print("Masukan jumlah data : ");
    int banyakData = scan().nextInt();

    System.out.println("Masukan Nama Mahasiswa : ");
    for(int i = 0; i < banyakData; i++){
        System.out.print(num + ". ");
        String inputData = scan().nextLine();
        list.addData(inputData);
        num++;
    }
    System.out.println("====================");
    System.out.println("Data dalam list : ");
    System.out.print("[");
    list.tampilkan();
    System.out.println("]");
    System.out.println("================================");
    System.out.println("Mengurutkan Data dalam list.");
    list.mengurutkanList();
    System.out.print("[");
    list.tampilkan();
    System.out.println("]");

    System.out.println("=================================");
    System.out.println("Data yang ingin dicari :");
    String cari = scan().nextLine();

    list.cariData(cari);
    }
}
