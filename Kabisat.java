import java.util.Scanner;
class kabisat {public static void main(String[]args){
    int tahun;
    try (Scanner scan = new Scanner(System.in)) {
        System.out.println("Masukkan tahun : ");
        tahun = scan.nextInt();
    }


    if(tahun%400 == 0){
        System.out.println(tahun+" merupakan tahun kabisat\n");
    }else if (tahun%100 == 0){
        System.out.println(tahun+" bukan merupakan tahun kabisat\n");
    }else if (tahun%4 == 0){
        System.out.println(tahun+" merupakan tahun kabisat\n");
    }else {
        System.out.println(tahun+" bukan merupakan tahun kabisat");
    }
}
}