class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int rem = purchaseAmount%10;
        if(rem>=5){
            purchaseAmount+=(10-rem);
        }
        else if(rem<5){
            purchaseAmount-=rem;
        }
        
    return 100-purchaseAmount;
        
    }
}