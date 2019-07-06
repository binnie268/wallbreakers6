package week2;

import java.util.HashMap;
import java.util.Map;

public class UniqueMorseCodeWords {

    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        Map<String,String> morseCodeMap = new HashMap<>();

        morseCodeMap.put("a", ".-");
        morseCodeMap.put("b", "-...");
        morseCodeMap.put("c", "-.-.");
        morseCodeMap.put("d","-..");
        morseCodeMap.put("e",".");
        morseCodeMap.put("f","..-.");
        morseCodeMap.put("g","--.");
        morseCodeMap.put("h","....");
        morseCodeMap.put("i","..");
        morseCodeMap.put("j",".---");
        morseCodeMap.put("k","-.-");
        morseCodeMap.put("l",".-..");
        morseCodeMap.put("m","--");
        morseCodeMap.put("n","-.");
        morseCodeMap.put("o","---");
        morseCodeMap.put("p",".--.");
        morseCodeMap.put("q","--.-");
        morseCodeMap.put("r",".-.");
        morseCodeMap.put("s","...");
        morseCodeMap.put("t","-");
        morseCodeMap.put("u","..-");
        morseCodeMap.put("v","...-");
        morseCodeMap.put("w",".--");
        morseCodeMap.put("x","-..-");
        morseCodeMap.put("y","-.--");
        morseCodeMap.put("z","--..");

        Map<String,Integer> transformationMap = new HashMap<>();
        int count = 0;
        for(int i = 0; i < words.length; i++) {
            String finalCode = "";
            String[] stringArray = words[i].split("");
            for(int j = 0; j < stringArray.length;j++) {
                finalCode += morseCodeMap.get(stringArray[j]);
            }

            if(transformationMap.get(finalCode) == null) {
                transformationMap.put(finalCode,1);
                count++;
            } else {
                int counter = transformationMap.get(finalCode);
                transformationMap.put(finalCode,counter++);
            }
        }
        return count;
    }
}
