#include <iostream>
using namespace std;

class Bick{
    public:
    string name;
    int horsPow;

    void prindDetails(){
        cout<<"My bick name is "<<this->name<<" and my bick is "<<this->horsPow<<" hors power";
    }
};

int main(){
    Bick b;
    b.name = "kawasakiNinja";
    b.horsPow = 1600;
    
    b.prindDetails();
    //cout<<"My bick name is "<<b.name<<" and my bick is "<<b.horsPow<<" hors power";
}