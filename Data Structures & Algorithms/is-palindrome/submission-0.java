class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] charS = cleaned.toCharArray();
        int length = cleaned.length() ;

        for (int i = 0; i < length / 2; i++) {
            if (charS[i] != (charS[length -1- i])) {
                

                return false;
            }

        }
        return true;
    }
}