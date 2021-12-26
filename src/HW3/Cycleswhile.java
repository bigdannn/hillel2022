package HW3;

public class Cycleswhile {

    //


    public static void main(String[] args) {

        int number = 100;
        int counter = 0;

        while(number>counter){
            if (!(counter % 2 ==0)){
                System.out.println(counter);
            }
            counter++;
        }
    }
}
