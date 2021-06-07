package csvmanipulation.tester;
import java.io.File;
import java.io.FileNotFoundException;
import csvmanipulation.*;

public class CSVScannerTester {
    public static void main(String[] agrs) throws FileNotFoundException
    {
        CSVScannerReader.readThisCSVFile(new File("src//SampleCSVFile.csv"));
    }
}