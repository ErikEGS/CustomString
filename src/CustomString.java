public final class CustomString {

  private final String str;

  public CustomString(String str) {
    this.str = str;
  }


  String valueOf(long value) {
    return Long.toString(value);
  }

  char charAt(int index) {
    char[] value = str.toCharArray();
    return (char) (value[index] & 0xff);
  }

  int indexOf(char k) {
    for (int i = 0; i < length(); i++) {
      if (k == charAt(i)) {
        return i;
      }
    }
    return -1;
  }

  boolean contains(String word) {

    boolean contains;

    for (int i = 0; i < length(); i++) {
      contains = true;
      if (charAt(i) == word.charAt(0)) {
        for (int j = 1; j < word.length(); j++) {
          if (charAt(i + 1) != word.charAt(j)) {
            contains = false;
          } else {
            i++;
          }
        }
        if (contains) {
          return true;
        }
      } else {
        i++;
      }
    }
    return false;
  }

  String substring(int begin) {
    StringBuilder subString = new StringBuilder();
    for (int i = begin; i < length(); i++) {
      subString.append(charAt(i));
    }
    return subString.toString();
  }

  String substring(int begin, int close) {
    StringBuilder subString = new StringBuilder();
    for (int i = begin; i < close; i++) {
      subString.append(charAt(i));
    }
    return subString.toString();
  }

  int length() {
    for (int len = 0; ; len++) {
      try {
        charAt(len);
      } catch (ArrayIndexOutOfBoundsException ex) {
        return len;
      }
    }
  }

  boolean isEmpty() {
    return length() == 0;
  }


  String trim() {

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

}
