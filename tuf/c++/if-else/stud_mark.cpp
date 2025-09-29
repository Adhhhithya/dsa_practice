#include<bits/stdc++.h>
using namespace std ;

/*
A school has a following rules for grading system:
a. Below 25 - F
b. 25 to 44 - E
c. 45 to 49 - D
d. 50 to 59 - C
e. 60 to 79 - B
f. 80 to 100 - A

Ask user to enter marks and print the grade.
*/
int main(){
    int marks;
    cin >> marks;
    if(marks < 25){
        cout << "F" << endl;
    }else if ( marks <=44){
        cout << "E" << endl;
    }else if (marks <49){
        cout << "D" << endl;
    }else if (marks <59){
        cout << "C" << endl;
    }else if (marks <=79){
        cout << "B" << endl;
    }else if (marks <=100){
        cout << "A" << endl;
    }


    return 0;
}