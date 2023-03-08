public class Override {
    public void rasa() {
        System.out.println("Rasa minuman");
    }
}

class Kopi extends Minuman{
    public void rasa() {
        System.out.println("Pahit");
    }
    public static void main(String[] args) {
        Minuman k1 = new Kopi();
        k1.rasa();
    }

}
