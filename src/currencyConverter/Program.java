package currencyConverter;

import currencyConverter.Converter;
import currencyConverter.ToBrl;
import javax.swing.*;
import java.util.Objects;

public class Program {
   Converter currency = new Converter();
   ToBrl brl = new ToBrl();

   public void apply(double value) {
      String op = (JOptionPane.showInputDialog(null, "Choose a currency to convert to ", "Currency",
            JOptionPane.PLAIN_MESSAGE, null, new Object[] {
                  "brl to dollar",
                  "brl to eur",
                  "brl to gbp",
                  "brl to ars",
                  "brl to clp",
                  "dollar to brl",
                  "eur to brl",
                  "gbp to brl",
                  "ars to brl",
                  "clp to brl" },
            "Choose")).toString();

      switch (op) {
         case "brl to dollar":
            currency.brlToUsd(value);
            break;

         case "brl to usd":
            currency.brlToEur(value);
            break;
         case "brl to gbp":
            currency.brlToGpb(value);
            break;
         case "brl to ars":
            currency.brlToArs(value);
            break;
         case "brl to clp":
            currency.brlToClp(value);
            break;
         case "dollar to brl":
            brl.usdToBrl(value);
            break;
         case "eur to brl":
            brl.eurToBrl(value);
            break;
         case "gbp to brl":
            brl.gbpToBrl(value);
            break;
         case "ars to brl":
            brl.arsToBrl(value);
            break;
         case "clp to brl":
            brl.clpToBrl(value);
            break;
      }
   }
}
