import java.util.Scanner;
public class QueueBimbingan<T> {
    public static void main(String[] args) {
        QueueBimbingan<String> antrian = new QueueBimbingan<String>();
        Scanner input = new Scanner(System.in);
        int jumlah;
       
        System.out.print("Masukkan jumlah orang yang ingin mengikuti bimbingan : ");
        jumlah = input.nextInt();
        System.out.println("Masukkan nama : ");
        for (int x = 0;x <= jumlah;x++){
            antrian.enqueue(input.nextLine());
        }
        for (int x = 0;x <= jumlah;x++){
            System.out.println("\nAntrian : " + antrian.toString());
            antrian.dequeue();
        }
    }
    private class Node{
        T item;
        Node next;
       
        Node(T t) {
            item = t;
            next = null;
        }
        public String toString () {
            return item.toString();
            }
    }
    private Node first, last;
       
    QueueBimbingan() {
        first = null;
        last = null;
    }
    public boolean isEmpty() {
        return first == null;
    }
    public void enqueue(T t) {
    Node oldLast = last;
    last = new Node(t);
    if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
    }
    public T dequeue () {
        if (isEmpty()) {
            first = null;
        }
        if (first == last) {
            T t = (T) first.item;
            first = last = null;
            return t;
        }
        T t = (T) first.item;
        first = first.next;
        return t;
    }
    public String  toString() {
        if (first == null) {
        return null;
        }
        if (first == last) {
        return first.item.toString();
        }
        StringBuffer sb = new StringBuffer();
        Node cur = first;
        while (cur != last) {
        sb.append(cur.item.toString() + " ");
        cur = cur.next;
        }
        sb.append(last.item.toString());
        return sb.toString();
    }
}
