class Solution {
    public boolean isPalindrome(String s) {
        String newString = "";
        
        for (Character c : s.toCharArray()) {
            if (Character.isDigit(c) || Character.isLetter(c)) {
                newString += c;
            }
        }
       
        newString = newString.toLowerCase();
        int l = 0;
        int r = newString.length()-1;

        while (l <= r) {
            if (newString.charAt(l) != newString.charAt(r)) {
                return false;
            }
            l+=1;
            r-=1;
        }
        return true;
    }
}
