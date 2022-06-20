@FunctionalInterface
interface human{
    void name(String a);
}
public class LembdaExpressionss{
    public static void main(String[] args) {
        human hu = (a) -> System.out.println("My name is "+a);
        hu.name("kishan");
    }
}




//@FunctionalInterface        //If we not write @FunctionalInterface then also work.
//interface human{
//    void walk();              //abstract class also work.
//   // void run();
//}
//public class LembdaExpressionss{
//    public static void main(String[] args) {
//        human ram = new human() {
//            @Override
//            public void walk() {
//                System.out.println("I am going to morning to morning walk.");
//            }
////            public void run(){
////                System.out.println("I am running");
////            }
//        };
//        ram.walk();
//       // ram.run();
//    }
//}
