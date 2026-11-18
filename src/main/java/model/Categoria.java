package model;

public class Categoria {
    private int Id;
    private String nome;
    private int parentId;

    public Categoria() {
    }

    public Categoria(int id, String nome, int parentId) {
        Id = id;
        this.nome = nome;
        this.parentId = parentId;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "Id=" + Id +
                ", nome='" + nome + '\'' +
                ", parentId=" + parentId +
                '}';
    }
}
