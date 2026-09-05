class Solution {
    public String triangleType(int[] num) {
        if(num[0]+num[1]>num[2] && num[1]+num[2]>num[0] && num[2]+num[0]>num[1] ) {
            if(num[0]==num[1] && num[1]==num[2])
                return "equilateral";

            else if(num[0]==num[1]   || num[1]==num[2]  || num[0]==num[2] )
                return "isosceles";
            else
                return "scalene";

        }
        else{
            return "none";
        }
    }
}