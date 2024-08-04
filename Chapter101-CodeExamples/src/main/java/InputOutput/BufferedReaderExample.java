package InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("::: enter values::::");
        int n1 = Integer.parseInt(br.readLine());
        float n2 = Float.parseFloat(br.readLine());
        double n3 = Double.parseDouble(br.readLine());
        String name = br.readLine();
        System.out.println(name);
        char c = (char) br.read();

        System.out.println(c);

        System.out.println(n1+n2+n3);



    }
}
