package HW5;

public class Student {

    private int id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private int yearOfBirth;
    private String address;
    private int telephoneNumber;
    private String faculty;
    private int course;
    private int group;


    public Student() {}
    public Student(int id) {
        this.id = id;
    }
    public Student(int id, String firstName) {this.id = id; this.firstName = firstName;}

    public Student(int id, String firstName, String lastName) { this.id = id; this.firstName = firstName; this.lastName = lastName; }

    public Student(int id, String firstName, String lastName, String patronymic) { this.id = id; this.firstName = firstName; this.lastName = lastName; this.patronymic = patronymic; }

    public Student(int id, String firstName, String lastName, String patronymic, int yearOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
    }
    public Student(int id, String firstName, String lastName, String patronymic, int yearOfBirth, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
    }
    public Student(int id, String firstName, String lastName, String patronymic, int yearOfBirth, String address, int telephoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }
    public Student(int id, String firstName, String lastName, String patronymic, int yearOfBirth, String address, int telephoneNumber, String faculty) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.faculty = faculty;
    }
    public Student(int id, String firstName, String lastName, String patronymic, int yearOfBirth, String address, int telephoneNumber, String faculty, int course) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.faculty = faculty;
        this.course = course;
    }
    public Student(int id, String firstName, String lastName, String patronymic, int yearOfBirth, String address, int telephoneNumber, String faculty, int course, int group) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    //Getters
    public int getId(){return id;}
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getPatronymic(){return patronymic;}
    public int getYearOfBirth(){return yearOfBirth;}
    public String getAddress(){return address;}
    public int getTelephoneNumber(){return telephoneNumber;}
    public String getFaculty(){return faculty;}
    public int getCourse(){return course;}
    public int getGroup(){return group;}

    //Setters

    public void setId(int id){this.id = id;}
    public void setFirstName(String firstName){this.firstName = firstName;}
    public void setLastName(String lastName){this.lastName = lastName;}
    public void setPatronymic(String patronymic){this.patronymic = patronymic;}
    public void setDateOfBirth(int yearOfBirth){this.yearOfBirth = yearOfBirth;}
    public void setAddress(String address){this.address = address;}
    public void setTelephoneNumber(int telephoneNumber){this.telephoneNumber = telephoneNumber;}
    public void setFaculty(String faculty){this.faculty = faculty;}
    public void setCourse(int course){this.course = course;}
    public void setGroup(int group){this.group = group;}

    @Override
    public String toString(){
        return "Information about student: ID - " + id + "; First Name - " + firstName + "; Last Name - " + lastName + "; Patronymic - "+ patronymic + "; Year of birth - " + yearOfBirth + "; Address - "+ address + "; Telephone number - " + telephoneNumber + "; Faculty - "+ faculty + "; Course - " + course + "; Groupe -" + group
                ;
    }





}
