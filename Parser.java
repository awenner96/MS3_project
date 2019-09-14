import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Parser {
private String fname;
private List<String> line = new ArrayList<String>();
    public Parser(String fname) {
        this.fname = fname;

    }

    public void parsefile(){
        File nfile = new File(fname);
        Scanner scanfile = null;
        try {
            scanfile = new Scanner(nfile);
        } catch (FileNotFoundException ex){
            System.err.println(fname + "not found");
            System.exit(1);
        }
        while (scanfile.hasNext()){
           String a = scanfile.nextLine();
           if(a.isEmpty())
               continue;
           else {
               line.add(a);
           }


        }
    }
}
