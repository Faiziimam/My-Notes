// This implementation is done using arrays,But using array for this is not an optimal choice because if there are huge number of strings then we memory wastage or loss. 
public class Main {
    //Size of the alphabet
    private static final int ALPHABET_SIZE=26;
    private static class node{
        private char value;
        private node[] children=new node[ALPHABET_SIZE];
       private boolean isEndOfWord;
        node(char value)
        {
            this.value=value;
        }
        @Override
        public String toString()
        {
            return "value => "+value;
        }
    }
    //Root node always remain empty in tries.
    private node root=new node(' ');
    public void insert(String word)
    {
        node current=root;
        for(char ch:word.toCharArray())
        {
            var index=ch-'a';
            if(current.children[index]==null)
            {
                current.children[index]=new node(ch);
                current=current.children[index];
            }
        }
        current.isEndOfWord=true;
    }

    public static void main (String[] args)
    {
     Main trie=new Main();
     trie.insert("cat");
     trie.insert("can");
        System.out.println("Done");

    }

}
