import java.io.FileNotFoundException;

public class CSVTester {
    public static void main(String[] agrs) throws FileNotFoundException
    {
        CSVScannerReader test1= new CSVScannerReader("C:\\Users\\MChri\\OneDrive\\Desktop\\CSVPractice1\\src\\SampleCSVFile.csv");
        test1.readThisCSVFile();
    }
}
