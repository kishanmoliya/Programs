import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreatingFile {
    public static void main(String[] args) throws IOException {
        File f = new File("file1.txt");

        //Creating a File...
        try{
            f.createNewFile();
            System.out.println("File creating successfully.");
        }catch (IOException e){
            e.printStackTrace();
        }

//        //Writing in a file...
//        try{
//            FileWriter fw = new FileWriter("file1.txt");
//            fw.write("This is a second method to writing in a file...");
//            fw.close();
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        //Multiplication table print in a File...
        int k=18;
        String table="";
        for(int i=1;i<=10;i++){
            table += k+ "*" +i+"=" +i*k;
            table += "\n";
        }
        try{
            FileWriter fw = new FileWriter("file1.txt");
            fw.write(table);
            fw.write("This is a second method to writing in a file...");
            fw.close();
        }catch (IOException e){
            e.printStackTrace();
        }


        //Read a File...
        try{
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
