package HW5;

public class Students {
    public static void main(String[] args) {

       Student[] students = new Student[10];

        Student igor = new Student(62353466, "Igor", "Procofiev", " Mihailovich", 1999, "Vilyamsa, 29", 952995522, "Economic", 4, 33);
        students[0] = igor;

        Student lev = new Student(453453466, "Lev", "Myau", " Mihailovich", 2001, "Vilyamsa, 29", 952995522, "Philosophy", 3, 23);
        students[1] = lev;

        Student max = new Student(23453466, "Max", "Marky", "Nikitich", 2002, "Vilyamsa, 29", 952995522, "Philosophy", 1, 11);
        students[2] = max;

        Student nikita = new Student(9573466, "Nikita", "Ivanov", "Nikitich", 2000, "Vilyamsa, 29", 952995522, "Economic", 2, 20);
        students[3] = nikita;

        Student mark = new Student(23453466, "Mark", "Markovich", "Nikitich", 1998, "Vilyamsa, 29", 952995522, "Physic", 5, 54);
        students[4] = mark;

        Student danil = new Student(23453466, "Danil", "Dmitriev", "Nikitich", 2001, "Vilyamsa, 29", 952995522, "Math", 3, 311);
        students[5] = danil;

        Student dima = new Student(23453466, "Dima", "Dmitriev", "Nikitich", 2000, "Vilyamsa, 29", 952995522, "Programming", 3, 5);
        students[6] = dima;

        Student ilya = new Student(23453466, "Ilya", "Illich", "Levin", 1997, "Vilyamsa, 29", 952995522, "Programming", 6, 1);
        students[7] = ilya;

        Student georg = new Student(23453466, "Georgiy", "Georgiyovich", "Nikitich", 2001, "Vilyamsa, 29", 952995522, "Medical", 2, 21);
        students[8] = georg;

        Student marat = new Student(23453466, "Marat", "Ahmetovich", "Nikitich", 2000, "Vilyamsa, 29", 952995522, "Medical", 3, 32);
        students[9] = marat;

        System.out.println("Students of the Economic faculty:");
        for (int i = 0; i < students.length -1 ; i++) {
            if (students[i].getFaculty().equals("Economic")){
                System.out.println(students[i]);}}

        System.out.println();

        System.out.println("First-year students of the Faculty of Philosophy:");
        for (int i = 0; i < students.length-1; i++) {
            if(students[i].getFaculty().equals("Philosophy")){
                if (students[i].getCourse() == 1){
                    System.out.println(students[i]);}}
        }
        System.out.println();


        System.out.println("Students, who were born after year 2000:");
        for (int i = 0; i < students.length-1; i++) {
            if (students[i].getYearOfBirth() >= 2000){
                System.out.println(students[i]);}
        }
        System.out.println();

        System.out.println("Students of group 311:");
        for (int i = 0; i < students.length-1; i++) {
            if (students[i].getGroup() == 311){
                System.out.println(students[i]);}
        }

    }
}
