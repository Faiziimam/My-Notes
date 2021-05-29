  
 public boolean hasChildren() {
      return !children.isEmpty();
    }

    public void removeChild(char ch) {
      children.remove(ch);
    }
  }
  public void remove(String word) {
    if (word == null)
      return;

    remove(root, word, 0);
  }

  private void remove(Node root, String word, int index) {
    if (index == word.length()) {
      root.isEndOfWord = false;
      return;
    }

    var ch = word.charAt(index);
    var child = root.getChild(ch);
    if (child == null)
      return;

    remove(child, word, index + 1);

    if (!child.hasChildren() && !child.isEndOfWord)
      root.removeChild(ch);
  }
