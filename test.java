package newpack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
    public static void main(String [] args) throws IOException {
        System.out.println("hello world");
        //char c;
        String c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //c=(char)br.read();
        c=br.readLine();
        System.out.println("["+c+"]");
    }
}
