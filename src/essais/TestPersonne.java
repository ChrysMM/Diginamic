package essais;

import entites.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne personne1 = new Personne("rrr","fff","dddd");
        Personne personne2 = new Personne("tt", "ddddd", "45 rue dddd");

        System.out.println(personne1);
        System.out.println(personne2);
        personne1.afficheNom();
    }

}
