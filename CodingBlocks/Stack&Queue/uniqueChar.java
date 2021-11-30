import java.util.Stack;
class StackQuestions{
    public static int[] buidFreq(String s)
    {
        int[] freq=new int[26];
        for(char ch:s.toCharArray())
        {
            freq[ch-'a']++;
        }
        return freq;
    }
    public String uniqueElement(String s){
        int[] freq=buidFreq(s);
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray())
        {
            freq[ch-'a']--;
            if(stack.contains(ch))
            {
                continue;
            }
            while(!stack.isEmpty() && stack.peek() > ch && freq[stack.peek()-'a']>0)
            {
                 stack.pop();
            }
            stack.push(ch);
        }
        StringBuilder res=new StringBuilder();
        while(!stack.isEmpty())
        {
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }

}
