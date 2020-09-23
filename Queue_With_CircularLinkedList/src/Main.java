public class Main {
    public static void main(String[] args) {

        MyQueue q = new MyQueue();
        q.front = q.rear = null;


        q.enqueue(14);
        q.enqueue(22);
        q.enqueue(6);

        q.displayQueue();



        System.out.println("\nfirst delete:");
        q.dequeue();
        q.displayQueue();

        q.dequeue();
        System.out.println("\nsecond delete");
        q.displayQueue();

        System.out.println("\nenqueue 9,20:");

        q.enqueue(9);
        q.enqueue(20);
        q.displayQueue();

    }
}

