package projects.Project1;

public class PessoaJuridica extends Pessoa {

    private String cnpj;
    private String cidade;
    private String estado;

    public PessoaJuridica(String cnpj, String nome, String cidade, String estado) {
        this.cnpj = cnpj;
        this.setNome(nome);
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String tipoPessoa() {
        return "Pessoa Jurídica";
    }

    @Override
    public String getElementoInfo() {
        return String.format(this.tipoPessoa() + " [cnpj=%s, cidade=%s, estado=%s, nome=%s]",
                this.cnpj, this.cidade, this.estado, this.getNome());
    }

}
