package operatoriExpresii;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("N este: ");
        int n = s.nextInt();
        int sumaZecilorSiUnitatilor = (n/10)%10 + n%10;
        System.out.println(sumaZecilorSiUnitatilor);

    }
}
