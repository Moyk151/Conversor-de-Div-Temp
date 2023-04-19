package ConDivfin;

class ConvertidorDeMoneda {
    private double TipoDeCambio;

    public ConvertidorDeMoneda(double TipoDeCambio) {
        this.TipoDeCambio = TipoDeCambio;
    }

    public double convert(double cantidad) {
        return cantidad * TipoDeCambio;
    }
}