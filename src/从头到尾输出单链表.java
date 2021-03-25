public class 从头到尾输出单链表 {
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

        从头到尾输出单链表 main = new 从头到尾输出单链表();
        main.printListReversely(head);

    }
    public void printListReversely(Node node){
        if (node!=null){
            printListReversely(node.next);
            System.out.println(node.data);
        }
    }
}
