import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        while(l1 != null) {
            sb1.append(l1.val);
            l1 = l1.next;
        }
        sb1 = sb1.reverse();
        while(l2 != null) {
            sb2.append(l2.val);
            l2=l2.next;
        }
        sb2 = sb2.reverse();
        BigInteger v1 = new BigInteger(sb1.toString());
        BigInteger v2 = new BigInteger(sb2.toString());
        v1 = v1.add(v2);
        StringBuilder sb = new StringBuilder(v1.toString());
        String str = sb.reverse().toString();
        ListNode ret = new ListNode(Character.getNumericValue(str.charAt(0)));
        ListNode root = ret;
        for(int i=1;i<str.length();i++) {
            ListNode temp = new ListNode(Character.getNumericValue(str.charAt(i)));
            ret.next = temp;
            ret = ret.next;
        }
        return root;
    }
}

