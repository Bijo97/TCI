import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.Assert.*;

public class CourseTest {
    @Test
    public void EndDateShouldBeAfterStartDate(){
        //Arrange
        Boolean expect = true;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Course course = null;
        try {
            course = new Course("TCI", sdf.parse("22-11-2018"), sdf.parse("23-11-2018"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Boolean check = false;

        //Act
        if (course.getStartdate().compareTo(course.getEnddate()) < 0){
            check = true;
        } else {
            check = false;
        }

        //Assert
        assertEquals("End date should be after start date!", expect, check);

    }
}