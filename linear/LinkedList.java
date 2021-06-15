package linear;

import java.util.NoSuchElementException;

public class LinkedList<T> {
    
    private class Node {
        private T data;
        private Node nextNode;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public void addLast(T item) {
        var node = new Node(item);
        
        if (isEmpty())
            initList(node);
        else {
            tail.nextNode = node;
            tail = node;
        }
    }

    public void addFirst(T item) {
        var node = new Node(item);

        if (isEmpty())
            initList(node);
        else {
            node.nextNode = head;
            head = node;
        }
    }

    public int indexOf(T item) {

        Node currentItem = head;
        int count = 0;
        while (currentItem != null) {
            if (currentItem.data.equals(item)) return count;
            currentItem = currentItem.nextNode;
            ++count;
        }

        return -1;
    }

    public boolean contains(T item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {

        if (isEmpty())
            throw new NoSuchElementException("Can't remove from empty list.");

        if (head == tail) {
            head = tail = null;
            return;
        } 

        Node currentHead = head;
        head = currentHead.nextNode;
        currentHead.nextNode = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    private void initList(Node node) {
        head = tail = node;
    }
}