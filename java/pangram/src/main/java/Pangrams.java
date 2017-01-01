class Pangrams {

  static boolean isPangram(String string) {
    String lowerCaseString = string.toLowerCase();
    for(char character = 'a'; character <= 'z'; character++) {
      if (!lowerCaseString.contains(character + "")) {
        return false;
      }
    }
    return true;
  }
}
