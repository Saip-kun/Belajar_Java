public class NestedIf {
    public static void main(String[] args) {
        double uang = 10000;
        double barang =  15000;

        if (uang >= barang){
            if (uang > barang * 6)
                System.out.println("Anda bisa membeli 6 kali barang");
            else if (uang >= barang * 5)
                System.out.println("Hanya bisa membeli 5 barang saja");
            else if (uang >= barang * 4)
                System.out.println("Hanya bisa membeli 4 barang saja");
            else if (uang >= barang * 3)
                System.out.println("Hanya bisa membeli 3 barang saja");
            else if (uang >= barang * 2)
                System.out.println("Hanya bisa membeli 2 barang saja");
            else if (uang >= barang)
                System.out.println("Hanya bisa membeli 1 barang saja");
        }   else
                System.out.println("Uang anda tidak cukup");
            System.out.println("Alhamdulillah");
    }
}
