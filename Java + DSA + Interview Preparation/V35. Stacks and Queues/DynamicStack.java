import java.util.Stack;

public class DynamicStack extends Stack {
    public DynamicStack() {
        super();
    }

    // public DynamicStack(int size) {
    //     super(size);
    // }

    @Override
    public Object push(Object item) {
        if(size() == -1 ) {
            return null;
        }
        
        return super.push(item);
    }
}
