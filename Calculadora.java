import java.util.Vector;

public class Calculadora implements ICalculator {

    IStack<Integer> stackInterno = new IStackvector<Integer>(20);
    
    //Método para sumar los números
    @Override
    public int add(int n1, int n2) {
        return n1 + n2;
    }
    //Método para restar los números
    @Override
    public int substraction(int n1, int n2) {
       return n1 - n2;
        
    }

    //Método para multiplicar los números
    @Override
    public int multiplication(int n1, int n2) {
        return n1 * n2;
    }

    //Método para dividir los números
    @Override
    public int division(int n1, int n2) throws Exception {
        return n1 / n2;
    }

    //Método para obtener el residuo de los números
    @Override
    public int residue(int n1, int n2) throws Exception {
        return n1 % n2;
    }

    //Método para leer el archivo de texto que contiene los datos
    @Override
    public Vector<String> read(String charactersString) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }

    //Método para verificar si son operandos u operadores
    @Override
    public int solve(Vector<String> elements) throws Exception {
        
        for (int i = 0; i < elements.size(); i++) {
            char c = ((CharSequence) elements).charAt(i);

            if (Character.isDigit(c)) {
                stackInterno.push(c - '0');
            } else {
                int a = stackInterno.pop();
                int b = stackInterno.pop();

                switch (c) {
                    case '+':
                        stackInterno.push(b + a);
                        break;

                    case '-':
                        stackInterno.push(b - a);
                        break;
                }
            }
            return stackInterno.pop();
        }
        return stackInterno.pop();
    }
    
}
