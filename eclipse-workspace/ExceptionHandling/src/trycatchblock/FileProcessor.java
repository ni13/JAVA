package trycatchblock;

import java.io.*;

public class FileProcessor {

    public void processFile(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            System.out.println("File content: " + line);
            reader.close();

        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + ex.getMessage());
            
        } catch (IOException ex) {
            System.out.println("Error reading file: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        FileProcessor processor = new FileProcessor();
        processor.processFile("nonexistent_file.txt");  // Simulating file not found error
    }
}