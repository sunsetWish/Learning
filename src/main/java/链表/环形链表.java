package 链表;

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class 环形链表 {
    /**
     * 给你一个链表的头节点 head ，判断链表中是否有环。
     * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
     * 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
     * 注意：pos 不作为参数进行传递。仅仅是为了标识链表的实际情况。
     * 如果链表中存在环，则返回 true 。 否则，返回 false 。
     * @param args
     */
    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {
        // 快慢指针 Java中准确来说称为 对象的引用
        ListNode car = head;
        ListNode bike = head;

        // 循环内 bike 每次后移一个结点， car 每次后移 2 个结点
        // car 和 car.next 需要不为空，否则会发生 空指针异常
        // car 不为空，那么 bike 肯定也不为空
        while (car!=null && car.next!=null){
            bike = bike.next;
            car = car.next.next;
            // 汽车追上自行车了，有环路
            if(car==bike){
                return true;
            }
        }
        return false;
    }
}

