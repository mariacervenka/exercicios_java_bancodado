package model;

public class Vendedor {

    //int objeto
    private Integer id;
    private String nome;


    //metodos get e set
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return id + " | " +nome;
    }
}
