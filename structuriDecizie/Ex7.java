package structuriDecizie;

public class Ex7 {
    public static void main(String[] args) {
//        Fiind date vârstele a doi copii afișați care dintre ei este cel mai mare și cu cât.
        int copil1 = 12;
        int copil2 = 15;

        if(copil1 > copil2){
            System.out.println(copil1 + " e mai mare cu " + (copil1 - copil2));
        }else{
            System.out.println(copil2 + " e mai mare cu " + (copil2 - copil1));
        }
    }
}
