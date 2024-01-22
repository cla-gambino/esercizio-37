enum FormaTriangolo {
    Tipo;
}
public class Triangolo extends Forma {

    private double base;

    private double altezza;

    private final FormaTriangolo tipo;

    public Triangolo(double base, double altezza, FormaTriangolo triangolo) {
        this.base = base;
        this.altezza = altezza;
        this.tipo = triangolo;
    }

    public FormaTriangolo getTipo() {
        return FormaTriangolo.Tipo;
    }

    @Override
    public void calcolaArea() {
        double area = (base * altezza) / 2;
        System.out.println("l'area del triangolo è = " + area);
        System.out.println("la forma dell'oggetto è = " + getTipo());
    }
}