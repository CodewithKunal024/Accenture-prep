

public class DeleteMiddle {
    Node head;
        static class Node{
            int data;
            Node next;
            Node(int d){
                this.data=d;
                this.next=null;
            }

        }
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
    void DeleteMiddleElement(){
        Node slow=head;
        Node fast=head;
        Node prev=null;
        while(fast!=null&& fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        if(prev!=null){
            prev.next=slow.next;
        }
    }
    void printList() {
        Node currentNode = head;  // Start from the head node

        // Traverse the list and print each node's data
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();  // Print a newline at the end
    }
    public static void main(String[] args) {
        DeleteMiddle list = new DeleteMiddle();
        
        // Adding elements to the linked list
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.DeleteMiddleElement();

        // Printing the middle element
        list.printList();
    }
}
    


