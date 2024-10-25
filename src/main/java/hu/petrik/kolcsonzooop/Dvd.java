package hu.petrik.kolcsonzooop;

import java.text.MessageFormat;

public class Dvd implements Kolcsonozheto, Comparable<Dvd> {
    private String cim;
    private int hossz;

    public Dvd(String cim, int hossz) {
        this.cim = cim;
        this.hossz = hossz;
    }

    @Override
    public String megjelenitendoNev() {
        return MessageFormat.format("{0} ({1} perc)", cim, hossz);
    }

    @Override
    public int meddigKolcsonozheto() {
        return 7;
    }

    @Override
    public String toString() {
        return megjelenitendoNev();
    }

    @Override
    public int compareTo(Dvd other) {
        // negatív ha this < other
        // 0 ha this = other
        // pozitív ha this > other
        if (this.hossz == other.hossz) {
            // Ha egyforma hosszúak, akkor cím szerint abc sorrendben írja ki
            return this.cim.compareTo(other.cim);
        }
        // hossz szerint növekvő sorrend
        return this.hossz - other.hossz;
    }
}
