package structuriDecizie;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        //Se citește de la tastatură un număr natural de 3 cifre. Să se determine câte cifre impare conține.
        Scanner scan = new Scanner(System.in);
        System.out.println("Dai numar de 3 cifre");
        int x = scan.nextInt();
        int count = 0;
        if (x % 2 == 1)
            count++;
        if (x / 10 % 2 == 1)
            count++;
        System.out.println(count);


    }
}
