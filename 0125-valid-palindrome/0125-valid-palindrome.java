
class Solution {
    public boolean isPalindrome(String s) {
       if(s.isEmpty())return true;
       int left = 0 , right = s.length()-1;

       while(left<=right){
        char curr_f=s.charAt(left);
        char curr_l=s.charAt(right);

        if(!Character.isLetterOrDigit(curr_f)){
            left++;
        }else if(!Character.isLetterOrDigit(curr_l)){
            right--;
        }else{
            if(Character.toLowerCase(curr_f) !=Character.toLowerCase(curr_l))return false;
            left++;
            right--;
        }
       
        }
         return true;
    }
}



