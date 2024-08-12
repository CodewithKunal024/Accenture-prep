public class CycleLL {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    void AddNode(int new_data){
        Node obj= new Node(new_data);
        if(head==null){
            head=obj;
            return;

        }
        Node last=head;
        while(last.next!=null){
        last=last.next;
        }
        last.next=obj;
    }
    public boolean detectCycle(){
        Node slow=head;
        Node fast= head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                return true;
            }

        }
        return false;
    }
    void printList() {
        Node currentNode = head;  // Start from the head node

        // Traverse the list and print each node's data
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println();  // Print a newline at the end
    }
    public static void main(String[] args) {
CycleLL list=new CycleLL();
list.AddNode(10);
list.AddNode(20);
list.AddNode(30);
list.AddNode(40);
list.AddNode(50);
list.head.next.next.next.next=list.head.next.next;
System.out.println(list.detectCycle());
    } 
}
