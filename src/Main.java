public class Main {
    public static void main(String[] args) {

        Card card = new Card(80);

        card.charge(0);  //provera sa 0
        card.charge(20);   //provera sa 20
        card.charge(50);  //provera sa 50
        card.charge(90); //provera sa iznosom vecim od stanja na racunu

    }
}