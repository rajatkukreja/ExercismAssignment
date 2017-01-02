import java.util.HashMap;
import java.util.Map;

public class WordCount {
  public Map<String,Integer> phrase(String sentence) {
    Map<String,Integer> phrase = new HashMap<>();
    String editedSentence = sentence.replaceAll("[^a-zA-Z0-9]"," ");
    editedSentence = editedSentence.toLowerCase();
    String[] words = editedSentence.split(" +");
    for(String word : words) {
      putWordCountInMap(phrase, word);
    }
    return phrase;
  }

  private void putWordCountInMap(Map<String, Integer> phrase, String word) {
    if(phrase.containsKey(word)) {
      int count = phrase.get(word);
      phrase.put(word,count+1);
      return;
    }
    phrase.put(word,1);
  }
}
