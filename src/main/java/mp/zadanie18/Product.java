package mp.zadanie18;

public class Product {
    private String nazwa;
    private double cena;
    private String kategoria;

    public Product(String nazwa, double cena, String kategoria) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    @Override
    public String toString() {
        return "Nazwa: " + nazwa + ", Cena: " + cena + ", Kategoria: " + kategoria;
    }
}
