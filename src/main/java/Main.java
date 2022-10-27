public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode four = new ListNode(4);

        ListNode two = new ListNode(2);
        two.next = four;

        ListNode one = new ListNode(1);
        one.next = two;

        ListNode nine = new ListNode(9);
        nine.next = one;

        ListNode aHead = new ListNode(1);
        aHead.next = nine;

        ListNode bHead = new ListNode(3);
        bHead.next = two;

        ListNode answer = solution.getIntersectionNode(aHead, bHead);
        System.out.println("Example One : " + answer.val);
    }
}
