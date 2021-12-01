public final class CustomString {

  private final char[] charArray;

  public CustomString() {
    this.charArray = new char[0];
  }

  public CustomString(char charArray[]) {
    if (charArray == null) {
      this.charArray = null;
    } else {
      this.charArray = new char[charArray.length];
      System.arraycopy(charArray, 0, this.charArray, 0, charArray.length);
    }
  }

  public CustomString(CustomString customString) {
    this.charArray = customString.charArray.clone();
  }

  char charAt(int index) {
    return charArray[index];
  }

  int length() {
    return charArray.length;
  }

  int indexOf(char c) {
    int indexOf = -1;
    for (int i = 0; i < charArray.length; i++) {
      if (charAt(i) == c) {
        return i;
      }
    }
    return indexOf;
  }

  char[] valueOf(int i) {
    char[] chars = ("" + i).toCharArray();
    return chars;
  }

  boolean isEmpty() {
    return length() == 0;
  }


  char[] substring(int begin) {
    char[] substring = new char[length() - begin];
    int j = 0;
    for (int i = begin; i < length(); i++) {
      substring[j] = charAt(i);
      j++;
    }
    return substring;
  }


  char[] substring(int begin, int close) {
    char[] substring = new char[close - begin];
    int j = 0;
    for (int i = begin; i < close; i++) {
      substring[j] = charAt(i);
      j++;
    }
    return substring;
  }


  char[] trim() {

    int begin = 0;
    int close = length();

    for (int i = 0; i < length(); i++) {
      if (charAt(i) == ' ' && charAt(i + 1) == ' ') {
        begin++;
      } else {
        break;
      }
    }

    for (int i = length() - 1; i >= 0; i--) {
      if (charAt(i) == ' ' && charAt(i - 1) == ' ') {
        close--;
      } else {
        break;
      }
    }
    return substring(begin + 1, close - 1);
  }


  boolean contains(char[] word) {

    boolean contains;

    for (int i = 0; i < length(); i++) {
      contains = true;
      if (charAt(i) == word[0]) {
        for (int j = 1; j < word.length; j++) {
          if (charAt(i + 1) != word[j]) {
            contains = false;
          } else {
            i++;
          }
        }
        if (contains) {
          return true;
        }
      }
    }
    return false;
  }


}
