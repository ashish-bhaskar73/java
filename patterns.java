public class patterns {
    public static void main(String args[]){
       /*  for(int i=1;i<=4;i++){
           for(int star=1;star<=(4-i+1);star++){
            System.out.print("*");
           }
           System.out.println();
        }*/
        // character patterns
        char ch='A';
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
    }
}
