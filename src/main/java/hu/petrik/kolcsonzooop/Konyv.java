package hu.petrik.kolcsonzooop;

public class Konyv implements Kolcsonozheto {
    private String cim;
    private String szerzo;
    private String isbn;

    public Konyv(String cim, String szerzo, String isbn) {
        this.cim = cim;
        this.szerzo = szerzo;
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String megjelenitendoNev() {
        return String.format("%s - %s", szerzo, cim);
    }

    @Override
    public int meddigKolcsonozheto() {
        return 14;
    }
}
