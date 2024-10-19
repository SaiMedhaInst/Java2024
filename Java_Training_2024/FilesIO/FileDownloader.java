package FilesIO;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.URL;

public class FileDownloader {
    public static void main(String[] args) {
        String imageUrl = "https://unsplash.com/photos/1qCSGzVEKKQ/download?ixid=M3wxMjA3fDB8MXxzZWFyY2h8Mnx8c3BsYXNofGVufDB8fHx8MTcyOTMyMTI5MHww&force=true";
        String fileName = "download-image1.jpg";
        downloadFile(imageUrl, fileName);
    }

    private static void downloadFile(String imageUrl, String fileName) {
        // Read the image data from url 
        try(BufferedInputStream bis = new BufferedInputStream(new URL(fileName).openStream())) {
            FileOutputStream fos = new FileOutputStream(fileName);
            byte[] buffer = new byte[1024]; // 1kb
            int bytesRead;
            while ((bytesRead = bis.read(buffer, 0, buffer.length)) != -1) {
                fos.write(buffer, 0,bytesRead); // everytime it will write 1024 bytes
            }
            System.out.println("file download is completed..");
            fos.close();
        } catch(Exception ex) {
            System.out.println("Exception occurred: " + ex.getMessage());
            System.out.println(ex);
        } 
        
    }
}
