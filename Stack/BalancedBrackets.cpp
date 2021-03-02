#include <bits/stdc++.h>
using namespace std;
bool balancedBrackets(string s)
{
    stack<char> stk;

    for (int i = 0; i < s.length(); i++)
    {
        char check;
        if (s[i] == '{' || s[i] == '[' || s[i] == '(')
        {
            stk.push(s[i]);
            continue;
        }
        if (stk.empty())
        {
            return false;
        }

        switch (s[i])
        {
        case '}':
            check = stk.top();
            stk.pop();
            if (check == '[' || check == '(')
                return false;
            break;
        case ']':
            check = stk.top();
            stk.pop();
            if (check == '{' || check == '(')
                return false;
            break;
        case ')':
            check = stk.top();
            stk.pop();
            if (check == '[' || check == '{')
                return false;
            break;
        }
    }
    return (stk.empty());
}
int main()
{
    string s;
    cin >> s;
    if (balancedBrackets(s))
    {
        cout << "Balanced";
    }
    else
    {
        cout << "Not Balanced";
    }
    return 0;
}