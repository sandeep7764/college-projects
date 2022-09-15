public class excep1 {
public static void main(String args[]) {
int a = 30; int b = 0; String s = null;
int d[] = new int[5];
try {
int c = a / b;
} catch (ArithmeticException e) { 
System.out.println("cant devide a number by zero");
}
try {
System.out.println(s.length());
} catch (NullPointerException f) { 
System.out.println("String is Null");
}
try {
d[10] = 50;
} catch (ArrayIndexOutOfBoundsException g) 
{ System.out.println("Array index exceeded");
}
}
}