import java.util.*;

class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String curr = words[i];
            
            for (int j = 0; j < words.length; j++) {
                if (i == j) continue;

                if (words[j].indexOf(curr) != -1) {
                    result.add(curr);
                    break;
                }
            }
        }

        return result;
    }
}
