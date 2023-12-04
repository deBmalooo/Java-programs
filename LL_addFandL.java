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
    public int removefirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next; 
        size --;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev node: i=size-2
        Node prev = head;
        for(int i=0;i<size-2;i++){
           prev = prev.next; 
        }
        int val = head.data;
        prev.next = null;
        tail=prev;
        size--;
        return val;
    }
    public static void main(String argss[]){
        LL_addFandL ll = new LL_addFandL();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add_M(2,9);

        ll.print();

        System.out.print(ll.size);
        ll.removefirst();
        ll.print();


    }
}
