public class LL_addFandL {
    public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){

        //step1 = create new node;
        Node newNode = new Node(data);

        if(head==null){
            head = tail = newNode;
            return;
        }

        
        //step2 = newNode next=head;
        newNode.next = head;          //linking step

        //step3 : head = newNode
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public static void main(String argss[]){
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
    }
}
