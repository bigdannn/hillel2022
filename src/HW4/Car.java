package HW4;

public class Car {

    double fuelConsumption = 100 / 8;
    int volumeOfTheTank = 70;


    public static void main(String[] args) {

        double a =0; //Переменая для хранения значений потраченого топлива
        double refuel = 0;//Переменая для хранения общего объема дозаправленых литров топлива.
        double fuelPrice = 27.89;// Цена за литр бензина
        int volumeOfTheTank = 70;// Объем бака
        double restIndestination =0;//Остаток топлива в конечном пункте назначения.

        /*Предположим, что до начала путшествия у нас было 20л. тполива и мы дозаправились до полного бака
        до Кривого Озера от Одессы ехать 187 км.
        */
        refuel += fullTheTank(20);
        a = overcomingTheDistance(187, 70);

        refuel += fullTheTank(a);

        a = overcomingTheDistance(160, 70);
        refuel += fullTheTank(a);

        a = overcomingTheDistance(150, 70);
        restIndestination = volumeOfTheTank - fullTheTank(a);

        double fuelSpending = refuel*fuelPrice;
        System.out.println("По-прибытию в Киев у нас осталось " + restIndestination + " л. топлива");
        System.out.println("За всю поездку мы заправили " + refuel+ " л. топлива, что обошлось нам в " + fuelSpending + " грн.");

        refueling(490, 55);

    }

    public static double fullTheTank(double fuelRest) {
        //залить полный бак с учетом объема остатка
        int volumeOfTheTank = 70;
        double fullTank = volumeOfTheTank - fuelRest;
        System.out.println("До полного бака нужно до залить " + fullTank + " л. тполива.");
        System.out.println();
        return fullTank;
    }

    public static double overcomingTheDistance(double distance, double fuelRest) {

        //определить остаток топлива по преодолении N км
        double fuelConsumption = 100 / 10;
        int volumeOfTheTank = 70;
        double rest2 = ((fuelConsumption * fuelRest) - (distance)) / fuelConsumption;

        System.out.println("Из имевшихся " + fuelRest + " л. топлива останеться  " + rest2 + " л. после преодоления " + distance + " км.");
        System.out.println();
        return rest2;
    }

    public static void refueling(double distance, double fuelRest) {
        double fuelConsumption = 100 / 10;
        double fuelToAdd = (distance - (fuelRest * fuelConsumption)) / fuelConsumption;

        if (fuelToAdd < 0){
            System.out.println("Имеющегося топлива полностью хватит на дистанцию " + distance + " км.");
        } else {
            System.out.println("К имеющимся " + fuelRest + " л. топлива необходимо до заправить " + fuelToAdd + " л., чтобы преодолеть дистанцию в " + distance + " км.");
        }

        System.out.println();
    }
}
