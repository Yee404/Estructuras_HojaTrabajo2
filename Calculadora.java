import java.util.Vector;

public class Calculadora implements ICalculator {

    IStack<Integer> stackInterno = new IStackvector<Integer>(20);
    
    @Override
    public int add(String cadena) {

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

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
        return 0;

    }

    @Override
    public int substraction(int n1, int n2) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'multiplication'");
    
       // result = n1 - n2;
        //return result;
        
    }

    // Abner 
    @Override
    public int multiplication(int n1, int n2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'multiplication'");
    }

    // abner 
    @Override
    public int division(int n1, int n2) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'division'");
    }

    @Override
    public int residue(int n1, int n2) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'residue'");
    }

    @Override
    public Vector<String> read(String charactersString) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }

    @Override
    public int solve(Vector<Character> elements) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'solve'");
    }
    
}
