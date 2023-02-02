package org.example.mergeSort;

public class MergeSortUsingListNode {
    public static void main(String[] args) {

        int[] intArray ={20, 23,55,-54,12,-34,67,89,98,76,90,10,2,8,-5,6,-3};

        ListNode head = null;
        for (int i=0; i < intArray.length; i++) {
            head = new ListNode (intArray[i], head);
        }

        printList(head);
        head = MergeSort(head);
        printList(head);
    }

    public static void printList(ListNode head){
        ListNode ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.val + " -> ");
            ptr = ptr.next;
        }

        System.out.println("null");
    }

    public static ListNode SortedMerge(ListNode lst1, ListNode lst2)
    {
        // Base cases
        if (lst1 == null)
            return lst2;

        else if (lst2 == null)
            return lst1;

        ListNode result;

        if (lst1.val <= lst2.val)
        {
            result = lst1;
            result.next = SortedMerge(lst1.next, lst2);
        }
        else
        {
            result = lst2;
            result.next = SortedMerge(lst1, lst2.next);
        }

        return result;
    }

    //splitting list into two halves
    public static ListNode[] FrontBackSplit(ListNode ptr)
    {
        // base case
        if (ptr == null || ptr.next == null) {
            return new ListNode[]{ ptr, null } ;
        }

        ListNode backward = ptr;
        ListNode forward = ptr.next;

        // Forward moves twice and backward moves once
        while (forward != null)
        {
            forward = forward.next;
            if (forward != null)
            {
                backward = backward.next;
                forward = forward.next;
            }
        }

        // splitting the linked list
        ListNode[] arr = new ListNode[]{ ptr, backward.next };
        backward.next = null;

        return arr;
    }

    // Sorting linked list using merge sort.
    public static ListNode MergeSort(ListNode head)
    {
        // Base case
        if (head == null || head.next == null) {
            return head;
        }

        ListNode[] arr = FrontBackSplit(head);
        ListNode first_half = arr[0];
        ListNode second_half = arr[1];


        first_half = MergeSort(first_half);
        second_half = MergeSort(second_half);

        // merge the two sorted list into single list.
        return SortedMerge(first_half, second_half);
    }

}
