package dev.jacbes;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person van = new Person("Van", "Broskov", "88008004455", "Novosibirsk");
        Company eltex = new Company("Eltex", "89003335566", "Moscow");
        van.call();
        eltex.call();
        System.out.println(van);
        System.out.println(eltex);

        try {
            FileReader fileReader = new FileReader("src/dev/jacbes/importUsers.txt");
            Scanner scanner = new Scanner(fileReader);

            while (scanner.hasNextLine()) {
                List<String> information = Arrays.asList(scanner.nextLine().split(";"));
                if (information.size() == 4) {
                    Person person = new Person(information.get(0), information.get(1), information.get(2), information.get(3));
                    System.out.println(person);
                    person.call();
                }
                if (information.size() == 3) {
                    Company company = new Company(information.get(0), information.get(1), information.get(2));
                    System.out.println(company);
                    company.call();
                }
            }

            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
