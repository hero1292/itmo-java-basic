package itmo.java.basic.homework10;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileService fileService = new FileService();
        try {
            List<String> lines = fileService.readFile("files/input.txt");
            System.out.println(lines);

            fileService.writeToFile("files/output.txt", "Hello, World 4");

            lines = fileService.readFile("files/output.txt");
            System.out.println(lines);

            fileService.concatFiles("files/file1.txt", "files/file2.txt", "files/result.txt");

            fileService.replaceNonAlphanumeric("files/input.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
