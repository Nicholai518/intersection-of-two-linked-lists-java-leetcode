public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // one or both of the lists are null
        // there is no intersection
        if (headA == null || headB == null) {
            return null;
        }

        // pointers to help us traverse through each linked list
        ListNode aPointer = headA;
        ListNode bPointer = headB;

        while (aPointer != bPointer) {

            // we have reached the end of Linked List A
            if (aPointer == null) {

                // begin searching Linked List B
                aPointer = headB;
            }

            // we are not at the end of Linked List A
            // continue to traverse through Linked List A
            else {
                aPointer = aPointer.next;
            }


            // we have reached the end of Linked List B
            if (bPointer == null) {

                // begin searching Linked List A
                bPointer = headA;
            }

            // we are not at the end of Linked List B
            // continue to traverse through Linked List B
            else {
                bPointer = bPointer.next;
            }
        }

        // while loop will loop until we find intersection point
        return aPointer;
    }
}
