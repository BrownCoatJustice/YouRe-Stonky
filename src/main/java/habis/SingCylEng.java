package habis;

public class SingCylEng {
    // TW: Messy getters!
    // Instance variables representing engine statistics with default values
    private int horsepower;
    public int getHorsepower() {
        return horsepower;
    }

    private double torque;
    public double getTorque() {
        return torque;
    }

    private double displacement;
    public double getDisplacement() {
        return displacement;
    }

    private double compressionRatio;
    public double getCompressionRatio() {
        return compressionRatio;
    }

    private double fuelEfficiency;
    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    private int maxRpm;
    public int getMaxRpm() {
        return maxRpm;
    }

    private double thermalEfficiency;
    public double getThermalEfficiency() {
        return thermalEfficiency;
    }

    private double airFuelRatio;
    public double getAirFuelRatio() {
        return airFuelRatio;
    }

    private int idleRpm;
    public int getIdleRpm() {
        return idleRpm;
    }

    private double engineWeight;
    public double getEngineWeight() {
        return engineWeight;
    }

    private double coolantTemperature;
    public double getCoolantTemperature() {
        return coolantTemperature;
    }

    private double exhaustGasTemperature;
    public double getExhaustGasTemperature() {
        return exhaustGasTemperature;
    }
    private double bore;
    public double getBore() {
        return bore;
    }

    private double stroke;
    public double getStroke() {
        return stroke;
    }

    // Default constructor
    public SingCylEng() {
        horsepower = 10; // Default horsepower for a small engine
        torque = 15.0; // Default torque in Newton-meters (Nm)
        displacement = 0.2; // Default engine displacement in liters
        compressionRatio = 8.0; // Default compression ratio
        fuelEfficiency = 50.0; // Default fuel efficiency in miles per gallon (MPG)
        maxRpm = 5000; // Default maximum RPM for a small engine
        thermalEfficiency = 0.25; // Default thermal efficiency for a small engine
        airFuelRatio = 16.0; // Default air-fuel ratio for a small engine
        idleRpm = 800; // Default idle RPM for a small engine
        engineWeight = 20.0; // Default engine weight in kilograms for a small engine
        coolantTemperature = 80.0; // Default coolant temperature in Celsius
        exhaustGasTemperature = 300.0; // Default exhaust gas temperature in Celsius
        bore = 85.0; // Default diameter of cylinder in mm
        stroke = 80.0; // Default distance travelled by piston in 1 cycle
        System.out.println("\n" + "Engine created.");
    }
    // Start RPM = Idle RPM × Stroke / Bore × Displacement ≈ 1882.

    
}
