//the goal of this class was to identify the various names and numbers so that they would have meaning and headings before being
//entered into the table
//so I created the variable with all the fields in the CSV file and made getters and setter for each of them

public class InterviewData {
    private String firstn, lastn, gender, onetf, twotf, location, image, email;
    private double salary;

    public InterviewData(String firstn, String lastn, double salary, String email, String gender, boolean onetf, boolean twotf, String location, String image){
        this.firstn = firstn;
        this.lastn = lastn;
        this.salary = salary;
        this.gender = gender;
        this.onetf = onetf;
        this.twotf = twotf;
        this.location = location;
        this.image = image;
        this.email = email;

    }
    
    public void setLastn(String difflastn){
        this.lastn = difflastn;
    }
    
    public void setLocation(String difflocation){
        this.location = difflocation;
    }
   
    
    public void setFirstn(String difffirstn){
        this.firstn = difffirstn;
    }
    public void setGender(String diffgender){
        this.gender = diffgender;
    }
    public void setImage(String diffimage){
        this.image = diffimage;
    }
    public void setSalary(String diffsalary){
        this.salary = diffsalary;
    }

    public boolean isonetf(){
        return this.onetf;
    }
    
    public void setonetf(boolean onetf){
       this.onetf = onetf;
    }
        
    public boolean istwotf(){
        return this.twotf;
    }
        
    public void settwotf(boolean twotf){
        this.twotf = twotf;
    }
    public String getLastn(){
        return lastn;
    }

    public String getFirstn() {
        return firstn;
    }

    public String getGender(){
        return gender;
    }

    public String getOnetf(){
        return onetf;
    }

    public String getLocation(){
        return location;
    }

    public String getImage(){
        return image;
    }
}
