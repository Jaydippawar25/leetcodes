class Solution {
    public boolean isPalindrome(int x) {

        
        int num = x;
        int rev = 0;

        while(x > 0){
            int sum = x % 10;
            rev = rev * 10 + sum;
            x = x / 10;
        }

        return num == rev ;
        
    }
}