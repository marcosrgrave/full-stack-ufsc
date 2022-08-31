package projects.Project1;

public class ContaPoupanca extends Conta {

    private int diaAniversario;

    public ContaPoupanca(int numero, String dataAbertura, boolean status, String senha, float saldo,
            int diaAniversario, Pessoa titularDaConta) {
        super(numero, dataAbertura, status, senha, saldo, titularDaConta);

        this.setNumeroConta(numero);
        this.setDataAbertura(dataAbertura);
        this.setStatus(status);
        this.setSenha(senha);
        this.setSaldo(saldo);
        this.diaAniversario = diaAniversario;
        this.setTitularDaConta(titularDaConta);

        this.setTaxa(0.5f / 100);

    }

    public int getDiaAniversario() {
        return this.diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    public float getCredito() {
        float credito = this.getSaldo() * this.getTaxa();
        return credito;
    }

    @Override
    public void atualizaTaxa() {
        float newSaldo = this.getSaldo() + this.getCredito();
        this.setSaldo(newSaldo);
    }

    @Override
    public String tipoConta() {
        return "Conta Poupança";
    }

    @Override
    public String peculiaridadeDaConta() {
        return "Dia Aniversario: " + this.diaAniversario + "\n";
    }

    @Override
    public String peculiaridadeListaUnica() {
        return "diaAniversario=" + this.diaAniversario + ", ";
    }

    @Override
    public String nomeTaxa() {
        return "Juros";
    }

    @Override
    public void relatorio() {
        super.relatorio();
        System.out.printf("Rendimentos: %f\n", this.getCredito());
    }

}
