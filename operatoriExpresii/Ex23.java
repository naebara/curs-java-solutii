package operatoriExpresii;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();

        int ultimaCifra = i % 10;
        int primaCifra = i / 10;
        int suma = ultimaCifra + primaCifra;
        System.out.println("Suma este : " + suma);
    }
}
