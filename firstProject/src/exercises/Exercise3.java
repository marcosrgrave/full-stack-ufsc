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

    /*
     * 5. (Teórica) No contexto de orientação a objetos, qual é a finalidade
     * da existência de construtores/destrutores definidos nas classes?
     * Exemplifique como funcionam.
     * 
     * R: O construtor é uma porção de código executado quando um novo objeto é instanciado.
     * O destrutor é uma porção de código executado quando um novo objeto é finalizado.
     * A principal utilidade de um construtor é permitir a inicialização e validação de dados 
     * no ato de inicialização dos objetos.
     * 
     * 6. (Teórica) Represente, usando UML, as classes
     * Aluno e Data definidas nos exercícios 1 e 4.
     */

}
