import java.util.*;
public class array{
    public static boolean linearsearch(int marks[],int key){
        for(int i=0;i<marks.length;i++){
            if(marks[i]==key){
                return true;
            }
        }
        return false;
    }
    public static int largest(int marks[]){
        int temp=Integer.MIN_VALUE;
        for(int i=0;i<marks.length;i++){
            if(temp<marks[i]){
                temp=marks[i];
            }
        }
        return temp;
    } 
    public static int binarysearch(int marks[],int key){
        int start=0;
        int end=marks.length-1;
       // int mid=(start+end)/2;
    while(start<=end){
        int mid=(start+end)/2;
        if(marks[mid]==key){
            return mid;
        }
        if(marks[mid]<key){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
    }
        return -1;
    }
    public static void reverse(int marks[]){
        for(int i=(marks.length)-1;i>=0;i--){
            System.out.print(marks[i]+" ");
        }
    
    }
    public static void main(String args[]){
        int marks[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("length"+marks.length);
        for(int i=0;i<5;i++){
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }
       System.out.println("enter value of key");
        int key=sc.nextInt();
        //System.out.println(linearsearch(marks, key));
        System.out.println("largest element is");
        System.out.print(largest(marks));
        System.out.println(binarysearch(marks, key));
        reverse(marks);
    }
}