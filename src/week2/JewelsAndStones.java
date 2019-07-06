package week2;

public class JewelsAndStones {

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("Aa", "aAAbbbb"));
    }

    public static int numJewelsInStones(String J, String S) {
        String[] charArray = S.split("");
        int count = 0;
        for(int i = 0; i < charArray.length; i++) {
            if (J.contains(charArray[i])) {
                count++;
            }
        }

        return count;
    }
}
