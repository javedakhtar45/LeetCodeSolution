class Solution {
    public int addDigits(int num) {


        return num!=0 && num%9==0?9:num%9;
        
    }
}
//         while (num >= 10) {
//             int sum = 0;

//             while (num > 0) {
//                 int digit = num % 10;
//                 sum = sum + digit;
//                 num = num / 10;
//             }

//             num = sum;
//         }

//         return num;
//     }
// }