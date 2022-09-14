package first.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import first.demo.utils.GenerateID;

@Entity(name = "tb_enderecos_ufsc")
public class EnderecoEntity {

    @Id
    private String id = GenerateID.uniqueID();
    private String tipo;
    private String rua;
    private Integer numero;
    private String cep;

    public EnderecoEntity() {

    }

    public EnderecoEntity(String rua, Integer numero) {
        this.rua = rua;
        this.numero = numero;
    }

    public EnderecoEntity(String cep) {
        this.id = GenerateID.uniqueID();
        this.cep = cep;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public EnderecoEntity enderecoDto(EnderecoEntity enderecoDto) {
        return enderecoDto;
    }

}
