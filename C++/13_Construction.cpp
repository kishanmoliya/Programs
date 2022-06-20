#include <iostream>
using namespace std;

class Bick{
    public:
    string name;
    int horsPow;

    Bick(string n, int h, int bick_Key){
        this->name = n;             //this->name it's comes Bick class.
        this->horsPow = h;
        this->bick_Key = bick_Key;
    }

    void prindDetails(){
        cout<<"My bick name is "<<this->name<<" and my bick is "<<this->horsPow<<" hors power";
    }

    void getbick_Key(){
        cout<<"The bick key is = "<<this->bick_Key;
    }

    private:
        int bick_Key;
};

int main(){
    Bick b("kawasakiNinja",1600,75846);
    
    b.prindDetails();
    b.getbick_Key();

   // cout<<b.bick_Key();           It is a private method.
    
    return 0;
}