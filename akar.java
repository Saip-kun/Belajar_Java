import java.util.*;
class akar {public static void main(String[]args){
    System.out.println("Menghitung Akar-Akar Persamaan Kuadrat");

    double a;
    double b;
    double c;
    double d;
    double x1;
    double x2;
    try (Scanner nilai = new Scanner(System.in)) {
        System.out.println("Masukkan nilai a : ");
        a = nilai.nextDouble();
        System.out.println("Masukkan nilai b : ");
        b = nilai.nextDouble();
        System.out.println("Masukkan nilai c : ");
        c = nilai.nextDouble();
    }

    d = (b*b)-(4*a*c);
    x1 = (-b + Math.sqrt(d))/2*a;
    x2 = (-b + Math.sqrt(d))/2*a;

    System.out.println("");
    System.out.println(a);
    System.out.println("x^2");
    System.out.println(" + ");
    System.out.println(c);
    System.out.println(" = 0");
    if (d<0){
        System.out.println("Akar Imajiner");
    }else{
        System.out.println("Akar Pertama : " + x1);
        System.out.println("Akar kedua" + x2);
    }
}
}