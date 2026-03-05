package latihan6;

public class Main {
    public static void main(String[] args){
        SegiTiga S1 = new SegiTiga();
        S1.setAlas(10);
        S1.setTinggi(5);
        System.out.println("Luas SegiTiga adalah =" + S1.LuasSegitiga());

        Persegi P1 = new Persegi();
        P1.setSisi(10);
        System.out.println("Luas Perseginya adalah =" + P1.luasPersegi());
    }
}
