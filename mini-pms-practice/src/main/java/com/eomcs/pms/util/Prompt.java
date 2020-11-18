package com.eomcs.pms.util;

import java.sql.Date;
import java.util.Scanner;

public class Prompt {
  static Scanner in = new Scanner(System.in);

  public static String promptString(String title) {
    System.out.print(title);
    return in.nextLine();
  }

  public static int promptInt(String title) {
    return Integer.parseInt(promptString(title));
  }

  public static Date promptDate(String title) {
    return Date.valueOf(promptString(title));
  }

  public static void close() {
    in.close();
  }
}
