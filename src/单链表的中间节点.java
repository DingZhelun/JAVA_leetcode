public class 单链表的中间节点 {
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

        单链表的中间节点 main = new 单链表的中间节点();
        Node mid = main.findMidNode(list.head);
        System.out.println(mid.data);

    }
    public Node findMidNode(Node node){
        Node head = node;
        Node mid = head;

        while (node!=null && head.next!=null && head.next.next!=null){
            head = head.next.next;
            mid = mid.next;
        }
        return mid;


    }
}
