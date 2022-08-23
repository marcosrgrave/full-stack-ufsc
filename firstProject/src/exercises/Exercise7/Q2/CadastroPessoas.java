package exercises.Exercise7.Q2;

import java.util.Arrays;

public class CadastroPessoas {

    private Pessoa[] vetorPessoas = {};
    // private int qtdAtual = this.vetorPessoas.length;

    public void cadastraPessoa(Pessoa pessoa) {
        Object[] vetorTemp = addInArray(pessoa, this.vetorPessoas);
        vetorTemp = addInArray(pessoa, vetorTemp);
        System.out.println(vetorTemp.length);

        for (Object object : vetorTemp) {
            Pessoa person = object;
            System.out.println(object);
        }
    }

    public void imprimeCadastro() {
    }

    public Object[] addInArray(Object object, Object[] array) {

        Object[] newArray = new Object[array.length + 1];

        if (array.length == 0) {
            newArray[array.length] = object;
        } else {
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            newArray[array.length] = object;
        }

        return newArray;
    }

}
