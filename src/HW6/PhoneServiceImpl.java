package HW6;

import java.util.Arrays;

public class PhoneServiceImpl implements Callable{

    public void cityCalls(Phone[] phones){
        for (int i = 0; i < phones.length-1; i++) {
            if(phones[i].getCityPhoneCalls() > 50){
                System.out.println(phones[i]);
            }
        }
    };
    public void longDistancePhoneCalls(Phone[] phones){
        for (int i = 0; i < phones.length-1; i++) {
            if(phones[i].getLongDistancePhoneCalls() >= 1){
                System.out.println(phones[i]);
            }
        }
    };
    public void alphabetOrder(Phone[] phones){
        String[] names = new String[phones.length];
        for (int i = 0; i < phones.length; i++) {
            names[i] = phones[i].getFirstName();
        }
        Arrays.sort(names);
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < phones.length; j++) {
                if (names[i].equals(phones[j].getFirstName())) {
                    System.out.println(phones[j]);}}}};

    public void tenBiggestInternetUsers(Phone[] phones){
        int[] biggestInternetUsers = new int[phones.length];
        for (int i = 0; i < biggestInternetUsers.length; i++) {
            biggestInternetUsers[i] = phones[i].getInternetTraffic();}
        System.out.println("----------------");
        Arrays.sort(biggestInternetUsers);
        for (int i = biggestInternetUsers.length-1; 0 <= i; i--) {
            for (int j = 0; j < phones.length; j++) {
                if(biggestInternetUsers[i] == phones[j].getInternetTraffic()){
                    System.out.println(phones[j]);
                }
            }
        }
    };

    @Override
    public void print(Phone[] phones){
        for (Phone n:phones) {
            System.out.println(n);
        }
    };
}
