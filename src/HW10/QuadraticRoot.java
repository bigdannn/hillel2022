package HW10;

public class QuadraticRoot {
    public static void main(String[] args) {

        calculation(-4,28,-49);


    }

    public static  double calculation(double a, double b, double c){
        double Discriminant = Math.pow(b,2) - 4*a*c;
        double answer1 = 0;
        double answer2 = 0;

        if (Discriminant< 0){
            System.out.println("Корней нет");
            return 0;
        } else if (Discriminant == 0){
            System.out.println("Eсть один корень.");
            answer1 = -b/(2*a);
            System.out.println("х = " + answer1);
            return answer1;
        } else {
            System.out.println("Есть два корня.");
            answer1 = (-b+Math.sqrt(Discriminant))/(2*a);
            answer2 = (-b-Math.sqrt(Discriminant))/(2*a);
            System.out.println("х1 = " + answer1 + "; x2 = " + answer2);
            return answer1;
        }
    }
}
