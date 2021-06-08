import java.util.Locale;

public class ApplicationColor {
    public static void main(String[] args) {
        String shortColor = getColor();
        String longColor = getFullColor(shortColor);
        System.out.println(longColor);
        }
        private static String getFullColor(String shortColor) {
            switch (shortColor.toUpperCase()) {
                case "R" : return "Red";
                case "G" : return "Green";
                case "B" : return "Blue";
                default: return "Unknown color";
        }
    }

    private static String getColor() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("First character of the name of the color:");
            String s = scanner.nextLine();
            
            return null;

        }
    }

