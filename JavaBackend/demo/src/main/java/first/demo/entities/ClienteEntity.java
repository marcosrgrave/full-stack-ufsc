package first.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

import first.demo.utils.GenerateID;

@Entity(name = "tb_clientes_ufsc")
public class ClienteEntity {

    @Id
    private String id;
    @Column(nullable = false)
    private String nome;
    private String rua;
    private String numero;
    private String cpf;
    private String telefone;

    public ClienteEntity() {
    }

    public ClienteEntity(String nome) {
        this.id = GenerateID.uniqueID();
        this.nome = nome;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
