package main;

import currencyConverter.Program;
import tempConverter.TempProgram;
import javax.swing.*;

public class Main {
   public static void main(String[] args) {
      Program currency = new Program();
      TempProgram temp = new TempProgram();
      while (true) {
         String op = JOptionPane.showInputDialog(null, "Choose an option ", "ONE CONVERTER",
               JOptionPane.PLAIN_MESSAGE, null, new Object[] {
                     "Currency converter",
                     "Temperature converter" },
               "Choose").toString();

         switch (op) {
            case "Currency converter":
               String input = JOptionPane.showInputDialog("Digit a value: ");
               if (pick(input)) {
                  double value = Double.parseDouble(input);
                  currency.apply(value);
                  int ans = JOptionPane.showConfirmDialog(null, "Continue?");
                  if (JOptionPane.OK_OPTION == ans) {
                     System.out.println("Choose one");
                  } else {
                     JOptionPane.showMessageDialog(null, "Closed");
                  }
               } else {
                  JOptionPane.showMessageDialog(null, "Error: Invalid value!");
               }
               break;
            case "Temperature converter":
               input = JOptionPane.showInputDialog("Enter the temperature value");
               if (pick(input)) {
                  double value = Double.parseDouble(input);
                  temp.apply(value);
                  int ans = 0;
                  ans = JOptionPane.showConfirmDialog(null, "Continue?");
                  if (ans == 0 && pick(input)) {
                  } else {
                     JOptionPane.showMessageDialog(null, "Closed");
                  }
               } else {
                  JOptionPane.showMessageDialog(null, "Error: Invalid value!");
               }
               break;

         }
      }
   }

   public static boolean pick(String input) {
      try {
         double x = Double.parseDouble(input);
         if (x >= 0 || x < 0)
            ;
         return true;
      } catch (NumberFormatException e) {
         return false;
      }
   }
}
