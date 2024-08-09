class MiddleLL {
    Node head; // head of the list

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Function to print the middle of the linked list
    void printMiddle() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node slowPointer = head;
        Node fastPointer = head;

        // Move fastPointer by two nodes and slowPointer by one node each time
        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }

        // slowPointer now points to the middle node
        System.out.println("The middle element is: " + slowPointer.data);
    }

    // Function to add a new node at the end of the list
    void append(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = new_node;
    }

    public static void main(String[] args) {
        MiddleLL list = new MiddleLL();
        
        // Adding elements to the linked list
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        // Printing the middle element
        list.printMiddle();
    }
}

