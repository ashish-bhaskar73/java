import java.util.*;
public class bill {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
          float pencil=sc.nextFloat();
          float pen=sc.nextFloat();
          float eraser=sc.nextFloat();
          float total_bill=(pencil+pen+eraser)+((pencil+pen+eraser)*18)/100;
          System.out.println(total_bill);
        }
        // question 5
        int $=24;
        System.out.println($);
    }
}
