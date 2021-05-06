package fr.diginamic.banque.entites;

public class TestOperation {
    public static void main(String[] args) {
        Operation[]tab = new Operation[4];
        Credit credit1 = new Credit("mai",2000);
        Credit credit2 = new Credit("mars",10000);
        Debit debit1 = new Debit("janvier",1000);
        Debit debit2 = new Debit("fevrier",200);
        tab[0] = credit1;
        tab[1]= credit2;
        tab[2] = debit1;
        tab[3] = debit2;
        for (int i=0; i< tab.length; i++)
        System.out.print(credit1 + "credit");
        System.out.print(credit2 + "credit");
        System.out.print(debit1 + "debit");
        System.out.print(debit2 + "debit");
    }
}
