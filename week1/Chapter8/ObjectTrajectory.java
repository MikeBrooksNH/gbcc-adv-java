import java.util.Scanner;

// Note: 1-letter variable names are typically avoided,
// but used below where standard in physics. */
public class ObjectTrajectory {
   final double GRAVITY = 9.8;     // Earth gravity (m/s^2)
   final static int X = 0;
   final static int Y = 1;

   // Given time, angle, and velocity
   // Use an array to return new position (x and y values) */
   public double[] objectTrajectory(double t, double a, double v) {
      double [] position = new double[2];
      
      position[X] = v * t * Math.cos(a);
      position[Y] = v * t * Math.sin(a) - 0.5 * GRAVITY * t * t;
      
      return position;
   }

   // convert degree value to radians
   public double degToRad(double deg) {
      return ((deg * Math.PI) / 180.0);
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ObjectTrajectory objTracker = new ObjectTrajectory();

      double launchAngle;             // Angle of launch (rad)
      double launchVelocity;          // Velocity (m/s)
      double elapsedTime = 1.0;       // Time (s)

      // Object's height above ground (Y) and horizontal distance from start (X)
      double[] position = new double[2];  

      position[X] = -1.0;
      position[Y] = 0.0;

      System.out.print("Launch angle (deg): ");
      launchAngle = scnr.nextDouble();
      launchAngle = objTracker.degToRad(launchAngle);  

      System.out.print("Launch velocity (m/s): ");
      launchVelocity = scnr.nextDouble();

      System.out.print("Initial height (m): ");
      position[Y] = scnr.nextDouble();

      // While above ground
      while (position[Y] > 0.0) {  
         System.out.println("Time " + elapsedTime + "   x = " + position[X]
                 + "   y = " + position[Y]);
         position = objTracker.objectTrajectory(elapsedTime, launchAngle, launchVelocity);
         elapsedTime = elapsedTime + 1.0;
      }
   }
}