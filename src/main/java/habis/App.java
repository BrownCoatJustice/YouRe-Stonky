package habis;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;

/**
 * Hello world!
 */
public class App {
    public static Scanner foo = new Scanner(System.in);
    public static SingCylEng engine;
    public static String version;

    public static void main(String[] args) throws InterruptedException, IOException {
        version = version();
        System.out.println("********** EngSim " + version + " **********");
        System.out.println("*********************************************");
        System.out.println("\n\nTo start the Single Cylinder Internal Combustion Engine, type 'S' or 'start'.\n"
                + "To learn more commands type '?' or 'help'");
        cmds();
    }

    private static void cmds() throws InterruptedException {
        System.out.println("\n" + "Command: ");
        switch (foo.nextLine().toLowerCase()) {
            case "start":
            case "s":
                //startEngine();
                TimeUnit.SECONDS.sleep(3);
                break;
            default:
                System.out.println("Not a command!");
                cmds();
        }
    }

    /*private static void startEngine() throws InterruptedException {
        if (engine != null) {
            System.out.println("Engine already running!");
            return;
        }

        engine = new Engine();
        System.out.println("\n" + "Engine started, press 'Q' to stop engine.");
        while (true) {
            // Clear the console for a clean display
            clearConsole();

            // Display the engine statistics
            System.out.println("Engine Statistics:");
            System.out.println("Horsepower: " + engine.getHorsepower());
            System.out.println("Torque: " + engine.getTorque() + " Nm");
            System.out.println("Displacement: " + engine.getDisplacement() + " liters");
            System.out.println("Compression Ratio: " + engine.getCompressionRatio());
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

            if (foo.nextLine().equalsIgnoreCase("q")) {
                stopEngine();
                break;
            }
        }

    }

    private static void stopEngine() throws InterruptedException {
        // Stop engine.
        engine = null;
        System.out.println("Engine stopped. Enter 'S' to start new engine.");
        cmds();
    } */

    static String version() throws IOException {
        String v = "";
        try {
            Model model = readPomFile("pom.xml");
            if (model != null) {
                v = model.getVersion();
            } else {
                System.out.println("Error: Unable to read pom.xml file.");
            }
        } catch (IOException | XmlPullParserException e) {
            System.out.println("Error: 'pom.xml' may be corrupted/deleted! Perform a fresh installation. \n\n" + e.getMessage());
        }
        return v;
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
            // What do I do here?
        }
    }
    private static Model readPomFile(String pomFilePath) throws IOException, XmlPullParserException {
        MavenXpp3Reader reader = new MavenXpp3Reader();
        try (FileReader fileReader = new FileReader(pomFilePath)) {
            return reader.read(fileReader);
        }
    }
}
