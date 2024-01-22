public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(5.0, 3.0, FormaRettangolo.Tipo);
        Triangolo triangolo = new Triangolo(4, 8, FormaTriangolo.Tipo);

        rettangolo.calcolaArea();
        triangolo.calcolaArea();
    }
}