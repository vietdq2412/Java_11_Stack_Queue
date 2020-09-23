public class MyQueue {
    Node front;
    Node rear;

    public void enqueue(int data) {
        Node temp = new Node(data);

        if (front == null) {
            front = temp;
        } else rear.next = temp;

        rear = temp;
        rear.next = front;
    }

    public Node dequeue() {
        if (this.front == null) return null;

        Node temp = front;

        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
            rear.next = front;
        }


        return temp;
    }

    void displayQueue() {
        if (this.front == null) {
            System.out.println("nothing here!");
            return;
        }
        Node temp = this.front;
        System.out.printf(" Elements in Circular Queue are: ");
        while (temp.next != front) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.printf("%d", temp.data);
        System.out.println("");
    }
}
