import java.io.FileInputStream;
public class DataStreamExample {
    public static void main(String args[]) {
        try {
            String filePath = "D:\\SaiMedha\\Java-ECET\\FilesPractise\\test1.txt";
            
            FileInputStream fin = new FileInputStream(filePath);
    
        
            //reading only first location data .
            for(int c : i){
                System.out.println(c);
            }

            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}