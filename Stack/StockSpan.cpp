#include <bits/stdc++.h>
using namespace std;
void stockspan(int price[], int n, int span[])
{
    stack<int> s;
    s.push(0);
    span[0] = 1;
    for (int i = 1; i < n; i++)
    {
        int currprice = price[i];

        while (!s.empty() and price[s.top()] <= currprice)
        {
            s.pop();
        }
        if (!s.empty())
        {
            int prevPrice = s.top();
            span[i] = i - prevPrice;
        }
        else
        {
            span[i] = i + 1;
        }
        s.push(i);
    }
}
int main()
{

    int price[] = {100, 80, 60, 70, 60, 75, 85};
    int n = sizeof(price) / sizeof(int);
    int span[10000] = {0};
    stockspan(price, n, span);
    for (int i = 0; i < n; i++)
    {
        cout << span[i] << " ";
    }

    return 0;
}