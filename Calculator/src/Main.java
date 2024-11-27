import java.util.Scanner;

public class Main {
    static int firstNumber;
    static int thirdNumber;
    static int finalNumber;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        firstNumber = input.nextInt();

        System.out.print("Введите знак операции (+;-;*;/): ");
        String secondNumber = input.next();
        int changing = secondNumber.charAt(0);


        System.out.print("Введите второе число: ");
        thirdNumber = input.nextInt();
        if (thirdNumber == 0 && changing == '/') {
            System.out.println("Делить на ноль нельзя!");
        }
        calculate(changing);
    }
    public static void calculate(int changing) {

        switch (changing) {
            case '+':
                finalNumber = firstNumber + thirdNumber;
                System.out.println("Итого: " + finalNumber);
                break;
            case '-':
                finalNumber = firstNumber - thirdNumber;
                System.out.println("Итого: " + finalNumber);
                break;
            case '*':
                finalNumber = firstNumber * thirdNumber;
                System.out.println("Итого: " + finalNumber);
                break;
            case '/':
                finalNumber = firstNumber / thirdNumber;
                System.out.println("Итого: " + finalNumber);
                break;
            default:
                System.out.println("Вы ввели неверный знак");

        }
    }
}




