package projects.Project1;

public class ContaEspecial extends Conta {

    private float limite;

    public ContaEspecial(int numero, String dataAbertura, boolean status, String senha, float saldo, float limite,
            Pessoa titularDaConta) {
        super(numero, dataAbertura, status, senha, saldo, titularDaConta);

        this.setNumeroConta(numero);
        this.setDataAbertura(dataAbertura);
        this.setStatus(status);
        this.setSenha(senha);
        this.setSaldo(saldo);
        this.limite = limite;
        this.setTitularDaConta(titularDaConta);

        this.setTaxa(30f);

    }

    public float getLimite() {
        return this.limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public void atualizaTaxa() {
        float newSaldo = this.getSaldo() - this.getTaxa();
        this.setSaldo(newSaldo);
    }

    @Override
    public String tipoConta() {
        return "Conta Especial";
    }

    @Override
    protected String peculiaridadeDaConta() {
        return "Limite: " + this.limite + "\n";
    }

    @Override
    public String peculiaridadeListaUnica() {
        return "limite=" + this.limite + ", ";
    }

    @Override
    public String nomeTaxa() {
        return "Taxa";
    }

}
