package HW6;

public class PhoneRun {
    public static void main(String[] args) {

        Phone[] phones = PhonesGenerator.generatePhone();

        new PhoneServiceImpl().print(phones);
        System.out.println("---------------------------------------");

        System.out.println("Used more than 50 minutes on city phone calls.");
        new PhoneServiceImpl().cityCalls(phones);
        System.out.println("---------------------------------------");

        System.out.println("Used the service of long-distance calls");
        new PhoneServiceImpl().longDistancePhoneCalls(phones);
        System.out.println("---------------------------------------");

        System.out.println("Subscriber information in alphabetical order.");
        new PhoneServiceImpl().alphabetOrder(phones);
        System.out.println("---------------------------------------");

        System.out.println("Biggest internet users.");
        new PhoneServiceImpl().tenBiggestInternetUsers(phones);
    }
}
