public class Main {
    //Main method that pulls all other classes together
    public static void main (String[] args){
        String CSVfile = "C:Users\\User\\Downloads\\ms3Interview.csv";
        //first connect to the database
        SQLiteConnect.main(null);
        //Second parse the given csv file
        Parser parserconstructor = new Parser(CSVfile);
        //Third build the table
        TableSetter.main(null);
    }
}
