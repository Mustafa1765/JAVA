class stringbufferdemo
{
 public static void main(String[] args) 
 {
 StringBuffer sb1 = new StringBuffer("Hello World");
 sb1.delete(0,6);
 System.out.println(sb1);

 System.out.println(sb2);
 StringBuffer sb3 = new StringBuffer("Hello World");
 sb3.deleteCharAt(0);
 System.out.println(sb3);
 } 
}
