import java.util.Scanner;

public class EX_NO_12 {

    static Scanner sc = new Scanner(System.in);

    static String farmerName;
    static String farmLocation;
    static String cropName;
    static double landArea;
    static int soilMoisture;

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" SMART AGRICULTURE MANAGEMENT SYSTEM");
        System.out.println("======================================");

        int choice;

        do {
            System.out.println("\n----------- MAIN MENU -----------");
            System.out.println("1. Enter Farmer & Farm Details");
            System.out.println("2. Enter Crop Details");
            System.out.println("3. Check Soil Moisture");
            System.out.println("4. Irrigation Recommendation");
            System.out.println("5. Fertilizer Recommendation");
            System.out.println("6. Display Farm Summary");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    enterFarmDetails();
                    break;

                case 2:
                    enterCropDetails();
                    break;

                case 3:
                    checkSoilMoisture();
                    break;

                case 4:
                    irrigationRecommendation();
                    break;

                case 5:
                    fertilizerRecommendation();
                    break;

                case 6:
                    displaySummary();
                    break;

                case 7:
                    System.out.println("\nThank you for using Smart Agriculture System!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 7);

        sc.close();
    }

    static void enterFarmDetails() {
        System.out.println("\n--- Farmer & Farm Details ---");

        System.out.print("Enter farmer name: ");
        farmerName = sc.nextLine();

        System.out.print("Enter farm location: ");
        farmLocation = sc.nextLine();

        System.out.print("Enter land area (acres): ");
        landArea = sc.nextDouble();

        System.out.println("Farm details saved successfully!");
    }

    static void enterCropDetails() {
        System.out.println("\n--- Crop Details ---");

        System.out.print("Enter crop name: ");
        cropName = sc.nextLine();

        System.out.println("Crop details saved successfully!");
    }

    static void checkSoilMoisture() {
        System.out.println("\n--- Soil Moisture ---");
        System.out.print("Enter soil moisture percentage (0-100): ");
        soilMoisture = sc.nextInt();

        if (soilMoisture < 0 || soilMoisture > 100) {
            System.out.println("Invalid moisture value.");
        } else if (soilMoisture < 30) {
            System.out.println("Soil is DRY.");
        } else if (soilMoisture < 60) {
            System.out.println("Soil moisture is MODERATE.");
        } else {
            System.out.println("Soil is WET.");
        }
    }

    static void irrigationRecommendation() {
        System.out.println("\n--- Irrigation Recommendation ---");

        if (soilMoisture < 30) {
            System.out.println("Recommendation: Irrigation is REQUIRED.");
            System.out.println("Water the crop immediately.");
        } else if (soilMoisture < 60) {
            System.out.println("Recommendation: Light irrigation is recommended.");
        } else {
            System.out.println("Recommendation: No irrigation required now.");
        }
    }

    static void fertilizerRecommendation() {
        System.out.println("\n--- Fertilizer Recommendation ---");

        if (landArea <= 0) {
            System.out.println("Please enter valid farm details first.");
            return;
        }

        // Simple demonstration calculation
        double fertilizer = landArea * 50;

        System.out.println("Crop: " + cropName);
        System.out.println("Land Area: " + landArea + " acres");
        System.out.println("Estimated fertilizer requirement: "
                + fertilizer + " kg");
    }

    static void displaySummary() {
        System.out.println("\n========== FARM SUMMARY ==========");
        System.out.println("Farmer Name : " + farmerName);
        System.out.println("Farm Location : " + farmLocation);
        System.out.println("Land Area     : " + landArea + " acres");
        System.out.println("Crop       : " + cropName);
        System.out.println("Soil Moisture : " + soilMoisture + "%");
        System.out.println("==================================");
    }
}
