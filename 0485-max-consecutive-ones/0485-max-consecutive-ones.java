class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int res=0, temp=0;
        for(int i=0;i<=nums.length-1;i++){ 
            if(nums[i]==1){
                temp++;
            }
            else{
                if(temp>res){
                    res=temp;
                }
            temp=0;
            }
        }
        if(temp>res){
            res=temp;
        }
        return res;
    }
    
}