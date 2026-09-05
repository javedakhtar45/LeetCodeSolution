class Solution {
    public int maxProduct(int n) {
        int max1=0;
        int max2=0;
        int digit;
        while(n>0){
            digit=n%10;
            
            

            if(digit>max1){
                int temp=max1;
                max1=digit;
                max2=temp;
            }
            else if(digit>max2){
                max2=digit;
            }
            n=n/10;
        }return (max1*max2);
        
    }
}