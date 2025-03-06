public class List<T> {
    public Node<T> head;

    public List() {
        this.head = null;
    }
    // Liste boş mu?
        public boolean isEmpty() {
        return head == null;
    }
    // Eleman ekleme
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Eleman silme
    public boolean delete(T data) {
        if (head == null) return false;
        if (head.data.equals(data)) {
            head = head.next;
            return true;
        }
        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
            return true;
        }
        return false;
    }

    // Elemanları listeleme
    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
     // Listenin başını döndürme
     public Node<T> getHead() {
        return head;
    }
    
    }