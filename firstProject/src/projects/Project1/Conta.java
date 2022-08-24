package projects.Project1;

public class Conta {

    private int numero;
    private String dataAbertura;
    private boolean status;
    private String senha;
    private float saldo;
    private Pessoa titularDaConta;

    public Conta(int numero, String dataAbertura, boolean status, String senha, float saldo, Pessoa titularDaConta) {
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.status = status;
        this.senha = senha;
        this.saldo = saldo;
        this.titularDaConta = titularDaConta;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDataAbertura() {
        return this.dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public boolean isStatus() {
        return this.status;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Pessoa getTitularDaConta() {
        return this.titularDaConta;
    }

    public void setTitularDaConta(Pessoa titularDaConta) {
        this.titularDaConta = titularDaConta;
    }

    public void deposito(float f) {
    }

    public void saque(float f) {
    }

    public void atualizaTaxa() {
    }

    public void relatorio() {
    }

}
