public class LinkedList {
    private Node first;
    private Node last;

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public LinkedList() {
        first = null;
        last = null;
    }

    public void addFirst(int value) {
        // if the list is empty, then add newNode to the beginning
        Node newNode = new Node(value);
        if (first == null) {
            first = newNode;
            last = newNode;
        }
        else {
            // need to swap current first node with newNode
            Node secondNode = first;
            first = newNode;
            newNode.next = secondNode;
        }
    }

    public void addLast(int value) {
        Node newNode = new Node(value);
        // check if list is empty
        if (first == null) {
            first = newNode;
            last = newNode;
        }
        else {
            last.next = newNode;
            last = newNode;
        }
    }

    public void removeFirst() {
        if (first == null) {
            System.out.println("No element to remove");
        }
        else {
            first = first.next;
        }
    }

    public void removeLast() {
        // find the element before last
        if (first == null) {
            System.out.println("No element to remove");
        }
        else {
            Node curr = first;
            while (curr.next != last) {
                curr = curr.next;
            }
            // curr should be at the second to last item
            last = curr;
            last.next = null;
        }
    }

    public void print() {
        Node curr = first;
        while (curr != null) {
            System.out.println(curr.value);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        var list = new LinkedList();
        list.addFirst(1);
        list.addFirst(3);
        list.addFirst(5);
        list.addLast(2);
        list.removeLast();
        list.print();
    }

}