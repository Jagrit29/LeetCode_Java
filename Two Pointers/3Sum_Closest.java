class Solution {
    public int threeSumClosest(int[] A, int k) {

        long close=Integer.MAX_VALUE;
        long ans=0;
        
        Arrays.sort(A);
        
        for(int i=0;i<A.length-2;i++)
        {
            int left=i+1;
            int right=A.length-1;
            
            while(left<right)
            {
                long sum=A[i]+A[left]+A[right];
                
                long diff=Math.abs(sum-k);
                if(diff<close)
                {
                    //System.out.println(diff);
                    close=diff;
                    ans=sum;
                }
                if(sum==k)
                {
                    left++;
                    right--;
                }
                else if(sum<k)
                {
                    left++;
                }
                else
                {
                    right--;
                }
            }
        }
        return (int)ans;
    }
}
