import java.io.*;
class FileIo{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file=new File("sample.txt");
        file.createNewFile(); // New file creation

        // File information
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length()); // File length in bytes

        // Writing a file
        FileWriter fileWriter=new FileWriter(file);  // Char
        fileWriter.write("Immanuvel Amalan");
        fileWriter.flush();fileWriter.close();

        // Reading a file
        FileReader fileReader=new FileReader(file); // Char
        int i;
        while((i=fileReader.read())!=-1){
            System.out.print((char) i);
        }
        fileReader.close();
        System.out.println();
        // Reading a file
        FileInputStream fileInputStream=new FileInputStream(file); // byte
        BufferedInputStream bin=new BufferedInputStream(fileInputStream);
        int j;
        while((j=bin.read())!=-1){
            System.out.print((char)j);
        }
        FileOutputStream fileOutputStream=new FileOutputStream(new File("sample2.txt"));
        BufferedOutputStream bout=new BufferedOutputStream(fileOutputStream);
        String s="Welcome";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
    }
}