package tempConverter;

import javax.swing.*;

public class TempProgram {
   TemperatureConverter temp = new TemperatureConverter();
   // reference temp to the main object converter

   public void apply(double value) {
      String op = (JOptionPane.showInputDialog(null, "Choose an option", "Temperature",
            JOptionPane.PLAIN_MESSAGE, null, new Object[] {
                  "celsius to fahrenheit",
                  "celsius to kelvin",
                  "fahrenheit to celsius",
                  "kelvin to celsius",
                  "kelvin to fahrenheit" },
            "Choose")).toString();

      switch (op) {
         case "celsius to fahrenheit":
            temp.convCelsiusToFahr(value);
            break;
         case "celsius to kelvin":
            temp.convCelsiusToKelvin(value);
            break;
         case "fahrenheit to celsius":
            temp.convFahrToCelsius(value);
            break;
         case "kelvin to celsius":
            temp.convKelvinToCelsius(value);
            break;
         case "kelvin to fahrenheit":
            temp.convKelvinToFahr(value);
            break;

      }
   }
}
