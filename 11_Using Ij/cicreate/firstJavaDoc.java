/**
 * This javadoc is creating by me.
 * @author Kishan moliya
 * @version 0.1
 * @since 2020
 * @see <a href="https://github.com/kishanmoliya" target="_blank"><b>My Github account</b></a>
 */

public class firstJavaDoc{
    /**
     * This method is used to add two number.
     * @throws ArithmeticException if a=0 by Zero.
     * @param a First parameter - Integer
     * @param b Second parameter - Integer
     * @return Integer
     * @deprecated This method is deprecated Use yours method.
     */
    public int addition(int a, int b) {
        return a/b;
    }
    private static final String S = "* ";
    public static void main(String[] args){
        firstJavaDoc a1 = new firstJavaDoc();
        System.out.println("Addition is = "+a1.addition(5,7));

        int n = 5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(S);
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k>0;k--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}