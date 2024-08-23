public class CaracterEn {
    public char caracterEn(String cadena, int posicion) throws Exception {
        if (posicion >= 0 && posicion < cadena.length()) {
            return cadena.charAt(posicion);
        } else {
            throw new Exception("La posición " + posicion + " está fuera del rango de la cadena.");
        }
    }
}

