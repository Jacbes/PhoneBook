package dev.jacbes;

public class Main {
    public static void main(String[] args) {
        Person van = new Person("Van", "Broskov", "88008004455", "Novosibirsk");
        Company eltex = new Company("Eltex", "89003335566", "Moscow");
        van.call();
        eltex.call();
        System.out.println(van);
        System.out.println(eltex);
    }
}
