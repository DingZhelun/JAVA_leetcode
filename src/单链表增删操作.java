public class 单链表增删操作 {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addNode(5);
        list.addNode(3);
        list.addNode(1);
        System.out.println("listLen = "+list.lengh());
        System.out.println("befor order:");
        list.printList();
        list.orderList();
        System.out.println("after order:");
        list.printList();
    }
}
class Node{
    public int data;
    public Node next = null;
    public Node(int data){
        this.data = data;
    }
}

class MyLinkedList{
    Node head = null;

    public void addNode(int d){
        Node node = new Node(d);
        if (head == null){
            this.head = node;
        }else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public int lengh(){
        int i =0;
        Node temp = head;
        while (temp!=null){
            i++;
            temp = temp.next;
        }
        return i;
    }

    public Boolean deleteNode(int index){
        if (index<1 || index > this.lengh()){
            return false;
        }
        if (index == 1){
            head = head.next;
            return true;
        }else{
            int i = 2;
            Node preNode = head;
            Node curNode = head.next;

            while(index!=i){
                i++;
                preNode = preNode.next;
                curNode = curNode.next;
            }
            preNode.next = curNode.next;
            return true;
        }
    }

    public Node orderList(){
        Node nextNode = null;
        int temp = 0;
        Node curNode = head;

        while (curNode.next!=null){
            nextNode = curNode.next;
            while (nextNode!=null){
                if (curNode.data > nextNode.data){
                    temp = nextNode.data;
                    nextNode.data = curNode.data;
                    curNode.data = temp;
                }
                nextNode = nextNode.next;
            }
            curNode = curNode.next;
        }

        return head;
    }

    public void printList(){
        Node curNode = head;
        while (curNode != null){
            System.out.print(curNode.data+" ");
            curNode = curNode.next;
        }
    }
}
