import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Word Combinations Test
Strategy :
1. Nested iteration over wordlist and build a list of possible combinations
2. Check if the the combinations list contains the input string
*/
public class Main {

    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("back", "end", "front", "tree");
        String inputString = "backend";
        System.out.println(can_create(wordList, inputString));
    }

    public static boolean can_create(List<String> list_of_strings, String input_string){
        List<String> possibleWords = new ArrayList<>();
        for (String word : list_of_strings){
            for(String combination : list_of_strings){
                if(!word.equals(combination)){
                    possibleWords.add(word + combination);
                }
            }
        }
        System.out.println("Possible words : " + possibleWords);
        return possibleWords.contains(input_string);
    }
}
