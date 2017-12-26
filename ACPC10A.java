import java.util.Scanner;
 class whatsNext {
 public static void main(String[] args) { 
 Scanner scan = new Scanner (System.in);  
 long a1 = scan.nextLong();  
 long a2 = scan.nextLong();  
 long a3 = scan.nextLong(); 
 while(a1!=0 || a2!=0 || a3!=0)  { 
 if(a2-a1 == a3-a2)   {
 long ans = a3+(a3-a2);    
 System.out.println("AP "+ans); 
 }   
 else if(a2/a1 == a3/a2)  
 {    long ans = a3*(a3/a2);  
 System.out.println("GP "+ans); 
 }    
 a1 = scan.nextLong();  
 a2 = scan.nextLong();  
 a3 = scan.nextLong(); 
 } }}
