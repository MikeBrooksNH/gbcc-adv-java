import java.util.Scanner;

public class GasVolume {
   final double GAS_CONST = 8.3144621;

   public double computeGasVolume(double pressure, double temperature, double moles) {
      /*
         PV = nRT
            P is pressure in Pascals
            V is volume in cubic meters
            n is number of moles
            R is the gas constant 8.3144621 ( J / (mol*K)) (GAS_CONST)
            T is temperature in Kelvin
      */
      double volume = (moles * GAS_CONST * temperature) / pressure;
      
      return volume;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      GasVolume volumeChecker = new GasVolume();
      double gasPressure;
      double gasMoles;
      double gasTemperature;
      double gasVolume;

      gasPressure = 100;
      gasMoles = 1 ;
      gasTemperature = 273;

      gasVolume = volumeChecker.computeGasVolume(gasPressure, gasTemperature, gasMoles);
      System.out.println("Gas volume: " + gasVolume + " m^3");
   }
}