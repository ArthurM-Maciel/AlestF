public class DoubleLinkedListOfInteger {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public DoubleLinkedListOfInteger() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void staticToDynamic(Integer[] staticList) {
        for (int i = 0; i < staticList.length; i += 2) {
            int value = staticList[i];
            add(value);
        }
    }

    public int findPositionMin() {
        if (head == null) {
            return -1;
        }

        Node current = head;
        int minValue = current.data;
        int minPosition = 0;
        int currentPosition = 0;

        while (current != null) {
            if (current.data < minValue) {
                minValue = current.data;
                minPosition = currentPosition;
            }
            current = current.next;
            currentPosition++;
        }
        return minPosition;
    }

    public void removeLowerThan(int value) {
        Node current = head;
        while (current != null) {
            if (current.data < value) {
                Node toRemove = current;
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                current = current.next;
                size--;
                continue;
            }
            current = current.next;
        }
    }

    public DoubleLinkedListOfInteger splitLists(int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        DoubleLinkedListOfInteger newList = new DoubleLinkedListOfInteger();
        Node current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        while (current != null) {
            newList.add(current.data);
            current = current.next;
        }

        if (current != null) {
            current.prev.next = null;
            tail = current.prev;
        }

        size -= newList.size;
        return newList;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}