package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReaderFootball {

    private List<String> resultList = new ArrayList<>();

    public String findSmallestDiff(Path path) {
        List<String> raw = readFileFromPath(path);
        List<String> formatted = formatFileFromPath(raw);
        return popMinimumSpread(formatted);
    }

    private List<String> readFileFromPath(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("File can not be read.");
        }
    }

    private List<String> formatFileFromPath(List<String> stringList) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i < stringList.size(); i++) {
            if (i != 18) {
                result.add(stringList.get(i).substring(7,21).trim()+";"+stringList.get(i).substring(43,45)+";"+stringList.get(i).substring(50,52));
            }

        }
        return result;
    }

    private String popMinimumSpread(List<String> inputList) {
        Integer min = Integer.MAX_VALUE;
        String day = "";
        for (String item : inputList) {
            if ((Integer.parseInt(item.split(";")[1]) - Integer.parseInt(item.split(";")[2])) < min ) {
                min = Integer.parseInt(item.split(";")[1]) - Integer.parseInt(item.split(";")[2]);
                day = item.split(";")[0];
            }
        }
        return day;
    }

    public static void main(String[] args) {
        FileReaderFootball fileReaderFootball = new FileReaderFootball();
        String team = fileReaderFootball.findSmallestDiff(Paths.get("src/main/resources/football.dat"));
        System.out.println(team);
    }

}
