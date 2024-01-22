public class Rettangolo extends Forma {

    private double base;

    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
        super.setTipo(TipoForma.Rettangolo);
    }

    @Override
    public void calcolaArea() {
        double area = base * altezza;
        System.out.println("l'area del rettangolo è = " + area);
    }
}