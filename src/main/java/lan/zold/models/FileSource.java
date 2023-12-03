package lan.zold.models;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileSource {
    String fileName;
    Scanner scanner;

    public FileSource() {
        fileName = "data.txt";
    }
    
    public ArrayList<Product> readFile() {
        ArrayList<Product> productList = new ArrayList<>();
        
        try {
            File file = new File(fileName);
            scanner = new Scanner(file, "utf-8");
            scanner.nextLine();
            while(scanner.hasNext()) {
                String line = scanner.nextLine();                
                String[] lineArray = line.split(":");
                Product product = new Product(
                    Integer.parseInt(lineArray[0]),
                    lineArray[1],
                    lineArray[2],
                    Double.parseDouble(lineArray[3]), 
                    Integer.parseInt(lineArray[4])
                    );
                productList.add(product);
            }
            
        } catch (IOException e) {
            System.err.println("Hiba! A fájl nem olvasható!");
            System.err.println(e.getMessage());
        }
        return productList;
        
    }    
}
