package entites;

import java.util.Locale;

public class Personne {

    public String nom, prenom, adressePostale;




    public Personne(String nom, String prenom, String adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;


    }
    //public String getNom()
    //{return nom};


    public void afficheNom(){
        System.out.println(nom.toLowerCase() + prenom);
    }
    //public static modifPrenom(){
     //   return "Marba";
    }


