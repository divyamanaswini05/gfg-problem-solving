class Solution {
    public static int distributeTicket(int n, int k) {
        // code here
        boolean flag=true;
        int f=1;
        while(f<=n){
            if(flag==true){
                if(f+k-1>=n){
                    return n;
                }
                f=f+k;
            }
            else{
                if(n-k+1 <= f){
                    return f;
                }
                n=n-k;
            }
            flag=!flag;
        }
        return k;
    }
}