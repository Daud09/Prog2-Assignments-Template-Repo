//Ramy Ahmed
//20216115
import java.util.*;
public class Assign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
 long min = A;
    if (B < min) {
        min = B;}
        
    if (C < min) {
        min = C;}
        
 
    long max = A;
    if (B > max) {
        max = B;}
        
    if (C > max) {
        max = C;}
        
 
    long mid = A + B + C - min - max;
System.out.println(min + "\n" + mid + "\n" + max);
System.out.print("\n" +A + "\n" + B + "\n" + C);
    
    }
}
