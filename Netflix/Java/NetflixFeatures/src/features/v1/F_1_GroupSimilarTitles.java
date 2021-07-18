package features.v1;

import java.util.*;

/**
 * Implementing the "Group Similar Titles" feature for our "Netflix" project.
 */
public class F_1_GroupSimilarTitles {

    /**
     * 0. Visualize the problem
     * 1. Verify the constraints
     * 2. Write test cases
     *      "duel", "dule", "speed", "spede", "deul", "cars"
     * 3. Figure out a solution without code
     *      a) split the list of titles into sets of words so that all words in set are anagrams
     *      b) 3 sets: {"duel", "dule", "deul"}, {"speed", "spede"}, and {"cars"}
     *      c) all the members are characterized by the same frequency of each alphabet
     *
     *      d) 26 element vector representation of each word
     *          abbccc -> #1#2#3#0#0#0...#0
     *      e) Storing sets in a key-value storage >> 26 element vector in key, value set of anagram titles
     *
     *      f) for each user search return the individual set
     *
     *
     * 4. Write solution
     * 5. Double check for errors - syntax or logic
     * 6. Test code
     * 7. Analysis
     *      TimeComplexity: O(n * k)
     *      SpaceComplexity: O(n * k)
     *      where   n, the size of the list of strings
     *              k, maximum length that a single string can have
     */

    private static List<List<String>> groupTitles(String[] titles) {
        //Edge Case
        if(titles.length == 0)
            return new ArrayList<>();

        final String DELIMITER = "#";
        final int ALPHABETS = 26;
        int[] count = new int[ALPHABETS];

        final Map<String, List<String>> titleMap = new HashMap<>();

        for (String title: titles){
            Arrays.fill(count, 0);
            for (char c: title.toCharArray()){
                int index = c -'a';
                count[index]++;
            }

            StringBuilder delimitedTitle = new StringBuilder("");
            for (int i=0; i < ALPHABETS; i++){
                delimitedTitle.append(DELIMITER);
                delimitedTitle.append(count[i]);
            }

            String key = delimitedTitle.toString();
            if(!titleMap.containsKey(key)){
                titleMap.put(key, new ArrayList<>());
            }

            titleMap.get(key).add(title);
        }

        return new ArrayList<>(titleMap.values());
    }



    public static void main(String[] args) {
        // Driver code
        String titles[] = {"duel","dule","speed","spede","deul","cars"};

        List<List<String>> gt = groupTitles(titles);
        String query = "spede";

        // Searching for all titles
        for (List<String> g : gt){
            if (g.contains(query))
                System.out.println(g);
        }
    }

}
