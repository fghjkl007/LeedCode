package com.leetcode;

public class L328_Odd_Even_Linked_List {
    public static void main(String args[]){
        ListNode one = new ListNode(2);
        ListNode two = new ListNode(1);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(5);
        ListNode five = new ListNode(6);
        ListNode six = new ListNode(4);
        ListNode seven = new ListNode(7);
        ListNode eight = new ListNode(8);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        seven.next = eight;

        one = oddEvenList2(one);
        while(one!=null){
            System.out.println(one.val);
            one = one.next;

        }

    }

    public static ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode pointNode = head.next;
        ListNode current = pointNode;
        int count = 1;
        while(current.next!=null){
            if(count%2==1) {
                ListNode nodeToInsert = current.next;
                current.next = current.next.next;
                insertNode(head, pointNode, nodeToInsert);

            }else current = current.next;
            count++;
        }
        return head;
    }

    private static void insertNode(ListNode head, ListNode pointNode, ListNode nodeToInsert) {
        while(head.next!=null){
            if(head.next == pointNode){
                nodeToInsert.next = pointNode;
                head.next = nodeToInsert;
                break;
            }else head = head.next;
        }
    }

    public static ListNode oddEvenList2(ListNode head) {
        if (head != null) {
            ListNode odd = head, even = head.next, evenHead = even;

            while (even != null && even.next != null) {
                odd.next = odd.next.next;
                even.next = even.next.next;
                odd = odd.next;
                even = even.next;
            }
            odd.next = evenHead;
        }
        return head;
    }

}
