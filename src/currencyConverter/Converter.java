package currencyConverter;

import javax.swing.*;

public class Converter {
   public void brlToUsd(double value) {
      double doll = Math.round(value / 5.17);
      JOptionPane.showMessageDialog(null, "Dollar: " + doll);
   }

   public void brlToEur(double value) {
      double eur = Math.round(value / 5.15);
      JOptionPane.showMessageDialog(null, "EUR: " + eur);
   }

   public void brlToGpb(double value) {
      double gpb = Math.round(value / 5.95);
      JOptionPane.showMessageDialog(null, "GPB: " + gpb);
   }

   public void brlToArs(double value) {
      double ars = Math.round(value / 26.92);
      JOptionPane.showMessageDialog(null, "ARS: " + ars);
   }

   public void brlToClp(double value) {
      double clp = Math.round(value / 169.88);
      JOptionPane.showMessageDialog(null, "CLP: " + clp);
   }

}
