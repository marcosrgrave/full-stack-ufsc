package exercises;

public class Exercise3 {
    public static void main(String[] args) {
        // studentClass();
        dateClass();
    }

    public static void studentClass() {
        Student firstStudent = new Student("Marcos");
        firstStudent.setExam1(6);
        firstStudent.setExam2(6);
        firstStudent.setExam3(10);
        System.out.println(firstStudent.getRegistration());
        System.out.println(firstStudent.getAverage());

        Student secondStudent = new Student();
        System.out.println(secondStudent.getRegistration());
    }

    public static void dateClass() {
        Date date1 = new Date(00, 13, 2000);
        System.out.println(date1.toString());
        System.out.println(date1.isLeapYear());
        Date dateString = new Date("01/02/1998");
        System.out.println(dateString.getDay());
        System.out.println(dateString.getMonth());
        System.out.println(dateString.getYear());
        return;
    }

}
