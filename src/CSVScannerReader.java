import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class CSVScannerReader
{
    private String fileName;
    public CSVScannerReader(String fileName)
    {
        this.fileName=fileName;
    }
    public void readThisCSVFile() throws FileNotFoundException
    {
        Scanner scanner= new Scanner(new File(this.fileName));    
        scanner.useDelimiter(",");

        while (scanner.hasNext())
        {
            System.out.print(scanner.next()+"|");
        }
        scanner.close();
    }
    
}
