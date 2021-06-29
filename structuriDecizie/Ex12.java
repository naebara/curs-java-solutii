package structuriDecizie;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        //Să se scrie un program care citeşte de la tastatură două numere întregi şi
        // verifică dacă cele doua numere au acelaşi semn.
        Scanner scan = new Scanner(System.in);
        System.out.println("Dati 2 numere");
        int x = scan.nextInt(), y = scan.nextInt();
        if (x >= 0 && y >= 0)
            System.out.println("Da");
        else
            System.out.println("Nu");
    }
}
