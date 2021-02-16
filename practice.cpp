#include <bits/stdc++.h>
using namespace std;
// typedef vector<int> vi;

//Comarator i.e just pass this function inside sorting function!!
// bool compare(int a, int b)
// {
//     cout << "Compare " << a << " " << b << endl;
//     return  b>a;
// }

//How to pass function inside a function
//return type of the func (&name of func)(para,para,..npara)
int main()
{
    int n;
    cin >> n;
    int key = 2;
    vector<int> a(n);
    for (auto &it : a)
    {
        cin >> it;
    }

    //    <---Find Search -->
    // auto it = find(a.begin(), a.end(), key);
    // if (it != a.end())
    // {
    //     cout << "Element is present at index value :" << (it - a.begin()) << endl;
    // }
    // else
    //     cout << "Element is not present!!!!" << endl;

    //<---Binary Search -->
    // bool present = binary_search(a.begin(), a.end(), key);
    // if (present)
    // {
    //     cout << "Element is present "<<endl;
    // }
    // else
    //     cout << "Not Present!!"<<endl;

    //  //Lowerbound of the element
    // auto lb=lower_bound(a.begin(),a.end(),4);
    // cout<<"Lowerbound of the element is :"<<(lb-a.begin())<<endl;
    //  //Upperbound of the element
    // auto ub=upper_bound(a.begin(),a.end(),4);
    // cout<<"Upperbound of the element is : "<<(ub-a.begin())<<endl;

    // //  Q Find Number of occurence of element 4 in the array?
    // cout<<"Number of Occurence in the array is : "<<(ub-lb)<<endl;

    // <---Sorting -->
    // sort(a.begin(), a.end(), compare);
    // for (int i : a)
    //     cout << i << " ";

    return 0;
}