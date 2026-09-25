class Solution {
    public int thirdMax(int[] nums) {
        long max=Long.MIN_VALUE,sMax=Long.MIN_VALUE,tMax=Long.MIN_VALUE;
        for(int n:nums){
            if(n>max){
                tMax=sMax;
                sMax=max;
                max=n;
            }else if(n>sMax && n!=max){
               tMax=sMax;
                sMax=n; 
            }else if(n>tMax && n!=max && n!=sMax){
                tMax=n;

            }
        }
        if(tMax==Long.MIN_VALUE){
            return (int)max;
        }else{
            return (int)tMax;
        }
    }
}