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


import java.util.Vector;

public class CalculadoraTest {

    @Test
    public void testAdd() {
        Calculadora calculadora = new Calculadora();

        // Definir los números a sumar
        int n1 = 5;
        int n2 = 10;

        // Llamar al método add
        int resultado = calculadora.add(n1, n2);

        // Verificar que el resultado es el esperado
        assertEquals("La suma no es la esperada", 15, resultado);
    }

    @Test
    public void testAddWithVector() {
        Calculadora calculadora = new Calculadora();

        // Definir un vector de números a sumar
        Vector<Integer> vector = new Vector<>();
        vector.add(5);
        vector.add(10);
        vector.add(15);

        // Llamar al método add con el vector
        int resultado = calculadora.add(vector);

        // Verificar que el resultado es el esperado
        assertEquals("La suma no es la esperada", 30, resultado);
    }

    private void assertEquals(String string, int i, int resultado) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }
}

    