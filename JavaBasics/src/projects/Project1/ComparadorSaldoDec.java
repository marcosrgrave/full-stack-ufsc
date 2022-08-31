package projects.Project1;

import java.util.Comparator;

public class ComparadorSaldoDec implements Comparator<Conta> {

    public int compare(Conta conta1, Conta conta2) {
        Float change1 = Float.valueOf(conta1.getSaldo());
        Float change2 = Float.valueOf(conta2.getSaldo());
        return change2.compareTo(change1);
    }

}
