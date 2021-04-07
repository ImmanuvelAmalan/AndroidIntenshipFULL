import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class ReadWriteAppend{
    public static void main(String[] args) throws IOException {
        File file=new File("sample.txt");
        file.setWritable(true);
        FileWriter fileWriter=new FileWriter(file,true);  // Append to a file
        fileWriter.write("\nHello Immanuvel");
        fileWriter.flush();fileWriter.close();
        file.setWritable(false); // read only
        System.out.println(file.canWrite());
        File file1=new File("sample2.txt");
        file1.setReadable(false); // write only
    }
}