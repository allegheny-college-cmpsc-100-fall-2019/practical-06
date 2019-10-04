package gatorcash;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Handles account and a single debit.
 *
 * @author Douglas Luman
 */
public class GatorAccount {
  
  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // Get balanace from command line arguments
    double startingBalance = Double.parseDouble(args[0]);
    // TODO setup bank account object
    // Declare file and scanner objects.
    File billFile = null;
    Scanner scanner = null;
    try {
      billFile = new File("inputs/bills.txt");
      scanner = new Scanner(billFile);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    // Gather data
    double amount = scanner.nextDouble();
    String date = scanner.next();
    String payee = scanner.nextLine();
    // TODO Create bill object
    // TODO Debit the bill amount from the account
    /*
     * TODO Display the bill amount, bill "payee," due date
     *      and final balance.
     */
  }
}