enum TipoForma {
    Rettangolo,
    Triangolo
}

public abstract class Forma {

    public abstract void calcolaArea();

    private TipoForma tipo;

    public TipoForma getTipo() {
        return tipo;
    }

    public void setTipo(TipoForma tipo) {
        this.tipo = tipo;
    }
}