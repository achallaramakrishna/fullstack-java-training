class Stack {
 
    private int[] stackArray;
    private int top;
    private int size;
 
    public StackOperat(int size) {
        this.size = size;
        stackArray = new int[size];
        top = -1;
    }
 
    public void push(int value) {
        if (!isFull()) {
            stack[++top] = value;
            System.out.println(value + " pushed into stack.");
        } else {
            System.out.println("Stack is FULL.");
        }
    }
 
    public int pop() {
        if (!isEmpty()) {
            int value = stack[top--];
            System.out.println(value + " popped from stack.");
            return value;
        } else {
            System.out.println("Stack is EMPTY.");
            return -1;
        }
    }
 
    public int peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack is EMPTY.");
            return -1;
        }
    }
 
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is EMPTY.");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
 
    public boolean isEmpty() {
        return top == -1;
    }
 
    public boolean isFull() {
        return top == size - 1;
    }
}
 
public class Stack {
 
 
	    private int[] arr = new int[10];
	    private int top = -1;
 
	    // Push
	    public void push(int value) {
	        if (!isFull()) {
	            arr[++top] = value;
	        } else {
	            System.out.println("Stack Overflow");
	        }
	    }
 
	    // Pop
	    public int pop() {
	        if (!isEmpty()) {
	            return arr[top--];
	        } else {
	            System.out.println("Stack Underflow");
	            return -1;
	        }
	    }
 
	    // Peek (Top element)
	    public int peek() {
	        if (!isEmpty()) {
	            return arr[top];
	        } else {
	            return -1;
	        }
	    }
 
	    // Display
	    public void display() {
	        for (int i = top; i >= 0; i--) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
 
	    // isFull
	    public boolean isFull() {
	        return top == arr.length - 1;
	    }
 
	    // isEmpty
	    public boolean isEmpty() {
	        return top == -1;
	    }
	}
