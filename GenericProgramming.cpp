#include <bits/stdc++.h>
using namespace std;

template <class T>
add(T a, T b)
{
    if (a > b)
        return 1;

    return -1;
}

int main()
{
    float a;
    float b;
    cin >> a >> b;
    cout << add(a, b) << endl;
}