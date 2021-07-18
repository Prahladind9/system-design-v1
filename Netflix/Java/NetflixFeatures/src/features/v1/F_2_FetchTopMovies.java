package features.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * Feature #2: Fetch Top Movies
 */
public class F_2_FetchTopMovies {

    /**
     * 0) Visualize the problem
     *      a) we'll be given n arrays that are all sorted in ascending order of popularity rank
     *          1 - most popular ...
     *      b) we have to combine these lists into a single list that will be sorted by rank ascending
     *          best to worst
     *
     * 1) Verify the constraints
     * 2) Write test cases
     *
     * 3) Figure out a solution without code
     *      a) Consider the first list as the result, and store it in a variable
     *      b) Traverse the list of lists, starting from the second list,
     *          and combine it with the list we stored as a result.
     *          The result should get stored in the same variable.
     *      c) When combining the two lists, like l1 and l2,
     *          maintain a prev pointer that points to a dummy node.
     *      d) If l1[val] <= l2[val], connect previous node to l1 and increment l1.
     *          Otherwise, do the same but for list l2
     *      e) Keep repeating the above step until one list points to a null value
     *      f) Connect the non-null list to the merged one and return
     *
     * 4) Write solution
     * 5) Double check for errors - syntax/errors
     * 6) Test code
     * 7) Analysis
     *      TimeComplexity: O(k * n), where k number of lists & n max length of a single list
     *      SpaceComplexity: O(1)
     */


    public static LinkedListNode merge2Country(LinkedListNode l1, LinkedListNode l2) {
        LinkedListNode dummy = new LinkedListNode(-1);

        LinkedListNode prev = dummy;
        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                prev.next = l1;
                l1 = l1.next;   //increment l1
            } else {
                prev.next = l2;
                l2 = l2.next;   //increment l2
            }
            prev = prev.next;   //increment prev
        }

        if (l1 == null)
            prev.next = l2;
        else
            prev.next = l1;

        return dummy.next;
    }

    public static LinkedListNode mergeKCounty(List<LinkedListNode> lists) {

        if (lists.size() > 0){
            LinkedListNode res = lists.get(0);

            for (int i = 1; i < lists.size(); i++)
                res = merge2Country(res, lists.get(i));

            return res;
        }
        return new LinkedListNode(-1);
    }

    public static void main(String[] args) {

        LinkedListNode a = createLinkedList(new int[] {11,41,51});
        LinkedListNode b = createLinkedList(new int[] {21,23,42});
        LinkedListNode c = createLinkedList(new int[] {25,56,66,72});

        List<LinkedListNode> list1 = new ArrayList<>();
        list1.add(a);
        list1.add(b);
        list1.add(c);

        System.out.print("All movie ID's from best to worse are:\n");
        display(mergeKCounty(list1));
    }


    public static LinkedListNode createLinkedList(int[] arr) {
        LinkedListNode head = null;
        LinkedListNode tail = null;
        for (int i = 0; i < arr.length; ++i) {
            LinkedListNode newNode = new LinkedListNode(arr[i]);
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }
        return head;
    }

    public static void display(LinkedListNode head) {
        LinkedListNode temp = head;
        while (temp != null) {
            System.out.printf("%d", temp.data);
            temp = temp.next;
            if (temp != null) {
                System.out.printf(", ");
            }
        }
        System.out.println();
    }
}

class LinkedListNode {
    public int data;
    public LinkedListNode next;

    public LinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
