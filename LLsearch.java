public class LLsearch {
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
    public static int size;
    public void addFirst(int data){

        //step1 = create new node;
        Node newNode = new Node(data);
        size++;
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
        size++;
        if(head==null){
            head = tail = newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print()  //O(n) is the time complexity..
    {
        if(head == null){
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    } 
    public void add_M(int idx,int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head; int i=0;
        while(i<(idx-1)){
            temp = temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int search(int key){
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        //when key not found
        return -1;
    }
    public static void main(String args[]){
        LLsearch ll = new LLsearch();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(9);
        ll.addLast(4);
        ll.add_M(2,3);

        ll.print();
        System.out.println(ll.search(3));
        System.out.println(ll.search(10));
    }
}
