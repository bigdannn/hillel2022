package HW3;

public class FactorialWhile {
    public static void main(String[] args) {

        int number2 = 7;
        int answer =1;
        int factorial=1;

        while(number2>=factorial){
            answer = answer*factorial;
            System.out.print(factorial +" * ");
            factorial++;
        }
        System.out.print("= " + answer);
    }
}
