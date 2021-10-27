import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter number1:");
        int number1 = reader.nextInt();

        System.out.println("Enter number2:");
        int number2 = reader.nextInt();

        int GCD = (number1<number2) ? number1 : number2;
        while (true){
            if (number1%GCD == 0 && number2%GCD == 0){
                System.out.println("The GCD of " + number1 +"and " + number2 + " is " + GCD);
                break;
            }
            else{
                --GCD;
            }
        }
    }
}
