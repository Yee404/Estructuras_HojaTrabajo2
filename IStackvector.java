import java.util.Vector; 

public class IStackvector<T> implements IStack<T> {
   
    private int index;
    Vector<T> internalVector;

    public IStackvector(int qty){
        index = 0;
        internalVector = new Vector<T>(qty);
    }

    @Override
    public int count() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public void push(T value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'push'");
    }

    @Override
    public T pop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pop'");
    }

    @Override
    public T peek() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'peek'");
    }
    
}
