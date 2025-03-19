public class Queue {
    private int front;
    private int rear;
    private int size;
    private int[] queue;

    // Constructor to initialize the queue
    public Queue(int capacity) {
        size = capacity;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    // Check if the queue is full
    public boolean isFull() {
        return rear == size - 1;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == -1 || front > rear;
    }

    // Add an element to the queue (enqueue)
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot enqueue " + data);
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear++;
        queue[rear] = data;
        System.out.println("Enqueued: " + data);
    }

    // Remove an element from the queue (dequeue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1;
        }

        int removed = queue[front];
        front++;
        System.out.println("Dequeued: " + removed);
        return removed;
    }

    // View the front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty! No front element.");
            return -1;
        }

        return queue[front];
    }

 
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

 
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();      

        System.out.println("Front element is: " + q.peek());

        q.dequeue();          
        q.display();          

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);       

        q.display();          
    }
}
