public class 找单链表中第k个元素 {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        list.addNode(7);
        list.addNode(8);
        list.addNode(9);
        Node head = list.head;

        找单链表中第k个元素 k = new 找单链表中第k个元素();
        Node node = k.findK(2,list.head);
        System.out.println(node.data);

    }

    public Node findK(int k,Node head){
        Node temp = head;
        Node tail = null;
        for (int i=0;i<k-1;i++){
            if (temp!=null){
                temp = temp.next;
            }else{
                break;
            }
        }
        tail =head;
        if (temp==null){
            System.out.println("k wrong");
        }else{
            while (temp.next!=null){
                temp = temp.next;
                tail = tail.next;
            }
            return tail;
        }
        return null;
    }
}
