package hu.petrik.kolcsonzooop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Konyv konyv1 = new Konyv("A Gyűrűk Ura","J. R. R. Tolkien","abc123");
        Konyv konyv2 = new Konyv("Hobbit","J. R. R. Tolkien","abc321");
        Konyv konyv3 = new Konyv("Varjak lakomája","George R. R. Martin","aaa111");
        Dvd dvd1 = new Dvd("Star Wars V. rész – A Birodalom visszavág", 124);
        Dvd dvd2 = new Dvd("Star Wars IV. rész - Egy új remény", 121);
        Dvd dvd3 = new Dvd("Star Wars VI. rész - A Jedi visszatér", 131);
        Dvd dvd4 = new Dvd("A Gyűrűk Ura: A gyűrű szövetsége", 178);
        Dvd dvd5 = new Dvd("A Gyűrűk Ura: A két torony", 155);
        Ujsag ujsag1 = new Ujsag("Képes Sport", 2007, 23);
        Ujsag ujsag2 = new Ujsag("Blikk", 2005, 12);

        List<Kolcsonozheto> katalogus = new ArrayList<>(List.of(konyv1, konyv2, konyv3, dvd1,
                dvd2, dvd3, dvd4, dvd5, ujsag1, ujsag2));

        for (Kolcsonozheto kolcsonozheto: katalogus) {
            if (kolcsonozheto instanceof Konyv konyv) {
                System.out.printf("%s - ", konyv.getIsbn());
            }
            System.out.printf("%s - %d\n", kolcsonozheto.megjelenitendoNev(), kolcsonozheto.meddigKolcsonozheto());
        }

        List<Dvd> dvdk = new ArrayList<>(List.of(dvd1, dvd2, dvd3, dvd4, dvd5));
        System.out.println(dvdk);
        Collections.sort(dvdk);
        System.out.println(dvdk);
        Collections.sort(dvdk, Collections.reverseOrder());
        System.out.println(dvdk);

    }
}