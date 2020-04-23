class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null)
        {
            return null;
        }
        
        return constructTree(head);
    }
    
    public TreeNode constructTree(ListNode head)
    {
        if(head==null)
        {
            return null;
        }
        if(head.next==null)
        {
            return new TreeNode(head.val);  //this is to handle single node; suppose if there is only one node left;
        }
        
        //Now we need to find mid pointer of present list;
        
        ListNode prev=null;
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode left=head; //this is left list;
        if(prev!=null)
        {
          prev.next=null;  
        }
        
        ListNode mid=slow; 
        
        ListNode right=slow.next;  //right list;
        
        
        //constructing tree;
        TreeNode root=new TreeNode(mid.val);
        
        root.left=constructTree(left);
        root.right=constructTree(right);
        
        return root;
        
        
        
    }
}