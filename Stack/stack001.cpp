#include <bits/stdc++.h>
using namespace std;

// To Generlise the templeted Class
// template<typename T>;
// replace data type with this T, Now you will be able to use datas of different data types;
// Specify the type in main function
// i.e node<int> obj;
class node
{

private:
    vector<int> v;

public:
    void push(int data)
    {
        v.push_back(data);
    }
    bool isEmpty()
    {
        return v.size() == 0;
    }
    void pop()
    {
        if (!isEmpty())
        {
            v.pop_back();
        }
    }

    int peek()
    {

        return v[v.size() - 1];
    }
};

int main()
{
    node obj;
    for (int i = 0; i < 5; i++)
    {
        obj.push(i);
    }
    while (!obj.isEmpty())
    {
        cout << obj.peek() << endl;
        obj.pop();
    }
    return 0;
}