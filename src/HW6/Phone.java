package HW6;

public class Phone {
    private int id;
    private String surname;
    private String firstName;
    private String patronymic;
    private String address;
    private int phoneNumber;
    private String creditCardNumber;
    private int debit;
    private int credit;
    private int cityPhoneCalls;
    private int longDistancePhoneCalls;
    private int internetTraffic;

    public Phone(int id, String surname, String firstName, String patronymic, String address, int phoneNumber, String creditCardNumber,int debit , int credit, int cityPhoneCalls, int longDistancePhoneCalls, int internetTraffic){
        this.id = id;
        this.surname = surname;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.creditCardNumber = creditCardNumber;
        this.debit = debit;
        this.credit = credit;
        this.cityPhoneCalls = cityPhoneCalls;
        this.longDistancePhoneCalls = longDistancePhoneCalls;
        this.internetTraffic = internetTraffic;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getCityPhoneCalls() {
        return cityPhoneCalls;
    }

    public void setCityPhoneCalls(int cityPhoneCalls) {
        this.cityPhoneCalls = cityPhoneCalls;
    }

    public int getLongDistancePhoneCalls() {
        return longDistancePhoneCalls;
    }

    public void setLongDistancePhoneCalls(int longDistancePhoneCalls) {
        this.longDistancePhoneCalls = longDistancePhoneCalls;
    }

    public int getInternetTraffic() {
        return internetTraffic;
    }

    public void setInternetTraffic(int internetTraffic) {
        this.internetTraffic = internetTraffic;
    }

    @Override
    public String toString(){
        return "ID: " + id + "; Surname - " + surname + "; First name - " + firstName + "; patronymic - " + patronymic +
                "; address - " + address + "; Phone number - " + phoneNumber + "; Credit Card Number - " + creditCardNumber +
                "; Debit - " + debit + "thousand hryvnas; Credit - " + credit + "thousand hryvnas ; City Phone calls - "
                + cityPhoneCalls + "minutes ; Long distance phone calls - " + longDistancePhoneCalls
                + "minutes ; Internet Traffic - " + internetTraffic + "MB/s";
    }
}
