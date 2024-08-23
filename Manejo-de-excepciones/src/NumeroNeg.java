public class NumeroNeg extends Exception {
    public NumeroNeg() {
        super("Número negativo no permitido.");
    }

    public NumeroNeg(String mensaje) {
        super(mensaje);
    }
}
