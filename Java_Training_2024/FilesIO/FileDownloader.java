package FilesIO;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.URL;

public class FileDownloader {
    public static void main(String[] args) {
        String imageUrl = "https://www.youtube.com/watch?v=LX4JUscM9Sk";
        String fileName = "download-video-2.mp4";
        downloadFile(imageUrl, fileName);
    }

    private static void downloadFile(String imageUrl, String fileName) {
        final long starTime = System.currentTimeMillis();
        // Read the image data from url 
        try(BufferedInputStream bis = new BufferedInputStream(new URL(imageUrl).openStream()) ; 
            FileOutputStream fos = new FileOutputStream(fileName)){
            byte[] buffer = new byte[1024]; // 1kb
            int bytesRead;
            while ((bytesRead = bis.read(buffer, 0, buffer.length)) != -1) {
                fos.write(buffer, 0,bytesRead); // everytime it will write 1024 bytes
            }
            System.out.println("file download is completed..");
            System.out.println("Time taken to download: " + (System.currentTimeMillis() - starTime));
        } catch(Exception ex) {
            System.out.println("Exception occurred: " + ex.getMessage());
            System.out.println(ex);
        } 
        
    }
}
