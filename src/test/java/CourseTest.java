import org.junit.Test;

import static org.junit.Assert.*;

public class CourseTest {
    @Test
    public void EndDateShouldBeAfterStartDate(){
        //Arrange
        Boolean expect = false;
        Course course = new Course();
        Boolean check = false;

        //Act
        if (course.getStartdate() < course.getEnddate()){
            check = true;
        } else {
            check = false;
        }

        //Assert
        assertEquals("End date should be after start date!", expect, check);

    }
}