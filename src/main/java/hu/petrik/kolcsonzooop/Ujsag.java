package hu.petrik.kolcsonzooop;

import java.text.MessageFormat;

public class Ujsag implements Kolcsonozheto {
    private String cim;
    private int kiadasEv;
    private int kiadasHet;

    public Ujsag(String cim, int kiadasEv, int kiadasHet) {
        this.cim = cim;
        this.kiadasEv = kiadasEv;
        this.kiadasHet = kiadasHet;
    }

    @Override
    public String megjelenitendoNev() {
        return String.format("%s %d/%d", cim, kiadasEv, kiadasHet);
    }

    @Override
    public int meddigKolcsonozheto() {
        return 0;
    }
}
