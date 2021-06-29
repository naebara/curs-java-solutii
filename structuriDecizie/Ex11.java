package structuriDecizie;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        //Se citește de la tastatură un număr natural de 3 cifre. Să se stabilească dacă are toate cifrele egale.
        Scanner scan = new Scanner(System.in);
        System.out.println("Scrie nuamr de 3 cifre");
        int x = scan.nextInt();
        int ultimaCifra = x%10;
        int cifraMijloc = x/10%10;
        int primaCifra = x/100;
        if (primaCifra == cifraMijloc && cifraMijloc == ultimaCifra)
            System.out.println("sunt egale");
        else
            System.out.println("nu sunt egale");
    }
}

