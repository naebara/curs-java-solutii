package structuriDecizie;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        // Să se scrie un program care determină maximul a două numere întregi citite de la tastatură.
        Scanner scan = new Scanner(System.in);
        System.out.println("Dati 2 numere");
        int x = scan.nextInt();
        int y = scan.nextInt();
        if (x > y)
            System.out.println(x);
        else
            System.out.println(x);
    }
}
