public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }
    
    public boolean push(int item) throws Exception{
        if (isFull()) {
            throw new Exception("Stack is Full!!");
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception{
        if (isEmpty()) {
            throw new Exception("Cannot pop from an Empty Stack!");
        }

        return data[ptr--];
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot pop from an Empty Stack!");
        }
        return data[ptr];
    }

    private boolean isFull() {
        return ptr == data.length - 1;
    }

    private boolean isEmpty() {
        return ptr == -1;
    }

}