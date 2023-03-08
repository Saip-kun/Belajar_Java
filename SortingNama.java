import java.util.Scanner;
public class SortingNama {
public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       int banyak,a;
       String tempnama;
       System.out.print("Masukkan banyak mahasiswa yang akan diinput: ");
       banyak = input.nextInt();
       String nama[]= new String[banyak];

       for(;;){
        System.out.println("\n-----PILIHAN MENU-----\n");
        System.out.println("Pilihlah salah satu menu dibawah ini");
        System.out.println("1. Masukkan Data Mahasiswa ");
        System.out.println("2. Tampilkan Data Urut Berdasarkan Nama");
        System.out.println("3. Keluar");
        System.out.print("\nPilihan Anda: ");
        a = input.nextInt();
   switch(a){
       case 1: System.out.println("\nMasukkan data mahasiswa (Nama) ");
               for (int x = 0;x<banyak;x++){
                System.out.print("Nama Mahasiswa "+(x+1)+" : ");
                       nama[x]=input.next();
      System.out.print("\n");
               }
               break;
               case 2: for ( int d = 0; d<banyak;d++){
                for( int b = 1; b<banyak; b++){
                    if ( nama [b-1].compareTo(nama[b])>0){
                        tempnama = nama[b-1];
                        nama [b-1]= nama [b];
                        nama[b] = tempnama;
                    }
                }
            }
    System.out.println("Data Mahasiswa Berdasarkan Nama :");
    for (int c = 0;c<banyak;c++){
        System.out.println(" " +nama[c]);
    }
                break;
                case 3: System.exit(0);
           default: System.out.println("Pilihan tidak ada di menu");
        }
    }
    }
}