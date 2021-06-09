package csvmanipulation;

import java.io.BufferedReader;
import java.io.IOException;

public class CSVBufferedReader
{
    private String row="";
    private String[] csv_data;

    public void readThis(BufferedReader csv_reader) throws IOException
    {
        while ((row=csv_reader.readLine()) !=null)
        {
            csv_data=row.split(",");
        }
        printOutEachEntryIn(csv_data);
        
    }
    
    private static void printOutEachEntryIn(String[] arr)
    {
        for (int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+"|");
        }

    }
    

    
    
}
