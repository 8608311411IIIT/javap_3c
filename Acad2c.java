import java.util.*;
public class Acad2c
{
public static void main(String []args){
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the three numbers");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b){
   if(a>c)
       System.out.println(a+" is the greatest no");
   else
       System.out.println(c+" is the greatest no");
}
 
else{
   if(b>c)
       System.out.println(b+" is the greatest no");
   else
       System.out.println(c+" is the greatest no");
}

} 
}
