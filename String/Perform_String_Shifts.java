class Solution {
    public String stringShift(String s, int[][] shift) {
        
        for(int i=0;i<shift.length;i++)
        {
            int op=shift[i][0];
            switch(op){
                case 0:
                    int k=shift[i][1];
                    k=k%s.length();
                    s=s.substring(k,s.length())+s.substring(0,k);
                    break;
                case 1:
                    k=shift[i][1];
                    k=k%s.length();
                    s=s.substring(s.length()-k)+s.substring(0,s.length()-k);
            }
        }
        return s;
        
    }
}