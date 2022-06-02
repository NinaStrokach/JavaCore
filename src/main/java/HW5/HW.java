package HW5;
import java.util.Arrays;

public class HW {
    public static void main(String[] args) {
        AppData data = new AppData();
        data.readFromFile("feature.csv");
        System.out.println(Arrays.toString(data.getHeader()));
        System.out.println(Arrays.deepToString(data.getData()));

        data.writeToCSV("new_feature.csv");
    }
}
