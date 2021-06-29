package structuriDecizie;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // Să se scrie un program care citeşte de la tastatură un număr natural şi verifică dacă numărul este par sau impar.
        Scanner scan = new Scanner(System.in);
        System.out.println("Dai numar ");
        int x = scan.nextInt();
        if (x % 2 == 0)
            System.out.println("este par");
        else
            System.out.println("este impar");
    }
}
