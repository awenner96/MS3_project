public class InterviewData {
    private String firstn, lastn, gender, onetf, twotf, location, image, email;
    private double salary;

    public InterviewData(String firstn, String lastn, double salary, String email, String gender, String onetf, String twotf, String location, String image){
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
