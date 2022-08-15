import java.util.*;
public class loops{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the no n");
            int n=sc.nextInt();
      /* 
            //while looop
            while(n>0){
                System.out.println("hello world");
                n--;
            }
            //for loops
            for(int i=1;i<5;i++){
                System.out.println("hey this is for loop");
            }
            //do while loops
            int i=1;
            do{
                System.out.println("hey this is do while loops");
                i++;
            }while(i<5);
*/
int sum=0;
int i=1;

while(i<=n){
   sum=sum+i;
}
System.out.println(sum);
        }
}
}