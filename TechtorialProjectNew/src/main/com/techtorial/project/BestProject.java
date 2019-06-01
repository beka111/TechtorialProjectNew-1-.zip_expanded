package main.com.techtorial.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BestProject {

    /**
     * Count letters in a given string, this time use more advanced data types (like
     * Map/HashMap). Please exclude special characters like ',' '.' '!' '?' etc
     *
     * @param word
     * @return Map
     */
	
	
    public static Map<Character, Integer> countLetters(String word) {
        Map<Character, Integer> lettercounter = new HashMap();
        int count=1;
        String str = "";
        String check="";
        for (int i=0; i<word.length();i++) {

          if ((word.charAt(i) >= 65 && word.charAt(i) <= 90) || (word.charAt(i) >= 97 && word.charAt(i) <= 122)||word.charAt(i)>=48&&word.charAt(i)<=57) {
                if (str.contains(""+word.charAt(i))){
                    continue;
                }
                for (int k = i + 1; k < word.length(); k++) {
                    if (word.charAt(i) == word.charAt(k)) {
                        count++;
                        check+=word.charAt(i);
                    }
                }
                str += word.charAt(i);
                lettercounter.put(word.charAt(i), count);

            }
            count=1;
        }
        return lettercounter;
    }
        
        
        

    

    /**
     * Get only unique letters only from given string
     * Please use Map data type to achieve this goal
     * 
     * @param word
     * @return List<Character>
     */
    public static List<Character> uniqueLetters(String word) {
      
    	Map<Character, Integer> uniqueMap = new HashMap();
        List<Character>unique3=new ArrayList();
        int count=1;
        int num =0;
        String str ="";
        for (int i=0;i<word.length();i++) {

            if ((word.charAt(i) >= 65 && word.charAt(i) <= 90) 
            		|| (word.charAt(i) >= 97 && word.charAt(i) <= 122)
            		||word.charAt(i)>=48&&word.charAt(i)<=57) {

                if (str.contains("" + word.charAt(i))) {
                    continue;
                }
                for (int k = i + 1; k < word.length(); k++) {
                    if (word.charAt(i) == word.charAt(k)) {
                        count++;
                    }
                }
                str += word.charAt(i);
                uniqueMap.put(word.charAt(i), count);
            }
            count=1;
        }

        Set set =  uniqueMap.keySet();
        List list = new ArrayList(set);
        for (int i=0;i<list.size();i++){

            if (uniqueMap.get(list.get(i))==1){
                unique3.add((Character) list.get(i));
            }
        }

        return unique3;
    }
       	

        	
        

    /**
     * Every sentence should be separated and stored as a next index of the list
     * return list of maps:
     * Map should take 2 parameters and it indicates the position of every word in a given sentence.
     * You should have as many maps as many sentences in a given example are.
     * Store all you maps in a single List
     * 
     * @param sentence
     * @return
     */
    public static List<Map<String, Integer>> complicatedDtaTypes(String sentence) {
        List<Map<String, Integer>> listOfMaps = new ArrayList();


        return listOfMaps;
    }

}