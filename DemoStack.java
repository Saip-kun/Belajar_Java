import java.util.Scanner;
import java.util.Stack;

public class DemoStack {
    public static void main(String[]args) {
        Stack lifo = new Stack();
        System.out.println("Jumlah Barang yang dimasukkan Stack : ");

        Scanner masuk = new Scanner(System.in);
        String test = masuk.nextLine();
        int x = Integer.parseInt(test);
        for (int a = x; a > 0; --a){
            System.out.print("Masukkan Nama Barang :");
            String test1 =  masuk.nextLine();
            lifo.push(test1);
        }
        System.out.println("Stack : " + lifo);
        System.out.println("top : " + lifo.peek());
        System.out.println("noel : " + lifo.size());

        System.out.print("Jumlah pop : ");
        String b = masuk.nextLine();
        int c = Integer.parseInt(b);
        for (int d = c; d > 0; --d){
            System.out.println("pop : " + lifo.pop());
            System.out.println("Stack : " + lifo.size());
        }
        System.out.println("top : "+ lifo.peek());
        System.out.println("noel : "+ lifo.size());
    }
}
