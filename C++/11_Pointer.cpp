#include <iostream>
using namespace std;

int main(){
    int a = 70;
    int *ptr;
    ptr = &a;
    cout<<"The value of a is = "<<a<<endl;
    cout<<"The value of a is = "<<*ptr<<endl;
    cout<<"The address of a is = "<<&ptr<<endl;
    cout<<"The address of a is = "<<ptr;
}