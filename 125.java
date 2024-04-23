class Solution {
    public boolean isPalindrome(String s) {
        String newString = "";
        
        for (Character c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                newString += c;
            }
        }
       
        newString.toLowerCase();
        int l = 0;
        int r = newString.length()-1;

        while (l <= r) {
            if (newString.charAt(l) != newString.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
