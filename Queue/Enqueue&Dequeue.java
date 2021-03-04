package Queue;

class Enqueue {
    private node front;
    private node rear;
    private int length;

    public static class node {
        private int data;
        private node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Enqueue() {
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    public int Length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void enqueue(int data) {
        node temp = new node(data);
        if (isEmpty()) {
            front = temp;
        } else {
            rear.next = temp;
        }
        rear = temp;
        length++;

    }

    node deQueue() {
        if (isEmpty()) {
            return front;
        }
        node temp = front;
        front = temp.next;
        temp = null;
        return front;
    }

    void printQueue() {
        if (isEmpty()) {
            return;
        }
        node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println(temp);
    }

    public static void main(String[] args) {
        Enqueue obj = new Enqueue();
        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        obj.printQueue();
        obj.deQueue();
        obj.printQueue();
    }
}
