package Latihan;

abstract class LivingThing {
    public void breath(){
        System.out.println("Bernafas Melalui Hidung.");
    }
    public void eat(){
        System.out.println("Makan Melalui Mulut.");
    }
    public abstract void walk();
}

class Human extends LivingThing {
    public void walk(){
        System.out.println("Berjalan Dengan 2 Kaki.");
    }
}

class Cat extends LivingThing {
    public void walk(){
        System.out.println("Berjalan Dengan 4 Kaki.");
    }
}

public class latihan1 {
    public static void main(String[] args) {
        Human manusia = new Human();
        Cat kucing = new Cat();

        System.out.println("Manusia : ");
        manusia.breath();
        manusia.eat();
        manusia.walk();
        
        System.out.println();

        System.out.println("Kucing : ");
        kucing.breath();
        kucing.eat();
        kucing.walk();
    }    
}
