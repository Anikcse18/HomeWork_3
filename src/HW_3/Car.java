package HW_3;

//Engine superclass and subclasses
abstract class Engine {
 String engineType;

 public Engine(String engineType) {
     this.engineType = engineType;
 }

 public String getEngineType() {
     return engineType;
 }
}

class CombustionEngine extends Engine {
 public CombustionEngine() {
     super("Combustion Engine");
 }
}

class ElectricEngine extends Engine {
 public ElectricEngine() {
     super("Electric Engine");
 }
}

class HybridEngine extends Engine {
 public HybridEngine() {
     super("Hybrid Engine");
 }
}

//Manufacture class
class Manufacture {
 private String name;
 private String country;

 public Manufacture(String name, String country) {
     this.name = name;
     this.country = country;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public String getCountry() {
     return country;
 }

 public void setCountry(String country) {
     this.country = country;
 }
}

//Vehicle superclass and subclasses
abstract class Vehicle {
 protected Manufacture manufacture;
 protected Engine engine;

 public Vehicle(Manufacture manufacture, Engine engine) {
     this.manufacture = manufacture;
     this.engine = engine;
 }

 public abstract void ShowCharacteristics();
}

class ICEV extends Vehicle {
 public ICEV(Manufacture manufacture, Engine engine) {
     super(manufacture, engine);
 }

 @Override
 public void ShowCharacteristics() {
     System.out.println("ICEV Characteristics: ");
     System.out.println("Manufacture: " + manufacture.getName() + ", Country: " + manufacture.getCountry());
     System.out.println("Engine Type: " + engine.getEngineType());
 }
}

class BEV extends Vehicle {
 public BEV(Manufacture manufacture, Engine engine) {
     super(manufacture, engine);
 }

 @Override
 public void ShowCharacteristics() {
     System.out.println("BEV Characteristics: ");
     System.out.println("Manufacture: " + manufacture.getName() + ", Country: " + manufacture.getCountry());
     System.out.println("Engine Type: " + engine.getEngineType());
 }
}

class HybridV extends Vehicle {
 public HybridV(Manufacture manufacture, Engine engine) {
     super(manufacture, engine);
 }

 @Override
 public void ShowCharacteristics() {
     System.out.println("HybridV Characteristics: ");
     System.out.println("Manufacture: " + manufacture.getName() + ", Country: " + manufacture.getCountry());
     System.out.println("Engine Type: " + engine.getEngineType());
 }
}

