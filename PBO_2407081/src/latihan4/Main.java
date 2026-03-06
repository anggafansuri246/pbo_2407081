package latihan4;

import latihan4.coba.jajargenjang;
import latihan4.coba.persegi;
import latihan4.coba.persegipanjang;
import latihan4.coba.segitiga;

public class Main {
    public static void main(String[] args) {
        segitiga stg = new segitiga();

        stg.setAlas(2);
        stg.setTinggi(5);
        System.out.println("Luas Segitiga adalah : " + stg.luassegitiga());

        persegi p = new persegi();

        p.setSisi(5);
        System.out.println("Luas Segitiga adalah : " + p.luaspersegi());

        persegipanjang pp = new persegipanjang();

        pp.setPanjang(10);
        pp.setlebar(2);
        System.out.println("Luas Segitiga adalah : " + pp.kelilingpersegipanjang());
        
        jajargenjang jjg = new jajargenjang();

        jjg.setAlas(8);
        jjg.setTinggi(4);
        System.out.println("Luas Segitiga adalah : " + jjg.luasjajargenjang());
    }
}
