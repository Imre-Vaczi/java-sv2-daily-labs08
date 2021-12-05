package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    private List<String> temperatureList = new ArrayList<>();

    private List<String> readFileFromPath(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("File can not be read.");
        }
    }

    public int findSmallestTemperatureSpread(Path path) {
        List<String> raw = readFileFromPath(path);
        List<String> formatted = formatFileFromPath(raw);
        return popMinimumSpread(formatted);
    }

    private List<String> formatFileFromPath(List<String> stringList) {
        List<String> result = new ArrayList<>();
        for (int i = 2; i < stringList.size()-2; i++) {
            result.add(stringList.get(i).substring(2,4)+";"+stringList.get(i).substring(6,8)+";"+stringList.get(i).substring(12,14));
        }
        return result;
    }

    private int popMinimumSpread(List<String> inputList) {
        Integer min = Integer.MAX_VALUE;
        int day =0 ;
        for (String item : inputList) {
            if ((Integer.parseInt(item.split(";")[1]) - Integer.parseInt(item.split(";")[2])) < min ) {
                min = Integer.parseInt(item.split(";")[1]) - Integer.parseInt(item.split(";")[2]);
                day = Integer.parseInt(item.split(";")[0].trim());
            }
        }
        return day;
    }

    public static void main(String[] args) {

        FileReader fileReader = new FileReader();
        System.out.println(fileReader.findSmallestTemperatureSpread(Paths.get("src/main/resources/weather.dat")));
    }

}
