package Java102.MaceraOyunu.Character.Heroes;

import Java102.MaceraOyunu.Character.Heroes.Inheritance.Hero;

import java.util.Random;

public class Samurai extends Hero {

    public Samurai() {
        super(1, "Samuray", 6, 22, 15);
    }

    public static class Main {
        public static void main(String[] args) {
            System.out.println(new Random().nextDouble(0,0.3));

        }
    }
}
