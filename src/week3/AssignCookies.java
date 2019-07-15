package week3;

import java.util.Arrays;

public class AssignCookies {

    public static void main(String[] args) {

        System.out.println(findContentChildren(new int[]{10,9,8,7}, new int[]{5,6,7,8}));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int childIndex =0;

        if(s.length == 0) {
            return 0;
        }
        for(int cookieIndex = 0; childIndex < g.length && cookieIndex < s.length; cookieIndex++) {

            if(g[childIndex] <= s[cookieIndex]) {
                childIndex++;
            }
        }


        return childIndex;
    }
}
