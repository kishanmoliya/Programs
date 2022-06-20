#include<iostream>
using namespace std;

int main(){
    //While loop!
    int i = 0;
    while(i<=10){
        cout<<i;
        i++;
    }

    //For loop!
    cout<<endl;
    for (int j=0;j<=10;j++){
        cout<<j;
    }

    //Do while loop!
    int k=0;
    do{
        cout<<k<<endl;
        k++;
    }while(k<=10);

    return 0;
}