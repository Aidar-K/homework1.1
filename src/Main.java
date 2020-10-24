public class Main {

    public static void main(String[] args) {
        Ultimate phantomStrike = new Ultimate("Phantom", 5, Weapon.SWORD, "PhantomStrike", new Def("str", "qwe"));
        Assasin assasin = new Assasin("FUNK", 12, Weapon.HALBERD, "Drops", 400, new Def("bty", "qwe"));
        Assasin assasin2 = new Assasin("PAN", 23, Weapon.SPEAR, "OPO", 600, new Def("rod", "qwe"));

        System.out.println(phantomStrike.getInfo());
        System.out.println("__________________________________________");

        System.out.println(assasin.getInfo());
        System.out.println("__________________________________________");
        System.out.println(assasin2.getInfo());
        System.out.println("__________________________________________");

        assasin.makeTotem("Protas", 2);
        assasin.makeTotem(2, "Ares");
        assasin.makeTotem("Kratos");
    }

}
