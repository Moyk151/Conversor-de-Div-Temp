package ConDivfin;

class Celsius extends Temperatura {
    public double convertir(double temperatura) throws Exception {
        return (temperatura * 9 / 5) + 32;
    }
}
