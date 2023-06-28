import java.util.Scanner;
public class NumberSeries{
   public static void main(String[] args){
      Scanner Scan=new Scanner(System.in);
      System.out.Println("Enter the number of a");
       int a =Scan.nextInt();
       Scanner.close();
   
   if(a<1){
System.out.println("enter "a" must be possitive integer");
 return;
}
for(int i=1; i<=a; i++){
     int num=2*i-1;
     System.out.println(num+" " );
}
}
}
