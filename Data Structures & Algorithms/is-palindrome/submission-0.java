class Solution {
    public boolean isPalindrome(String s) {
        String cleaned_str = "";
        String rev_str = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                cleaned_str += ch;
            }
            
        }
        cleaned_str = cleaned_str.toLowerCase();

        for (int i = cleaned_str.length() - 1; i >= 0; i--) {
            rev_str += cleaned_str.charAt(i);
        }

        if(rev_str.equals(cleaned_str)) {
            return true;
        }
        return false;
    }
}
