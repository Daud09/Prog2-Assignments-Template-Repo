//Ramy Ahmed
//20216115
import java.util.*;
public class Assignment{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x;
        x=sc.nextInt();    
        int [] arr = new int[x];   
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();    
        }
        for(int i=0;i<x;i++){   
            if(arr[i] > 0) arr[i] = 1;
            else if(arr[i] < 0) arr[i] = 2;
            else arr[i] = 0;  
        }
        for(int i=0 ; i < x ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
