package projects.Project1;

public class ContaPoupanca extends Conta {

    private int diaAniversario;

    public ContaPoupanca(int numero, String dataAbertura, boolean status, String senha, float saldo,
            int diaAniversario, Pessoa titularDaConta) {
        super(numero, dataAbertura, status, senha, saldo, titularDaConta);

        this.setNumero(numero);
        this.setDataAbertura(dataAbertura);
        this.setStatus(status);
        this.setSenha(senha);
        this.setSaldo(saldo);
        this.diaAniversario = diaAniversario;
        this.setTitularDaConta(titularDaConta);

    }

    public int getDiaAniversario() {
        return this.diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

}
