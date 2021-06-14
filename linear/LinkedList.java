package linear;

import linear.components.Node;

public class LinkedList<T> {

    private Node<T> head;
    private Node<T> tail;

    public LinkedList(T head) {
        setHead(head);
        setTail(this.head);
    }

    public void push(T nextItem) {
        var nextNode = new Node<T>(nextItem);
        this.tail.setNextNode(nextNode);
        setTail(nextNode);
    }

    public void printList() {
        var currentNode = head;
        do {
            System.out.println(currentNode);
            currentNode = currentNode.getNextNode();
        }
        while (currentNode != head);
    }

    private void setTail(Node<T> tail) {
        this.tail = tail;
        this.tail.setNextNode(head);
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setHead(T head) {
        this.head = new Node<T>(head);
    }

    public Node<T> getHead() {
        return head;
    }
}
