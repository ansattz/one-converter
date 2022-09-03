package currencyConverter;

import javax.swing.*;

public class ToBrl {
   public void usdToBrl(double value) {
      double doll = Math.round(value * 5.17);
      JOptionPane.showMessageDialog(null, "Reais: " + doll);
   }

   public void eurToBrl(double value) {
      double eur = Math.round(value * 5.15);
      JOptionPane.showMessageDialog(null, "Reais: " + eur);
   }

   public void gpbToBrl(double value) {
      double gpb = Math.round(value * 5.95);
      JOptionPane.showMessageDialog(null, "Reais: " + gpb);
   }

   public void arsToBrl(double value) {
      double ars = Math.round(value * 26.92);
      JOptionPane.showMessageDialog(null, "Reais: " + ars);
   }

   public void clpToBrl(double value) {
      double clp = Math.round(value * 169.88);
      JOptionPane.showMessageDialog(null, "Reais: " + clp);
   }

}
