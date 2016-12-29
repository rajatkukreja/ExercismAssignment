import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DNA {
  private final String string;
  public DNA(String string) {
    this.string = string;
  }

  public int count(char nucleotide) {
    validateNucleotide(nucleotide);
    if(string.isEmpty()) {
      return 0;
    }
    int count = 0;
    for(int i=0; i<string.length(); i++){
      if(string.charAt(i) == nucleotide){
        count++;
      }
    }
    return count;
  }

  private void validateNucleotide(char nucleotide) {
    if(nucleotide != 'A' && nucleotide != 'C'
        && nucleotide != 'T' && nucleotide != 'G')
      throw new IllegalArgumentException("Invalid nucleotide");
  }

  public Map<Character,Integer> nucleotideCounts() {
    Map<Character, Integer> map = new HashMap<>();
    map.put('A',count('A'));
    map.put('C',count('C'));
    map.put('T',count('T'));
    map.put('G',count('G'));
    return map;
  }
}
