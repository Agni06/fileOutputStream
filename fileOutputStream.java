import java.io.*;
public class Main {
    public static void main(String[] args) {
        try{
            FileOutputStream file = new FileOutputStream("mydata.txt");
            String note = "Hi, I'm Charan looking for an opportunity at your company";
            byte[] b = note.getBytes();
            file.write(b);
            System.out.println(file.readByte());
            file.close();
            System.out.println("file closing");

        }
        catch(IOException e)
        {
           System.out.println(e);
        }

    }
}
