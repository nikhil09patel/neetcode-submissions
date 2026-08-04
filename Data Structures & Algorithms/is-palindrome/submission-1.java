class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();
        StringBuilder rev_str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                cleaned.append(Character.toLowerCase(ch));
            }
        }

        for (int i = cleaned.length() - 1; i >= 0; i--) {
            rev_str.append(cleaned.charAt(i));
        }

        if(rev_str.toString().equals(cleaned.toString())) {
            return true;
        }
        return false;
    }
}
