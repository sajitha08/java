import java.util.Scanner;
class ExtractString{
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
System.out.print("Enter String: ");
String str = in.nextLine();
int len = str.length();
System.out.print("Enter Start Index: ");
int si = in.nextInt();
if (si < 0 || si >= len) {
System.out.println("Invalid Index");
System.exit(1);
}
System.out.print("Enter No.of Characters to Extract: ");
int n = in.nextInt();
int substrlen = si + n;
if (n <= 0 || substrlen > len) {
System.out.println("Invalid No.of Characters");
System.exit(1);

}                                                     B   
String substr = str.substring(si, substrlen);
System.out.println("Substring: " + substr);
}
}