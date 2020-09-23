public class MyLinkedListQueue<E> {
    private Node head;
    private Node tail;

    public MyLinkedListQueue() {
        this.head = head = null;
        this.tail = tail = null;
    }

    class Node {
        public E key;
        public Node next;

        public Node(E key) {
            this.key = key;
            this.next = null;
        }
    }

    public void enqueue(E ele) {
        Node temp = new Node(ele);

        if (this.tail == null){
            this.head = this.tail = temp;
        }else {
            this.head.next = temp;
            this.tail = temp;
        }
    }

    public Node dequeue(){
        if (this.head == null)
            return null;
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temp;
    }
}
