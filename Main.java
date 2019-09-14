public class Main {
    //the CSV file to be parsed.
    public String CSVfile;

    public static void main (String[] args){
        //first connect to the database
        SQLiteConnect.main(null);
        //Second parse the given csv file
        Parser parserconstructor = new Parser();
        //Third make the table
        TableSetter.main(null);
        


    }
}
