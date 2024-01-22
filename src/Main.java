public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(5.0, 3.0);
        Triangolo triangolo = new Triangolo(4.0, 8.0);

        System.out.println("l'oggetto da calcolare è un: " + rettangolo.getTipo());

        rettangolo.calcolaArea();

        System.out.println("l'oggetto da calcolare è un: " + triangolo.getTipo());

        triangolo.calcolaArea();
    }
}