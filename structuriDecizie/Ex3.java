package structuriDecizie;

public class Ex3 {
    public static void main(String[] args) {
        //  Determinați câte sticle de x litri cu apă trebuie deschise pentru a umple un vas de y litri.
        int x = 2;
        int y = 11;
        if (y % x == 0)
            System.out.println(y / x);
        else
            System.out.println(y / x + 1);
    }
}
