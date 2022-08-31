package projects.Project1;

import java.util.ArrayList;
import java.util.List;

public class Conta implements ElementosDoBanco {

    private int numeroConta;
    private String dataAbertura;
    private boolean status;
    private String senha;
    private float saldo;
    private Pessoa titularDaConta;

    private float taxa = 20f;
    private List<Object[]> movimentacoes = new ArrayList<>();

    public Conta(int numeroConta, String dataAbertura, boolean status, String senha, float saldo,
            Pessoa titularDaConta) {
        this.numeroConta = numeroConta;
        this.dataAbertura = dataAbertura;
        this.status = status;
        this.senha = senha;
        this.saldo = saldo;
        this.titularDaConta = titularDaConta;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
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

    public String getStatus() {
        return (this.status == true) ? "Ativa" : "Inativa";
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

    public float getTaxa() {
        return this.taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }

    public void deposito(float f) {
        Object[] tempList = new Object[2];
        tempList[0] = "Deposito";
        tempList[1] = f;
        movimentacoes.add(tempList);

        this.saldo += f;
    }

    public void saque(float f) {
        Object[] tempList = new Object[2];
        tempList[0] = "Saque   ";
        tempList[1] = f;
        movimentacoes.add(tempList);

        this.saldo -= f;
    }

    public void atualizaTaxa() {
        this.saldo -= this.taxa;
    }

    public String tipoConta() {
        return "Conta Comum";
    }

    protected String peculiaridadeDaConta() {
        // faltou nome melhor
        return "";
    };

    protected String peculiaridadeListaUnica() {
        return "";
    }

    protected String nomeTaxa() {
        return "Taxa";
    }

    public void relatorio() {
        System.out.println(
                "-------------------------------" + "\n"
                        + "Conta: " + this.numeroConta + "\n"
                        + "Tipo: " + this.tipoConta() + "\n"
                        + this.peculiaridadeDaConta()
                        + "Abertura: " + this.dataAbertura + "\n"
                        + "Status: " + this.getStatus() + "\n"
                        + "Titular: " + this.titularDaConta.toString() + "\n"
                        + "Movimentos: " + "\n");

        int i = 0;
        for (Object[] mov : movimentacoes) {
            String movTipo = mov[0].toString();
            float movValor = (float) mov[1];
            i++;
            System.out.println(i + "\t" + movTipo + "\t" + movValor);
        }

        i++;
        System.out.println(i + "\t" + this.nomeTaxa() + "    " + "\t" + getTaxa());

        System.out.println("Saldo: " + this.saldo);

    }

    @Override
    public String getElementoInfo() {
        return this.tipoConta() + " [" +
                this.peculiaridadeListaUnica() +
                "numeroConta='" + getNumeroConta() + "'" +
                ", dataAbertura='" + getDataAbertura() + "'" +
                ", status='" + isStatus() + "'" +
                ", senha='" + getSenha() + "'" +
                ", saldo='" + getSaldo() + "'" +
                ", titularDaConta='" + getTitularDaConta().getElementoInfo() + "'" +
                ", taxa='" + getTaxa() + "'" +
                "]";
    }

}
