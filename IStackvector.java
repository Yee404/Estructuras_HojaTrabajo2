import java.util.Vector; 
/* se guardan los operandos  */
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
        return internalVector.size();
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
    return internalVector.isEmpty();
    }

    @Override
    public void push(T value) {
        // TODO Auto-generated method stub
         internalVector.add(value);
    }

    @Override
    public T pop() {
        // TODO Auto-generated method stub
        T tempValue = null;
        if (internalVector.size() > 0){
            tempValue = internalVector.remove(internalVector.size() - 1);
        }
        return tempValue;
    }

    @Override
    public T peek() {
        // TODO Auto-generated method stub
        T tempValue = null;
        if (internalVector.size() > 0){
            tempValue = internalVector.get(internalVector.size() - 1);
        }
        return tempValue;
    }
    
}
