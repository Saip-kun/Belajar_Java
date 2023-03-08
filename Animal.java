class Animal {
    public void sound(){
        System.out.println("Binatang Bersuara");
    }
}

class Horse extends Animal{
    public void sound(){
        System.out.println("Meringik");
    }
    public static void main(String[]args) {
        Animal obj =  new Horse();
        obj.sound();
    }
}
