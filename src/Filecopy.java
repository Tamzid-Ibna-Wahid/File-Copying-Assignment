import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Filecopy {

    public static void main(String[] args) {
        String inputFileName;
        String outputFileName;

        if (args.length != 2){
            inputFileName = "input.txt";
            outputFileName = "output.txt";
        }
        else {
            inputFileName = args[0];
            outputFileName = args[1];
        }


        File inputfile = new File(inputFileName);

         try {
            inputfile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to creat this file");
            e.printStackTrace();
        }

        try{
            FileWriter fileWriter = new FileWriter(outputFileName);
            Scanner sc = new Scanner(inputfile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                fileWriter.write(line+"\n");
            }
            fileWriter.close();
            sc.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
        
    }
