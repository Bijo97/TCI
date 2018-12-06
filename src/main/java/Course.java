import java.util.Date;

public class Course {
    private String name;
    private Date startdate;
    private Date enddate;

    public Course(String name, Date startdate, Date enddate) {
        if (startdate.compareTo(enddate) > 0){
//            System.out.println("Hello");
            throw new IllegalArgumentException("End date should be after start date!");
        }
        this.name = name;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public String getName() {
        return name;
    }

    public Date getStartdate() {
        return startdate;
    }

    public Date getEnddate() {
        return enddate;
    }
}
