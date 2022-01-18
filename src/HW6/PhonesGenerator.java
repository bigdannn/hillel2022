package HW6;

public class PhonesGenerator {

        public static Phone[] generatePhone(){
            Phone[] phones = new Phone[6];

            phones [0] = new Phone(1,"Chicha","Ivan", "Ivanov", "Dovzhenko 29-A",
                    5735759, "5475637388449102", 7455, 4866, 25, 10,
                    600);
            phones[1] = new Phone(2,"Chicha","Petr", "Petrovich", "Dovzhenko 29-A",
                    5735759, "5475637388449102", 7455, 4866, 50, 20,
                    1000);
            phones[2] = new Phone(3,"Chicha","Mark", "Markovich", "Dovzhenko 29-A",
                    5735759, "5475637388449102", 7455, 4866, 70, 0,
                    200);
            phones[3] = new Phone(4,"Chicha","Bogdan", "Bogdanovich", "Dovzhenko 29-A",
                    5735759, "5475637388449102", 7455, 4866, 30, 15,
                    700);
            phones[4] = new Phone(5,"Chicha","Aleksandr", "Aleksandrovich", "Dovzhenko 29-A",
                    5735759, "5475637388449102", 7455, 4866, 55, 50,
                    1100);
            phones[5] = new Phone(6,"Chicha","Nikita", "Nikitich", "Dovzhenko 29-A",
                    5735759, "5475637388449102", 7455, 4866, 10, 5,
                    300);

            return phones;
        }
    }

