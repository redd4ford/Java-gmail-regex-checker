package ua.lviv.iot;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GmailRegexChecker {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    GmailRegexChecker gmailAddressChecker = new GmailRegexChecker();

    while (true) {
      try {
        System.out.print("Enter gmail: ");
        String address = in.nextLine();
        if (gmailAddressChecker.isValid(address)) {
          System.out.println("valid.");
        } else {
          System.out.println("not valid.");
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  public boolean isValid(String address) {
    String regex = "^[a-z0-9](\\.?[a-z0-9]){5,29}@gmail\\.com$";
    Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(address);

    return matcher.matches();
  }

}