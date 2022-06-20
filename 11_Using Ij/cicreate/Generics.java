//import java.util.ArrayList;
//
//public class Generics {
//    public static void main(String[] args) {
//
//        //Without java Generics.
//        ArrayList ar = new ArrayList();
//        ar.add("kishan");
//        ar.add(7);
//        ar.add(7.7);
//        String x = (String) ar.get(0);
//        System.out.println(x);
//
//        //With java Generics.
//        ArrayList<Integer> al = new ArrayList<>();
//        al.add(7);
//        al.add(17);
//        al.add(27);
//        al.add(37);
//        int y = al.get(2);
//        System.out.println(y);
//    }
//}

import java.util.ArrayList;

class myGeneric<T1, T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public myGeneric(int val, T1 t1, T2 t2){
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }
    public T1 getT1(){
        return t1;
    }
    public T2 getT2(){
        return t2;
    }
    public int getVal(){
        return val;
    }
//    public void setT1(T1 t1){
//        this.t1 = t1;
//    }
//    public void setT2(T2 t2){
//        this.t2 = t2;
//    }
//    public void setVal(int val){
//        this.val = val;
//    }
}
public class Generics{
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(45);
        ar.add(66);

        myGeneric<String, Integer> mg = new myGeneric<>(17,"kishan",56);
        String str = mg.getT1();
        Integer int1 = mg.getT2();
        Integer val = mg.getVal();
        System.out.println(val + str + int1);
    }
}

