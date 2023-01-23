package demo;

import java.io.*;

public class ReadLineByLineExample1
{
    public static void main(String args[])
    {
        File file = new File("C:\\Users\\d884444\\Desktop\\DeleteMe\\Current US\\FUL-31669\\source.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line.split("-")[0]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}