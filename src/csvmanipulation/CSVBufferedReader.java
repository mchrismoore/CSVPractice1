package csvmanipulation;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class CSVBufferedReader
{
    private File fileName;
    public CSVBufferedReader(File fileName)
    {
        this.fileName=fileName;
    }
    public void readThisCSVFile() throws FileNotFoundException
    {
        Scanner scanner= new Scanner(this.fileName);    
        scanner.useDelimiter(",");

        while (scanner.hasNext())
        {
            System.out.print(scanner.next()+"|");
        }
        scanner.close();
    }

    
    
}
