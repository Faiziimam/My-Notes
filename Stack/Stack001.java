package Stack;

import java.util.EmptyStackException;

public class Stack001 {
    private Node top;

    private static class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void push(int data) {
        Node temp = new Node(data);
        temp.next = top;
        top = temp;
    }

    public int pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        int temp = top.data;
        top = top.next;
        return temp;
    }

    public int peek() {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public static void main(String[] args) {

        Stack001 obj = new Stack001();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        System.out.println(obj.peek());
        obj.pop();
        System.out.println(obj.peek());
        obj.pop();
        System.out.println(obj.peek());
        obj.pop();

    }
}