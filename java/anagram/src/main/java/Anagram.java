import java.util.ArrayList;
import java.util.List;

class Anagram {
  private final String diaper;

  Anagram(String diaper) {
    this.diaper = diaper;
  }

  List<String> match(List<String> strings) {
    List<String> anagrams = new ArrayList<>();
    for(String string : strings) {
      addToListIfAnagram(string,anagrams);
    }
    return anagrams;
  }

  private void addToListIfAnagram(String string, List<String> anagrams) {
    for(int i=0; i < string.length(); i++) {
      if(diaper.contains(string.substring(i,i+1))) {
        anagrams.add(string);
      }
    }
  }
}
