import java.util.*;

class Bogie {
    String type;

    Bogie(String type) {
        this.type = type;
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<Bogie> consist = new ArrayList<>();

        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + consist.size());
    }
}