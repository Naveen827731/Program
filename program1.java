public class Calculator {
 private double a;
private double b;
public Calculator(double a, double b){
this.a=a;
this.b=b;
}
public double add(){
return a+b;
}
public double substract(){
return a-b;
}
public double multiply(){
return a*b;
}
public double divide(){
if(b!=0){
return a/b;
}
else{
throw new ArithmeticException("error:cannot divide by zero");
}
}
public static void main(String[] args)
{
  double a=5.0;
  double b=2.0;
String operation="add";
Calculator calc=new Calculator(a,b);
 double result;
Switch(operation){
case "add":
   result =calc.add();
     break;
case "substract":
    result=calc.substract();
     break;
case "multiply":
   result=calc.multiply();
    break;
case "divide":
result=calc.divide();
    break;
default:
throw new ILLegalArugumentException("Error invalid operation");
}
System.out.println("result"+result);
}
}
