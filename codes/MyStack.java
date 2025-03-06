public class MyStack<T> {
    private Node<T> top;

    public MyStack() {
        top = null;
    }

    // Push an element onto the stack
    public void push(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.next = top;
        top = newNode;
    }

    // Pop an element from the stack
    public T pop() {
        if (top == null) {
            System.out.println("Stack is empty");
        }
        T data = top.data;
        top = top.next;
        return data;
    }

    // Peek the top element without removing it
    public T peek() {
        if (top == null) {
            System.out.println("Stack is empty");
        }
        return top.data;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }
}
