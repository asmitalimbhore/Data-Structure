public class insertInLinkedList {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class LinkedList{
         Node head=null;
         Node tail=null;

         //insert at end
         void InsertAtEnd(int data){
            Node temp = new Node(data);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
                tail = temp;
            }     
         }
         //insertAtStart
         void insertAtStart(int data){
            Node temp = new Node(data);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                temp.next=head;
                head = temp;
            }     

         }
         //insert at any index
         void insertAt(int idx,int data){
            Node t = new Node(data);
            Node temp = head;
            for(int i = 1;i<idx-1;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
         }
         //delete node
         void deleteAt(int idx){
            if(idx==0)head = head.next;
            Node temp = head;
            for(int i = 1;i<idx-1;i++){
                temp=temp.next;
            }
            temp.next = temp.next.next;
            tail=temp;
        }

         //length of linkedlist
         int size(){
            Node temp = head;
            int count = 0;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            return count;

        }

         //display
         void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
         }
    }
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList(); 
        l1.InsertAtEnd(4);
        l1.InsertAtEnd(5);
        l1.InsertAtEnd(7);
        l1.insertAtStart(2);
        l1.insertAt(1, 9);
        System.out.println(l1.size());
        l1.display();
        l1.deleteAt(2);
        l1.display();
        

        
    }
    
}
