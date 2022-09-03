package tempConverter;

import javax.swing.*;

// its the same logic applied to currency conversion
public class TemperatureConverter {
   public double convCelsiusToFahr(double value) {
      double celsiusToFahr = value * 1.8 + 32;
      JOptionPane.showMessageDialog(null, value + " celsius = " + celsiusToFahr +
            " fahrenheit");
      return celsiusToFahr;
   }

   public double convCelsiusToKelvin(double value) {
      double celsiusToKelvin = value + 273.15;
      JOptionPane.showMessageDialog(null, value + " celsius = " + celsiusToKelvin +
            " Kelvin");
      return celsiusToKelvin;
   }

   public double convFahrToCelsius(double value) {
      double fahrToCelsius = (value - 32) / 1.8;
      JOptionPane.showMessageDialog(null, value + " fahrenheit = " + fahrToCelsius +
            " celsius");
      return fahrToCelsius;
   }

   public double convKelvinToCelsius(double value) {
      double kelvinToCelsius = value - 273.15;
      JOptionPane.showMessageDialog(null, value + " kelvin = " + kelvinToCelsius +
            " celsius");
      return kelvinToCelsius;
   }

   public double convKelvinToFahr(double value) {
      double kelvinToFahr = (value - 273.15) * 9 / 5 + 32;
      JOptionPane.showMessageDialog(null, value + " kevil " + kelvinToFahr +
            " fahrenheit");
      return kelvinToFahr;
   }
}
