package com.company;

import java.util.HashMap;
import java.util.Map;

public class FriendCircles {

    public static void main(String[] args) {
        int[][] a = {{1,0,0,1}, {0,1,1,0}, {1,0,1,1}};
        System.out.println(findCircleNum(a));
    }

    public static int findCircleNum(int[][] M) {
        Map<Integer,String> trackMap = new HashMap<Integer, String>();
        int count;
        int directCount = 0;
        int trackCount;
        for(int i = 0; i <= M.length-1; i++ ) {
            count = 0;
            trackCount = M.length-1;
            if(i == M.length-1 && trackMap.get(i) == null) {
                ++directCount;
            }
            while(trackCount >= 0 && M.length - i >= i) {
                if(M[i][count] == 1) {
                    if((i != 0 || count !=0) && count > i) {
                        if(M[count][i] == 1) {
                            if(trackMap.get(i) != null && trackMap.get(i).contentEquals("hasRoot")) {

                            } else {
                                trackMap.put(count,"hasRoot");
                                directCount++;
                                break;
                            }

                        }
                    }

                    count++;
                    trackCount--;
                } else {
                    trackCount--;
                    count++;
                }


                if(trackCount < 0 && count < M.length-1 && M[i][count] != 1) {
                    directCount++;
                    break;
                }
            }

        }

        return directCount;
    }
}
