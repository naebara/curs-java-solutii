package structuriDecizie;

public class Ex5 {
    public static void main(String[] args) {
        // La un concurs pot participa copii cu vârste între a și b inclusiv.
        // Gigel are n ani. Stabiliți dacă poate participa la concurs.
        int varstaMinima = 7, varstaMaxima = 12, varstaGigel = 14;
        if (varstaGigel >= varstaMinima && varstaGigel <= varstaMaxima)
            System.out.println("Poate participa");
        else
            System.out.println("Nu poate participa");
    }
}
