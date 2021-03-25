import java.util.HashSet;

public class 从链表中删除重复数据 {


    public void deleteDuplecate(Node head){
        Node temp = head;
        Node pre = null;
        HashSet<Integer> set = new HashSet<Integer>();

        while (temp!=null){
            if (set.contains(temp.data)){
                pre.next = temp.next;
            }else{
                set.add(head.data);
                pre = temp;
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        Node node1 = new Node(9);
        Node node2 = new Node(5);
        Node node3 = new Node(3);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;

        从链表中删除重复数据 delete = new 从链表中删除重复数据();
        delete.deleteDuplecate(head);

        while (head!=null){
            System.out.printf(head.data+" ");
            head = head.next;
        }
    }

}
