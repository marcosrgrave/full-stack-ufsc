package projects.Project1;

public class ContaEspecial extends Conta {

    private float limite;

    public ContaEspecial(int numero, String dataAbertura, boolean status, String senha, float saldo, float limite,
            Pessoa titularDaConta) {
        super(numero, dataAbertura, status, senha, saldo, titularDaConta);

        this.setNumero(numero);
        this.setDataAbertura(dataAbertura);
        this.setStatus(status);
        this.setSenha(senha);
        this.setSaldo(saldo);
        this.limite = limite;
        this.setTitularDaConta(titularDaConta);

    }

    public float getLimite() {
        return this.limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

}
