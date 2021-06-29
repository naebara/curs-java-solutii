package operatoriExpresii;

public class Ex24 {
    public static void main(String[] args) {
        int a = 234;
        a = a/10; // 23
        int uc = a% 10;
        int pc = a/10;

        int produs = uc * pc; // ultima cifra * prima cifra
        System.out.println("Produsul este : " + produs);
    }
}
