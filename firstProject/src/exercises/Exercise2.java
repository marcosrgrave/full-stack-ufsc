package exercises;

public class Exercise2 {

    public static void main(String[] args) {
        Robot myRobot = new Robot(2, 3);
        System.out.println(myRobot.getId());
    }

}

/* 
 * 2.(Teórica) No contexto de programação orientada a objetos,
 * qual é a diferença entre classe e objeto? Exemplifique.
 * 
 * R: O objeto representa algo do mundo real (ou imaginário), ou seja,
 * ele possui as suas características e comportamentos principais.
 * Porém, diversos objetos podem ser uma representação do mesmo tipo de objeto,
 * ou seja, podem existir cachorros diferentes, cada um com suas características e
 * comportamentos, porém todos fazem parte do tipo Cachorro. Esse tipo dos objetos
 * nada mais é do que a classe. Dessa forma, a classe engloba diversos objetos,
 * porém todos fazendo parte do mesmo tipo.
 * 
 * 
 * 3.(Teórica) Considerando a representação UML abaixo, aponte:
 * 
 * a) o nome da classe;
 * R: Funcionario.
 * 
 * b) quantos e quais são os atributos presentes na classe representada;
 * R: 6 -> nome, salario, endereco, data_nascimento, bonus, setor.
 * 
 * c) quais são os métodos presentes na classe representada;
 * R: retornarGanhos, calcularIdade, complementaEndereco.
 * 
 * d) o que significam os símbolos - ou + que precedem os atributos e métodos;
 * R: sinal de menos (-) = atributos, sinal de mais (+) = métodos.
 * 
*/