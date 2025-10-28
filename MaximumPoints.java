class Solution {
    public int maxScore(int[] c, int k) {
        int lsum=0,rsum=0,m=0;
        for(int i=0;i<=k-1;i++)
        {
           lsum=lsum+c[i];
        }
        m=lsum;
        int rindex=c.length-1;
        for(int i=k-1;i>=0;i--)
        {
            lsum=lsum-c[i];
            rsum=rsum+c[rindex];
            rindex--;
        m=Math.max(m,lsum+rsum);
        }
        return m;
    }
}
