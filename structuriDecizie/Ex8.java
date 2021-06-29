package structuriDecizie;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        //Să se scrie un program care citeşte de la tastatură trei numere naturale
        // și determină diferenţa dintre cel mai mare şi cel mai mic
        Scanner scan = new Scanner(System.in);
        System.out.println("Da-ti 3 numere");
        int x = scan.nextInt(), y = scan.nextInt(), z = scan.nextInt();
        int max, min;
        if (x > y && x > z) {
            max = x;
        } else if (y > x && y > z) {
            max = y;
        } else {
            max = z;
        }

        if (x < y && x < z) {
            min = x;
        } else if (y < x && y < z) {
            min = y;
        } else {
            min = z;
        }

        System.out.println("Diferenta dintre cel mai mare numar si cel mai mic este: " + (max - min));


    }
}
