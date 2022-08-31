package projects.Project1;

public abstract class Pessoa implements ElementosDoBanco {

    private String nome;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String tipoPessoa() {
        return "Pessoa";
    }

    @Override
    public String getElementoInfo() {
        return String.format(this.tipoPessoa() + " [nome=%s]", this.nome);
    }

}
