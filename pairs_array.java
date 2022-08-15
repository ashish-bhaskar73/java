import java.util.*;
public class pairs_array{
public static void pairs(int series[]){
    for(int i=0;i<series.length;i++){
        for(int j=i+1;j<series.length;j++){
            System.out.print("["+series[i]+","+series[j]+"]");
        }
    }
    //return pairs;
}

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int series[]=new int[5];
        for(int i=0;i<series.length;i++){
            series[i]=sc.nextInt();
        }
       pairs(series);
    }

  
}