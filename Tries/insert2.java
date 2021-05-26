//This implementation is done using HashMap 
// This is much optimize solution in comparisiom to arrays.

package com.company;

import java.util.HashMap;

public class Main {
    private static class node{
        private char value;
        private HashMap<Character,node> children=new HashMap<>();
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
        public boolean hasChild(char ch) { return children.containsKey(ch);}
        public void addChild(char ch){ children.put(ch,new node(ch)); }
        public node getChild(char ch){ return children.get(ch); }
    }
    //Root node always remain empty in tries.
    private node root=new node(' ');
    public void insert(String word)
    {
        node current=root;
        for(char ch:word.toCharArray())
        {
            if(!current.hasChild(ch))
            {
                current.addChild(ch);
                current=current.getChild(ch);
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
