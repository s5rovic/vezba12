

// Klasa Card

public class Card {

    int balance;

// Konstruktor

    public Card(int  pocetnoStanje) {
        if (balance <= 0)
            System.out.println("Nemate dovoljno sredstava na racunu");

        this.balance = pocetnoStanje;
    }
//Metod za naplatu


    public void charge(int iznos) {

    int naplata = balance - iznos;

        if (iznos <= 0){
            System.out.println("Niste izabrali iznos za naplatu");
            return;
        }
        if (iznos <= balance){
            System.out.println("Transakcija je uspesno obavljena");
            System.out.println("Novo stanje na racunu sada je: " + naplata);
        }
        else {

            System.out.println("Transakciju nije moguce izvrsiti");
        }

    }

}
