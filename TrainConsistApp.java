import java.util.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Second Sitting", 90));

        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        System.out.println("Total Seating Capacity: " + totalCapacity);

        System.out.println("Original List:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}