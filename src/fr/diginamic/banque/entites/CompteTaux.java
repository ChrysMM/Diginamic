package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
 private int tauxDeRemuneration;

 public CompteTaux(int numeroDeCompte, int soldeDeCompte, int tauxDeRemuneration) {
  super(numeroDeCompte, soldeDeCompte);
  this.tauxDeRemuneration = tauxDeRemuneration;


 } @Override
 public String toString() {
  return "CompteTaux{" +
          "tauxDeRemuneration=" + tauxDeRemuneration +
          '}';
 }
}
