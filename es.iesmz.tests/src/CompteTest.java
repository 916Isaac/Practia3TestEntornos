import static org.junit.jupiter.api.Assertions.*;

class CompteTest {

    @org.junit.jupiter.api.Test
    public void compruebaIban1() {
        boolean resultadoReal = Compte.comprobarIban("ES6621000418401234567891 ");
        boolean resultadoEsperado = true;
        assertEquals(resultadoEsperado, resultadoReal);
    }
    @org.junit.jupiter.api.Test
    public void compruebaIban2() {
        boolean resultadoReal = Compte.comprobarIban("ES6000491500051234567892 ");
        boolean resultadoEsperado = true;
        assertEquals(resultadoEsperado, resultadoReal);
    }
    @org.junit.jupiter.api.Test
    public void compruebaIban3() {
        boolean resultadoReal = Compte.comprobarIban("ES9420805801101234567891 ");
        boolean resultadoEsperado = true;
        assertEquals(resultadoEsperado, resultadoReal);
    }
    @org.junit.jupiter.api.Test
    public void compruebaIban4() {
        boolean resultadoReal = Compte.comprobarIban("ES7600246912501234567891");
        boolean resultadoEsperado = false;
        assertEquals(resultadoEsperado, resultadoReal);
    }
    @org.junit.jupiter.api.Test
    public void compruebaIban5() {
        boolean resultadoReal = Compte.comprobarIban("ES4721000418401234567891");
        boolean resultadoEsperado = false;
        assertEquals(resultadoEsperado, resultadoReal);
    }
    @org.junit.jupiter.api.Test
    public void compruebaIban6() {
        boolean resultadoReal = Compte.comprobarIban("ES8200491500051234567892");
        boolean resultadoEsperado = false;
        assertEquals(resultadoEsperado, resultadoReal);
    }
    @org.junit.jupiter.api.Test
    public void generaIban2() {
        String resultadoReal = Compte.generaIBAN("0030","2053","09","1234567895");
        String resultadoEsperado = "ES7100302053091234567895";
        assertEquals(resultadoEsperado, resultadoReal);
    }
    @org.junit.jupiter.api.Test
    public void generaIban3() {
        String resultadoReal = Compte.generaIBAN("0049","2352","08","2414205416");
        String resultadoEsperado = "ES1000492352082414205416";
        assertEquals(resultadoEsperado, resultadoReal);
    }
    @org.junit.jupiter.api.Test
    public void generaIban4() {
        String resultadoReal = Compte.generaIBAN("2085","2066","62","3456789011");
        String resultadoEsperado = "ES1720852066623456789011";
        assertEquals(resultadoEsperado, resultadoReal);
    }
    @org.junit.jupiter.api.Test
    public void generaIban5() {
        String resultadoReal = Compte.generaIBAN("2085","2066","62","3456AE9011");
        String resultadoEsperado = null;
        assertEquals(resultadoEsperado, resultadoReal);
    }
    @org.junit.jupiter.api.Test
    public void generaIban6() {
        String resultadoReal = Compte.generaIBAN("208","2066","62","3456789011");
        String resultadoEsperado = null;
        assertEquals(resultadoEsperado, resultadoReal);
    }
    @org.junit.jupiter.api.Test
    public void generaIban7() {
        String resultadoReal = Compte.generaIBAN("2080","20A6","62","3456789011");
        String resultadoEsperado = null;
        assertEquals(resultadoEsperado, resultadoReal);
    }
    @org.junit.jupiter.api.Test
    public void generaIban8() {
        String resultadoReal = Compte.generaIBAN("2080","2086","6","345678911");
        String resultadoEsperado = null;
        assertEquals(resultadoEsperado, resultadoReal);
    }
    @org.junit.jupiter.api.Test
    public void generaIban9() {
        String resultadoReal = Compte.generaIBAN("2080","2086","63","345678911");
        String resultadoEsperado = null;
        assertEquals(resultadoEsperado, resultadoReal);
    }





}