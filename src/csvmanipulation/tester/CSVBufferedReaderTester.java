package csvmanipulation.tester;
import csvmanipulation.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;



public class CSVBufferedReaderTester {
    public static void main(String[] agrs) throws IOException
    {
        BufferedReader buffered_reader=new BufferedReader(new FileReader("src\\SampleCSVFile.csv"));
        CSVBufferedReader csv_reader= new CSVBufferedReader();
        csv_reader.readThisCSVFile(buffered_reader);
    }
    /*doing this to see to make a commit so i can look at git lens and
    see if the feature branchs are branching off.*/

}

