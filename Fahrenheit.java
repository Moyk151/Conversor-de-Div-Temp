package ConDivfin;

class Fahrenheit extends Temperatura {
    public double convertir(double temperatura) throws Exception {
        return (temperatura - 32) * 5 / 9;
    }
}