#include <bits/stdc++.h>
using namespace std;

bool checkCowPlace(int a[], int n, int cowCount, int min_sep)
{
    //Start placing cow from pos=1 to ..n
    int place_cow = a[0];
    int count = 1;
    for (int i = 1; i < n; i++)
    {
        if (a[i] - place_cow >= min_sep)
        {
            place_cow = a[i];
            count++;
            if (count == cowCount)
            {
                return true;
            }
        }
    }
    return false;
}

int main()
{
    // int n, cowCount;
    // cin >> n >> cowCount;
    // int a[n];
    // for (int i = 0; i < n; i++)
    // {
    //     cin >> a[i];
    // }

    int a[] = {1, 2, 4, 8, 9};
    int n = 5;
    int cowCount = 3;
    int s = 0;
    int e = a[n - 1] - a[0];
    int ans = 0;
    while (s <= e)
    {
        int mid = (s + e) / 2;

        bool cowCheck = checkCowPlace(a, n, cowCount, mid);
        if (cowCheck)
        {
            ans = mid;
            s = mid + 1;
        }
        else
        {
            e = mid - 1;
        }
    }
    cout << ans << endl;
    return 0;
}