package structuriDecizie;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) throws Exception {
        //Scrieți un program care citește un număr natural nenul n
        // și care afișează numele lunii calendaristice corespunzătoare numărului n
        Scanner scan = new Scanner(System.in);
        System.out.println("Dai numar intre 1 si 12");
        int x = scan.nextInt();
        if (x <= 0 || x > 12)
            System.out.println("Numar gresit");
        if (x == 1)
            System.out.println("Luna Ianuarie");
        else if (x == 2)
            System.out.println("Luna Februarie");
        else if (x == 3)
            System.out.println("Luna Martie");
        else if (x == 4)
            System.out.println("Luna Aprilie");
        else if (x == 5)
            System.out.println("Luna Mai");
        else if (x == 6)
            System.out.println("Luna Iunie");
        else if (x == 7)
            System.out.println("Luna Iulie");
        else if (x == 8)
            System.out.println("Luna August");
        else if (x == 9)
            System.out.println("Luna Septembrie");
        else if (x == 10)
            System.out.println("Luna Octombrie");
        else if (x == 11)
            System.out.println("Luna Noiembrie");
        else if (x == 12)
            System.out.println("Luna Decembrie");


    }
}
