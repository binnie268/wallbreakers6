package week3;

public class IsSubsequence {

    public static void main(String[] args) {
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        int subSequenceIndex = 0;

        if(s.isEmpty()) {
            return true;
        }
        for(int i = 0; i < t.length(); i++) {
            if(s.charAt(subSequenceIndex) == t.charAt(i)) {
                subSequenceIndex++;
            }

            if(subSequenceIndex == s.length()) {
                return true;
            }

        }



        return false;
    }
}
