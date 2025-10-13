public class ReverseList {

  
  static class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
      val = x;
    }
  }

 
  public static ListNode reverseIterative(ListNode head) {
    ListNode prev = null, curr = head;
    while (curr != null) {
      ListNode nextTemp = curr.next;
      curr.next = prev;
      prev = curr;
      curr = nextTemp;
    }
    return prev;
  }


  public static ListNode reverseRecursive(ListNode head) {
    if (head == null || head.next == null) return head;
    ListNode p = reverseRecursive(head.next);
    head.next.next = head;
    head.next = null;
    return p;
  }

  
  private static void print(ListNode n) {
    while (n != null) {
      System.out.print(n.val + " ");
      n = n.next;
    }
  }


  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);

    System.out.println("Original List:");
    print(head);
    System.out.println();

    System.out.println("Reversed (Iterative):");
    ListNode reversed = reverseIterative(head);
    print(reversed);
    System.out.println();

    System.out.println("Reversed Back (Recursive):");
    ListNode back = reverseRecursive(reversed);
    print(back);
    System.out.println();
  }
}
