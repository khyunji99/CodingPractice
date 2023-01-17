import java.util.ArrayList;

public class EX1_ListNode {
    public static void main(String[] args) { // 메인 함수 (결과값 출력하는 곳)

        Node head = new Node(1);
        head.append(2);
        head.append(3);
        head.append(4);
        head.append(5);

        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        while(even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

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
        ListNode odd = head;       // 맨 처음 값을 head 라고 한다. 맨처음으로 들어오는 값 1은 순서가 1번으로 홀수 번수이다.
        ListNode even = head.next; // head 노드에 가지고 있는 next 라는 공간(노드가 가지고 있는 필드)에 그 다음값인 2가 들어있다.
        ListNode evenHead = even;

        while(even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;  // 짝수 순번들이 연결되어있는 리스트의 첫번째 값을 홀수 순번들이 연결되어있는 리스트의 마지막
        return head;
    }


    public static class Node { // 리스트노드 구현 클래스
        int data;          // 본인 자신의 값
        Node next = null;  // 다음 노드의 값이 담기는 변수

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
