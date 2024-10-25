package hu.petrik.kolcsonzooop;

import java.text.MessageFormat;

public class Dvd implements Kolcsonozheto {
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
}
