import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.Assert.*;

public class CourseTest {
    @Test(expected = IllegalArgumentException.class)
    public void EndDateBeforeStartDateShouldThrowException() throws ParseException {
        //Arrange
        Boolean expect = false;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Course course = new Course("TCI", sdf.parse("2018-11-22"), sdf.parse("2018-11-23"));

        //Act


        //Assert


    }
}