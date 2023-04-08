import java.io.FileOutputStream;
public class FileOutputStreamExample {
    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream("D:\\SaiMedha\\Java-ECET\\FilesPractise\\test1.txt");
            
            //storing primitives
            fout.write(65);

            //storing byte data
            byte[] data = {97,78,104,89};
            fout.write(data);

            //storing strings/characters
            fout.write("\nHello Welcome to file operations".getBytes());

            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}