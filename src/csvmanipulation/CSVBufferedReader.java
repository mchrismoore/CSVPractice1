package csvmanipulation;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.File;
import java.util.Scanner;

public class CSVBufferedReader
{
    private File fileName;
    public CSVBufferedReader()
    {
        
    }
    public void readThisCSVFile(BufferedReader buffered_reader) throws FileNotFoundException
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
