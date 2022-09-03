# ONE CONVERTER - Challenge ONE [JAVA]

## Currency converter
The currency converter has conversions from the Brazilian Real to the following foreign currencies: dollar, pound sterling, Argentine peso and Chilean peso. Also, the converter is applied from foreign currencies to real too.

<p align="center">
  <img src="https://github.com/ansattz/one-converter/src/main/27brltogpb.png" alt="brl to gpb">

The initial program for converting real to foreign currencies is done using a public class with 5 methods (all with void type, since the objective here is to perform only the conversions). The reverse process is done in the same way changing only the operations (multiplication). After creating the objects with the two classes in the Program class, another method is created to use the switch and allocate the operations that will be called by choice, at the user's choice. Through the swing toolkit, this screen will be called "Currency", obtaining all the options mentioned above.

## Temperature Converter
The temperature converter follows the same logic as the currency converter, the conversion operations that are: celsius to fahrenheit, celsius to kelvin, fahrenheit to kelvin etc... The class responsible for dealing with the interaction of options and conversions it's called TemProgram, which provides us with the swing of the screen called "Temperature" and the conversion options.

<p align="center">
  <img src="https://github.com/ansattz/one-converter/src/main/celsiustokelvin.png" alt="celsius to kelvin">

## Converter program
The Main class was responsible for uniting the other two classes that carry their options. It is in this class that we will load the repeat menu where the user will only be interrupted. The two program options appear as soon as the program is opened, with the window named ONE CONVERTER.

<p align="center">
  <img src="https://github.com/ansattz/one-converter/src/main/
