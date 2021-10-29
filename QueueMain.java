package DSA;

import java.util.ArrayList;
import java.util.List;


class MyQueue {

    int front, rear, size;

    int capacity = 5;
    int queue[] = new int[capacity];


    // EN queue function
    public void enqueue(int data) {

        if (rear == capacity) {
            System.out.println("Queue is full");
            return;
        } else {
            queue[rear] = data;
            rear++;
            size++;
        }
        return;
    }


    public void deQueue() {
        // if queue is empty
        if (front == rear) {
            System.out.printf("\nQueue is empty\n");
            return;
        }
        // shift all the elements from index 2 till rear
        // to the right by one
        else {
            for (int i = front; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            // store 0 at rear indicating there's no element
            if (rear < capacity)
            queue[rear] = 0;

            // decrement rear
            rear--;
        }
        System.out.println("Element to dequeue" + queue[front]);

        return;
    }


    // print front of queue
    public void queueFront() {
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        System.out.printf("\nFront Element is: %d", queue[front]);
        return;
    }


    public void show() {

        int i;
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }

        // traverse front to rear and print elements
        for (i = front; i < rear; i++) {
            System.out.printf(" %d <-- ", queue[i]);
        }
    }
    // delete operation

    public void delete(int inputValue) {

        for (int x = 0; x < 5; x++) {

            if (queue[x] == inputValue) {

                queue[x] = 0;
            }
        }
    }
}
public class QueueMain {

    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        myQueue.enqueue(40);
        myQueue.enqueue(50);
        // myQueue.enqueue(60);


        System.out.println("Enqueue operation");
        myQueue.show();
        System.out.println();

        myQueue.deQueue();
        // myQueue.deQueue();


        System.out.println("Dequeue operation");

        myQueue.show();

        //     System.out.println("Delete operation");
        //    myQueue.delete(40);

        //    myQueue.show();

    }
}

