public class doublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;

        // Add
        public void addF(int data){
            Node newNode = new Node(data);
            size++;
            if(head == null){
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        public int removeF(int data){
            if(head == null){
                System.out.println("null");
                return Integer.MIN_VALUE;
            }
            if(size == 1){
                int val = head.data;
                head = tail = null;
                size--;
                return val;
            }
            int val = head.data;
            head = head.next;
            head.prev = null;
            size--;
            return val;
        }
        public void print_ll(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
            System.out.println("null");
        }
    public static void main(String args[]){
        doublyLL dll = new doublyLL();
        dll.addF(3);
        dll.addF(2);
        dll.addF(1);
        dll.print_ll();
        System.out.println(dll.size);
        dll.removeF(1);
        dll.print_ll();
        System.out.println(dll.size);
    }

}
