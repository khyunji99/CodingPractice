package src;

public class EX1_ListNode {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.append(2);
        head.append(3);
        head.append(4);
        head.append(5);

        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        System.out.println(even);
        System.out.println(evenHead);

        while (even != null && even.next != null) {
            odd.retrieve(); // 12345
            odd.next = even.next; // 345
            odd.retrieve(); // 1345
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        head.retrieve();
    }


    public static ListNode oddEvenList(ListNode head) { // 리스트 정렬하는 코드 구현한 함수
        // ex) 받는 값 : 1 -> 2 -> 3 -> 4 -> 5
        //     출력 값 : 1 -> 3 -> 5 -> 2 -> 4
        //  ( 순서가 홀수인 값들이 먼저 앞으로 정렬되고 그 다음으로 순서가 짝수인 값들이 정렬되는 리스트 출력하기 )

        // edge cases
        if (head == null) {
            return null;
        }
        // ListNode odd : 홀수 리스트노드의 next 를 바꿔주기 위한 포인터
        // ListNode even : 짝수 리스트노드의 next 를 바꿔주기 위한 포인터
        // head : 값 1을 가진 리스트노드
        // even : 값 2를 가진 리스트노드
        ListNode odd = head; // 맨 처음 값을 head 라고 한다. 맨처음으로 들어오는 값 1은 순서가 1번으로 홀수 번수이다.
        ListNode even = head.next; // head 노드에 가지고 있는 next 라는 공간(노드가 가지고 있는 필드)에 그 다음값인 2가 들어있다.
        ListNode evenHead = even;

        while (even != null && even.next != null) {

            odd.next = even.next; // even.next;
            odd = odd.next;
            even.next = odd.next; // odd.next;
            even = even.next;
        }

        // head = 1, 3, 5
        // evenHead = 2, 4
        odd.next = evenHead; // 짝수 순번들이 연결되어있는 리스트의 첫번째 값을 홀수 순번들이 연결되어있는 리스트의 마지막
        return head;
    }

    public static class ListNode { // 리스트노드 구현 클래스
        int val; // 본인 자신의 값
        ListNode next; // 다음 노드의 값이 담기는 변수

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public int getVal() {
            return val;
        }

        public ListNode getNext() {
            return next;
        }
    }

    public static class Node {
        int data;
        Node next = null;

        Node(int d) {
            this.data = d;
        }

        void append(int d) {
            Node end = new Node(d);
            Node n = this;
            while (n.next != null) {
                n = n.next;
            }
            n.next = end;
        }

        void retrieve() {
            Node n = this;
            while (n.next != null) {
                System.out.print(n.data + " -> ");
                n = n.next;
            }
            System.out.println(n.data);
        }
    }
}
//Definition for singly-linked list.
