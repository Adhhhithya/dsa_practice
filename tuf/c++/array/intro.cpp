#include<bits/stdc++.h>
using namespace std;

int main(){
    // 1 D array
    int arr [5];
    cin >> arr[0] >> arr[1] >> arr[2] >> arr[3] >> arr[4];
    arr[3]+=5;
    cout << arr[3];

    // 2 D array
    int brr[2][3];
    brr[1][2] = 78;
    cout << brr[1][2];
    return 0;
}