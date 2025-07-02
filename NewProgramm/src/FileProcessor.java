import java.io.*;
import java.nio.file.*;
import java.util.List;

public class FileProcessor {

    public void writeToFile(String filename, String data) throws FileProcessingException {
        try {
            Files.write(Paths.get(filename), data.getBytes());
        } catch (IOException e) {
            throw new FileProcessingException("Ошибка при записи в файл: " + filename, e);
        }
    }

    public String readFromFile(String filename) throws FileProcessingException {
        try {
            List<String> lines = Files.readAllLines(Paths.get(filename));
            return String.join("\n", lines);
        } catch (IOException e) {
            throw new FileProcessingException("Ошибка при чтении из файла: " + filename, e);
        }
    }
}