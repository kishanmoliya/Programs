#include<iostream>
using namespace std;

int main(){
    int arr[] = {7, 5 , 9};
    cout<<arr[0]<<endl;

    int percentage[6],total = 0,arrsize = 0,avg=0;
    for(int i = 0; i < 6; i++){
        cout<<"Enter the percentage of "<<(i+1)<<"th student = ";
        cin>>percentage[i];

        total = total+percentage[i];
    }
    arrsize = sizeof(percentage)/sizeof(percentage[0]);
    avg = total/arrsize;
    cout<<"The average result is "<<avg<<"%";
}