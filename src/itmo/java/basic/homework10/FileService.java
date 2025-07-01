package itmo.java.basic.homework10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileService {
    public List<String> readFile(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath));
    }

    public void writeToFile(String filePath, String content) throws IOException {
        Files.write(Paths.get(filePath), Collections.singleton(content), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }

    public void concatFiles(String firstFile, String secondFile, String outputFile) throws IOException {
        List<String> firstContent = readFile(firstFile);
        List<String> secondContent = readFile(secondFile);
        Files.write(Paths.get(outputFile), firstContent, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        Files.write(Paths.get(outputFile), secondContent, StandardOpenOption.APPEND);
    }

    public void replaceNonAlphanumeric(String filePath) throws IOException {
        List<String> lines = readFile(filePath);
        List<String> replaced = new ArrayList<>();

        for (String line : lines) {
            replaced.add(line.replaceAll("[^A-Za-z0-9]", "\\$"));
        }

        Files.write(Paths.get(filePath), replaced, StandardOpenOption.TRUNCATE_EXISTING);
    }
}
