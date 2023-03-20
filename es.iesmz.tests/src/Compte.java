import java.math.BigInteger;

public class Compte {
    private String iban;
    private String nom;

    public Compte(String iban, String nom) {
        this.iban = iban;
        this.nom = nom;
    }
    static boolean comprobarIban(String iban){
        boolean correcto = false;
        //Separamos en variables de string el iban completo
        String entidad = iban.substring(4, 8);
        String oficina = iban.substring(8, 12);
        String dc = iban.substring(12, 14);
        String cuenta = iban.substring(14, 24);
        //Cogemos los dos digitos de control con el integer y el substring del iban
        int digitoControlNumerico = Integer.parseInt(iban.substring(2, 4));
        //Creamos un big integer con todas las variables de string sumandole el ES en numero
        BigInteger numerosinXX = new BigInteger(entidad + oficina + dc + cuenta + "142800");
        //Creamos el modulo por el que se dividira el numero de 24 cifras y le restaremos 98
        BigInteger moduloDe97 = new BigInteger("97");
        //hacemos el mod del iban sin el digito de control
        BigInteger restoDelMod = numerosinXX.mod(moduloDe97);
        BigInteger digitoControl = BigInteger.valueOf(98).subtract(restoDelMod);
         int digitosDeControlResultado = digitoControl.intValue();

            if (digitosDeControlResultado == digitoControlNumerico) {
                correcto =  true;
            } else {
                correcto = false;
            }
            return correcto;
    }
    public static String generaIBAN(String entitat, String oficina, String dc, String compte) {
        String iban = null;
        //Aqui comprobamos que cada seccion del iban cumpla con el largo y el tipo de dato
        if (entitat.length() == 4 && entitat.matches("\\d+")
                && oficina.length() == 4 && oficina.matches("\\d+")
                && dc.length() == 2 && dc.matches("\\d+")
                && compte.length() == 10 && compte.matches("\\d+")) {

            String pais = "ES";

            BigInteger NumeroSinControl = new BigInteger(entitat + oficina + dc + compte + "142800");
            BigInteger Modulo = new BigInteger("97");
            BigInteger Resto = NumeroSinControl .mod(Modulo);
            BigInteger digitoControlIBAN = BigInteger.valueOf(98).subtract(Resto);
            String DigitoControl = digitoControlIBAN.toString();


            iban = pais + DigitoControl + entitat + oficina + dc + compte;
        }

        return iban;
    }


}