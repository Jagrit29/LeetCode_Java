
class Solution {
    
    int count=0;
    public int countArrangement(int N) {
        
        if(N==0)
        {
            return 0;
        }
        
        backtrack(N,1,new boolean[N+1]);
        
        return count;
        
    }
    
    //we start from 1;
    
    public void backtrack(int N,int index,boolean used[])
    {
        if(index>N)
        {
            count++;
            return;
        }
        
        //Now we need to make our choices, when we can go when not;
        
        for(int i=1;i<=N;i++)
        {
            //now if we have used[i] then conitnue;
            if(used[i]==true)
            {
                continue;
            }
            
            //if we havnt
            if(i%index==0 || index%i==0) //here our index is pos and i is N;
            {
                used[i]=true;
                backtrack(N,index+1,used);
                used[i]=false;
            }
        }
    }
}