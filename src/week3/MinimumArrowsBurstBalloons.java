package week3;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumArrowsBurstBalloons {


    public static void main(String[] args) {
        System.out.println(findMinArrayShots(new int[][] {{3,9},{7,12},{3,8},{6,8},{9,10},{2,9},{0,9},{3,9},{0,6},{2,8}}));
    }

    public static int findMinArrayShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(point -> point[1]));
        int counter = 0;
        int currentNum = 0;
        int currentIndex = 0;

        if(points.length == 1) {
            return ++counter;
        }

        for(int i = 0; i < points.length-1; i=currentIndex) {

            currentNum = points[i][1];

            if(currentNum >= points[i+1][0] && currentNum <= points[i+1][1]) {
                counter++;
                currentIndex = i+2;
                while(currentIndex < points.length && currentNum >= points[currentIndex][0] && currentNum <= points[currentIndex][1]) {
                    currentIndex++;
                }
                if(currentIndex == points.length-1) {
                    counter++;
                }
            } else {
                ++counter;
                currentIndex++;

                if(currentIndex == points.length-1) {
                    ++counter;
                }
            }

        }

        return counter;
    }
}
