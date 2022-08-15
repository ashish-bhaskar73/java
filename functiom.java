import java.util.*;
public class functiom {
    public static void hello(){
        System.out.println("hello_world");
    }
    public static int calculatesum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static int product(int a,int b){
        int pro=a*b;
        return pro;
    }
    public static void main(String args[]){
        //function is reusable code
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=calculatesum(a, b);
        System.out.println(sum);
        int pro=product(a, b);
        System.out.println(pro);

        hello();
    }
}
