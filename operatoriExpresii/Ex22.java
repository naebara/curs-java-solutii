package operatoriExpresii;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int ultimaCifra = i%10;
        int cifraMijloc = i/10%10;
        int primaCifra = i/100;

        ultimaCifra = ultimaCifra * ultimaCifra;
        cifraMijloc = cifraMijloc * cifraMijloc;
        primaCifra = primaCifra * primaCifra;
        int suma = ultimaCifra + cifraMijloc + primaCifra;

        System.out.println(suma);
    }
}
