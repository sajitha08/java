import java.util.Scanner;
class payout_of_bounds extends Exception {
public payout_of_bounds(int pay) {
super();
}
}
public class PayoutOutOfBounds {
static void checkpay(int pay, int paylimit) throws payout_of_bounds {
if (pay > paylimit) {

throw new payout_of_bounds(pay);
} else {
System.out.println("Payout approved");
}
}
public static void main(String args[]) {
try {
Scanner in = new Scanner(System.in);
System.out.print("Enter Pay Limit: ");
int paylimit = in.nextInt();
System.out.print("Enter Pay: ");
int pay = in.nextInt();
checkpay(pay, paylimit);
}
catch (payout_of_bounds pob) {
System.out.println("Caught the Exception");
System.out.println("Exception occured: " + pob);
}
}
}