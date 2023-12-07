public class pro_queue {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;
        public static boolean isempty(){
            return (head == null);
        } 

        //add

        public static void enqueue(int data){
            Node newNode = new Node(data);
            if(isempty()){
                head = tail = newNode;
            }
            tail.next = newNode;
            tail = newNode;
        }
        // dequeue
        public static int dequeue(){
            if(isempty()){
                System.out.println("The queue is empty");
                return -1;
            }
            int top = head.data;
            if(tail == head){
                tail = head = null;
            }else{
                head = head.next;
            }
            return top;
        }
        public static int peek(){
            if(isempty()){
                System.out.println("The queue is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.dequeue();
        while(!q.isempty()){
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}
