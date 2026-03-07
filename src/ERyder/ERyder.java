package ERyder;

public class ERyder {
   private int bikeID;
   private int batteryLevel;
   private boolean isAvailable;
   private int kmDriven;

   public ERyder(int var1, int var2, boolean var3, int var4) {
      this.bikeID = var1;
      this.batteryLevel = var2;
      this.isAvailable = var3;
      this.kmDriven = var4;
      if (var2 <= 0) {
         this.isAvailable = false;
      } else {
         this.isAvailable = true;
      }

   }

   public void ride() {
      if (this.isAvailable) {
         this.batteryLevel -= 10;
         if (this.batteryLevel <= 0) {
            this.isAvailable = false;
         } else {
            System.out.println("Bike " + this.bikeID + " is available.");
         }
      } else {
         System.out.println("Bike " + this.bikeID + " is not available.");
      }

   }

   public void printBikeDetails() {
      int var10001 = this.bikeID;
      System.out.println("Bike ID: " + var10001);
      var10001 = this.batteryLevel;
      System.out.println("Battery Level: " + var10001);
      System.out.println("Availability: " + (this.isAvailable ? "Available" : "Not Available"));
      var10001 = this.kmDriven;
      System.out.println("Kilometers Driven: " + var10001);
   }
}