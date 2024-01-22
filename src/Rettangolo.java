enum FormaRettangolo {
    Tipo;
}

public class Rettangolo extends Forma {

    private double base;

    private double altezza;

    private final FormaRettangolo tipo;

    public Rettangolo(double base, double altezza, FormaRettangolo rettangolo) {
        this.base = base;
        this.altezza = altezza;
        this.tipo = rettangolo;
    }

    public FormaRettangolo getTipo() {
        return FormaRettangolo.Tipo;
    }

    @Override
    public void calcolaArea() {
        double area = base * altezza;
        System.out.println("l'area del rettangolo è = " + area);
        System.out.println("la forma dell'oggetto è = " + getTipo());
    }
}