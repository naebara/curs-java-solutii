package structuriDecizie;

public class Ex6 {
    public static void main(String[] args) {
        //   Să se scrie un program care determină minimul a trei numere întregi, , salvati minimul intr-o variabila
        int x = 5, y = 2, z = 1;
        int min = x;

        if (y < min) {
            min = y;
        }
        if (z < min) {
            min = z;
        }

        System.out.println("Minimul este: " + min);

    }
}
