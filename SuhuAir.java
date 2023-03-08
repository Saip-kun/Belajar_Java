import java.util.Scanner;
class SuhuAir {
public static void main(String[] args) {
    int t;
    try (Scanner sc = new Scanner (System.in)) {
        System.out.print("Masukkan suhu air : ");
            t =  sc.nextInt();
    } 
    if (t>100){
        System.out.println("Wujud air = Gas");
    }else if (t>=0){
        System.out.println("Wujud air = Cair");
    }else {
        System.out.println("Wujud air = Padat");
    }
}    
}
