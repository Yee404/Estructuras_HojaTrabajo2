import java.util.Vector;

public class Calculadora implements ICalculator {

    IStack<Integer> stackInterno = new IStackvector<Integer>(20);
    
    @Override
    public int add(int n1, int n2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public int substraction(int n1, int n2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'substraction'");
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
