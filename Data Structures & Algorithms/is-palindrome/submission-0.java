class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            else if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            else if(Character.isLetterOrDigit(s.charAt(left)) && Character.isLetterOrDigit(s.charAt(right))){
                if(s.toLowerCase().charAt(left) == s.toLowerCase().charAt(right)){
                    left++;
                    right--;
                }else{
                    return false;
                }
            }

        }
        return true;
    }
}


