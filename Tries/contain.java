// This is a boolean function which will return true if we have the word in our trie else it will return false.

 public boolean contain(String word)
    {
        if(word==null)
            return false;
        node temp=root;
        for(char ch: word.toCharArray())
        {
            if(!temp.hasChild(ch))
            {
                return false;
            }
            temp=temp.getChild(ch);
        }
        return temp.isEndOfWord;
    }
