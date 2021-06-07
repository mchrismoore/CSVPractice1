package csvmanipulation;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class CSVScannerReader {

    public static void readThisCSVFile(File fileName) throws FileNotFoundException
    {
        
        Scanner scanner=new Scanner(fileName);
        scanner.useDelimiter(",");

        while (scanner.hasNext()) {
            System.out.print(scanner.next() + "|");
        }
        scanner.close();
    }
        
    

}
