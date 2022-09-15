import java.util.Scanner; 
public class sdmcet3 {
public static void main(String args[]) {
Scanner s = new Scanner(System.in);
System.out.println("enter the string");
String string1 = s.nextLine();
String string2 = "SDMCET";
try {
boolean b = string1.toLowerCase().contains(string2.toLowerCase());
if (!b) {
throw new SubStringNotFoundException();
} else
System.out.println("substring found");
} catch (SubStringNotFoundException e) { 
System.out.println(e.toString());
}
}
}
class SubStringNotFoundException extends Exception {
SubStringNotFoundException() {
}
public String toString() {
return super.toString() + " : substring not found";
}
}