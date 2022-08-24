package projects.Project1;

public class PessoaFisica extends Pessoa {

    private String cpf;
    private String dataNascimento;
    private String rg;
    private float renda;

    public PessoaFisica(String cpf, String nome, String data_nascimento, String rg, float renda) {
        this.cpf = cpf;
        this.setNome(nome);
        this.dataNascimento = data_nascimento;
        this.rg = rg;
        this.renda = renda;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData_nascimento() {
        return this.dataNascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.dataNascimento = data_nascimento;
    }

    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public float getRenda() {
        return this.renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }

}
