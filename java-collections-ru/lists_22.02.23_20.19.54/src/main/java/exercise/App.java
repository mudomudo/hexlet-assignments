package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {

    public static boolean scrabble(String heap, String word) {
        if (heap.length() <= 1 || word.length() <= 1) {
            return false;
        } else {
            List<String> heapChars = new ArrayList<String>(Arrays.asList(heap.split("")));
            List<String> wordChars = new ArrayList<String>(Arrays.asList(word.split("")));
            return wordChars.retainAll(heapChars);
        }

    }
}
//END
