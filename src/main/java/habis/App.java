package habis;

import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 */
public class App {
    static String vsn;
    public static Scanner foo = new Scanner(System.in);
    public static Engine engine;

    public static void main(String[] args) throws IOException, InterruptedException {
        vsn = version();
        System.out.println("To start the V2 Combustion Engine, type 'S' or 'start'.\n"
                + "To learn more commands type '?' or 'help'");
        switch (foo.nextLine().toLowerCase()) {
            case "start":
                engine = new Engine();
                TimeUnit.SECONDS.sleep(5);
                break;
            case "s":
                engine = new Engine();
                TimeUnit.SECONDS.sleep(3);
                break;
            default:
                System.out.println("Not a command!");
                break;
        }
        showStats();
    }

    private static void showStats() throws InterruptedException {
        while (true) {
            // Clear the console for a clean display
            clearConsole();

            // Display the engine statistics
            System.out.println("Engine Statistics:");
            System.out.println("Horsepower: " + engine.getHorsepower());
            System.out.println("Torque: " + engine.getTorque() + " Nm");
            System.out.println("Displacement: " + engine.getDisplacement() + " liters");
            System.out.println("Compression Ratio: " + engine.getCompressionRatio());
            System.out.println("Bore diameter (piston cylinder): " + engine.getBore());
            System.out.println("Fuel efficiency: " + engine.getStroke());
            System.out.println("Maximum achievable RPM: " + engine.getMaxRpm());
            System.out.println("Thermal efficiency: " + engine.getThermalEfficiency());
            System.out.println("Air/Fuel ratio: " + engine.getAirFuelRatio());
            System.out.println("Idle RPM: " + engine.getIdleRpm());
            System.out.println("Engine weight (kg): " + engine.getEngineWeight());
            System.out.println("Coolant temperature (\u00B0C): " + engine.getCoolantTemperature());
            System.out.println("Exhaust gas temperature (\u00B0C)" + engine.getExhaustGasTemperature());

            // Wait for a short duration before refreshing the output (e.g., every 2
            // seconds)
            TimeUnit.SECONDS.sleep(2);
        }
    }

    static String version() throws IOException {
        final Properties properties = new Properties();
        properties.load(new App().getClass().getClassLoader().getResourceAsStream(".properties"));
        System.out.println("********** EngSim " + properties.getProperty("version") + " **********");
        System.out.println("*********************************************");
        System.out.println("\n\n");
        return properties.getProperty("version");
    }
    private static void clearConsole() {
            try {
                final String os = System.getProperty("os.name");
                if (os.contains("Windows")) {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } else {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                }
            } catch (final Exception e) {
                //What do I do here?
            }
        }
}
