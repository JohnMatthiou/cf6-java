package gr.aueb.cf.ch6;

public class QueueApp {
    static int[] queue = new int[100];
    static int pivot = -1;

    public static void main(String[] args) {
        int num;
        for (int i = 0; i <= 100; i++) {
            enQueue(i + 1);
        }

        for (int i = 0; i <= 100; i++) {
            System.out.println("Next value in queue is: " + deQueue() );
        }


    }

    public static void enQueue(int num) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        queue[++pivot] = num;
    }

    public static int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return 0;
        }
        int valueToReturn = queue[0];
        pivot--;
        shiftQueueLeft();
        return valueToReturn;
    }

    public static void shiftQueueLeft() {
        for (int i = 0; i <= pivot; i++) {
            queue[i] = queue[i+1];
        }
    }

    public static boolean isEmpty() {
        return pivot == -1;
    }

    public static boolean isFull() {
        return pivot == queue.length - 1;
    }
}
