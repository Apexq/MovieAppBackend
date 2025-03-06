public class MyQueue<T> {
    private Node<T> front;
    private Node<T> rear;
    
    public MyQueue() {
        front = rear = null;
    }

    // Add an element to the queue (enqueue)
    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (rear != null) {
            rear.next = newNode;
        }
        rear = newNode;
        if (front == null) {
            front = rear;
        }
    }

    // Remove an element from the queue (dequeue)
    public T dequeue() {
        if (front == null) {
            throw new IllegalStateException("Queue is empty");
        }
        T data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Peek the front element without removing it
    public T peek() {
        if (front == null) {
            throw new IllegalStateException("Queue is empty");
        }
        return front.data;
    }
}
