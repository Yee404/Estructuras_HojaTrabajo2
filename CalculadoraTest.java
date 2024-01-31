/** Se solicitó ayuda de una inteligencia artificial "Bing" para saber cómo realizar una prueba unitaria
 
 * Pregunta: ejemplo de una prueba unitaria para el método de suma
 
 * Ejemplo proporcionado por la IA: 
 
 * import org.junit.Test;
    import static org.junit.Assert.assertEquals;

    public class PostfixTest {
        @Test
        public void testSumPostfix() {
            String postfix = "2 3 +";
            int expected = 5;
            int actual = Postfix.sumPostfix(postfix);
            assertEquals(expected, actual);
    }
}
 * 
 * */


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {

    //Test para la suma
    @Test
    public void testAdd() {

        int expected = 5;
        int actual = new Calculadora().add(2, 3);
        assertEquals(expected, actual);

    }
    //Test para la resta
    @Test
    public void testSubstraction() {

        int expected = 1;
        int actual = new Calculadora().substraction(3, 2);
        assertEquals(expected, actual);

    }
    //Test para la division
    @Test
    public void testDivision() throws Exception {

        int expected = 2;
        int actual = new Calculadora().division(6, 3);
        assertEquals(expected, actual);

    }

    //Test para la multiplicación
    @Test
    public void testMultiplication() {

        int expected = 6;
        int actual = new Calculadora().multiplication(2, 3);
        assertEquals(expected, actual);

    }
    //Test para el residuo
    @Test
    public void testResidue() throws Exception {

        int expected = 1;
        int actual = new Calculadora().residue(7, 3);
        assertEquals(expected, actual);

    }

}
