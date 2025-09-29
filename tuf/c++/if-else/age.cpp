#include<bits/stdc++.h>
using namespace std;
// Write a program that takes am input of age and prints whether if you're adult or not.
int main(){
    int age;
    cin >> age;
    if(age >=18){
        cout << "You are an adult." <<endl;
    }else{
        cout<< "You are not an adult." <<endl;
    }
    return 0;
}