import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Parser {
private String fname;
private List<String> line = new ArrayList<String>();
    //if this was coded properly, my hope was that any file name could be passed to the constructor and then parsed. Whereas, here I
    //attempted to hardcode the CSV file in to no avail.
    public Parser(String fname) {
        this.fname = fname;

    }

    public void parsefile(){
        //file to be parsed
        fname = "C:Users\\User\\Downloads.csv";
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
        //check to see if list is populated
        System.out.println("Here is the contents of what was scanned into line: " + Arrays.toString(line.toArray()));
    }


}
