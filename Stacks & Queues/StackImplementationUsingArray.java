public class StackImplementationUsingArray {
    private int maxSize;
    public int[] stackArray;
    private int top;

    public StackImplementationUsingArray(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            top++;
            stackArray[top] = value;
        } else {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }

    public int pop() {
        if (top >= 0) {
            int value = stackArray[top];
            top--;
            return value;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return -1 to indicate stack is empty
        }
    }

    public int peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Return -1 to indicate stack is empty
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
    
}
