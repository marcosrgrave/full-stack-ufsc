package exercises;

public class Exercise4 {

    public static void main(String[] args) {
        // secondQuestion();
        thirdQuestion();
    }

    public static void secondQuestion() {
        DateTime testDateTime = new DateTime("01/02/1998", "13:00:00");
        System.out.println(testDateTime.toString());
    }

    public static void thirdQuestion() {
        Class testClass = new Class("1", "Marcos");
        Student student1 = new Student("Marcos");
        Student student2 = new Student("Amanda");
        testClass.addStudent(student1);
        testClass.addStudent(student2);
        testClass.showStudents();
        System.out.println(testClass.getStudentsAmount());
        System.out.println(testClass.toString());
    }

}
