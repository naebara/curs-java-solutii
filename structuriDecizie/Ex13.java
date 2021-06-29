package structuriDecizie;

public class Ex13 {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        char operatie = '+';
        if(operatie == '+'){
            System.out.println(a + b);
        }else if(operatie == '-'){
            System.out.println(a - b);
        }else if(operatie == '/'){
            System.out.println(a / b);
        }else if (operatie == '*'){
            System.out.println(a * b);
        }else{
            System.out.println("Simbol invalid");
        }
    }
}
