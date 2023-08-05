package habis;

public class Engine {
    // TW: Messy getters!
    // Instance variables representing engine statistics with default values
    private int horsepower = 150; // Default horsepower
    public int getHorsepower() {
        return horsepower;
    }
    private double torque = 250.0; // Default torque in Newton-meters (Nm)
    public double getTorque() {
        return torque;
    }
    private double displacement = 2.0; // Default engine displacement in liters
    public double getDisplacement() {
        return displacement;
    }
    private double compressionRatio = 10.0; // Default compression ratio
    public double getCompressionRatio() {
        return compressionRatio;
    }
    private double bore = 85.0; // Default bore diameter in millimeters
    public double getBore() {
        return bore;
    }
    private double stroke = 80.0; // Default stroke length in millimeters
    public double getStroke() {
        return stroke;
    }
    private double fuelEfficiency = 30.0; // Default fuel efficiency in miles per gallon (MPG)
    public double getFuelEfficiency() {
        return fuelEfficiency;
    }
    private int maxRpm = 6000; // Default maximum RPM
    public int getMaxRpm() {
        return maxRpm;
    }
    private double thermalEfficiency = 0.3; // Default thermal efficiency
    public double getThermalEfficiency() {
        return thermalEfficiency;
    }
    private double airFuelRatio = 14.7; // Default air-fuel ratio
    public double getAirFuelRatio() {
        return airFuelRatio;
    }
    private int idleRpm = 800; // Default idle RPM
    public int getIdleRpm() {
        return idleRpm;
    }
    private double engineWeight = 150.0; // Default engine weight in kilograms
    public double getEngineWeight() {
        return engineWeight;
    }
    private double coolantTemperature = 90.0; // Default coolant temperature in Celsius
    public double getCoolantTemperature() {
        return coolantTemperature;
    }
    private double exhaustGasTemperature = 400.0; // Default exhaust gas temperature in Celsius
    public double getExhaustGasTemperature() {
        return exhaustGasTemperature;
    }
    
    // Default constructor
    public Engine() {
        System.out.println("\n" + "Engine created.");
    }
}
