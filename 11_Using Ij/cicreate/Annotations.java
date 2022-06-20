@FunctionalInterface
interface myfunctionalinterface{
    void math1();
  //void math2();
}
class keypadphone{
    public void sendmessage(){
        System.out.println("The message is sent!");
    }
}
class Androidphone extends keypadphone{
    @Override
    public void sendmessage() {
        System.out.println("The message sent via Text!");
    }
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}

public class Annotations {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        Androidphone samsung = new Androidphone();
        samsung.sendmessage();
        System.out.println("Sum of two numbers is = "+samsung.sum(8,9));
    }
}
