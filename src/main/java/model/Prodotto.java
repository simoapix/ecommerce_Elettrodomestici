package model;

public class Prodotto {
    private int id;
    private String nome;
    private String descrizione;
    private double prezzo;
    private int stock;
    private int categriaId;
    private String marca;
    private String classeEnergetica;
    private int potenza_watt;
    private boolean attivo;

    public Prodotto() {
    }

    public Prodotto(int id, String nome, String descrizione, double prezzo, int stock, int categriaId, String marca, int potenza_watt, String classeEnergetica, boolean attivo) {
        this.id = id;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.stock = stock;
        this.categriaId = categriaId;
        this.marca = marca;
        this.potenza_watt = potenza_watt;
        this.classeEnergetica = classeEnergetica;
        this.attivo = attivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCategriaId() {
        return categriaId;
    }

    public void setCategriaId(int categriaId) {
        this.categriaId = categriaId;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getClasseEnergetica() {
        return classeEnergetica;
    }

    public void setClasseEnergetica(String classeEnergetica) {
        this.classeEnergetica = classeEnergetica;
    }

    public int getPotenza_watt() {
        return potenza_watt;
    }

    public void setPotenza_watt(int potenza_watt) {
        this.potenza_watt = potenza_watt;
    }

    public boolean isAttivo() {
        return attivo;
    }

    public void setAttivo(boolean attivo) {
        this.attivo = attivo;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                ", stock=" + stock +
                ", categriaId=" + categriaId +
                ", marca='" + marca + '\'' +
                ", classeEnergetica='" + classeEnergetica + '\'' +
                ", potenza_watt=" + potenza_watt +
                ", attivo=" + attivo +
                '}';
    }
}
