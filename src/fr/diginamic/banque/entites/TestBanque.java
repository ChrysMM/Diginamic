package fr.diginamic.banque.entites;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte1 = new Compte(
                1211447744,
                12454);
        System.out.print(compte1);

        CompteTaux compte2 = new CompteTaux(12222,2000,12);
        System.out.print(compte2);
    }


}
