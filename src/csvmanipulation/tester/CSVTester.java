package csvmanipulation.tester;
import java.io.File;
import java.io.FileNotFoundException;
import csvmanipulation.*;

public class CSVTester {
    public static void main(String[] agrs) throws FileNotFoundException
    {
              CSVScannerReader.readThisCSVFile(new File("C:\\Users\\MChri\\OneDrive\\Desktop\\CSVPractice1\\src\\SampleCSVFile.csv"));
    }


   
    
    
}