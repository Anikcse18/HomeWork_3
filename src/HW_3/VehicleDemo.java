package HW_3;

//Main class
public class VehicleDemo {
public static void main(String[] args) {
   // Create manufacture instances
   Manufacture toyota = new Manufacture("Toyota", "Japan");
   Manufacture tesla = new Manufacture("Tesla", "USA");
   Manufacture ford = new Manufacture("Ford", "USA");

   // Create engine instances
   Engine combustionEngine = new CombustionEngine();
   Engine electricEngine = new ElectricEngine();
   Engine hybridEngine = new HybridEngine();

   // Create an array of vehicles
   Vehicle[] vehicles = new Vehicle[6];
   vehicles[0] = new ICEV(toyota, combustionEngine);
   vehicles[1] = new ICEV(ford, combustionEngine);
   vehicles[2] = new BEV(tesla, electricEngine);
   vehicles[3] = new HybridV(toyota, hybridEngine);
   vehicles[4] = new BEV(tesla, electricEngine);
   vehicles[5] = new HybridV(ford, hybridEngine);

   // Show characteristics of each vehicle
   for (Vehicle vehicle : vehicles) {
       vehicle.ShowCharacteristics();
       System.out.println(); // Add a line break for better readability
   }
}
}
