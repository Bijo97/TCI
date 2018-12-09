import book.Chapter;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class BookTest {

    public static final Object[] getData() {
        return new Object[] {
                new Object[] {"Hello", "1"},
                new Object[] {"Hello", "1.2"},
                new Object[] {"Hello", "1.2.3"}
        };
    }

    @Test
    @Parameters(method = "getData")
    public void ChapterNameIsNotNull(String name, String number){
        //Arrage
        Chapter chapter = new Chapter(name, number);
        String res = null;

        //Act

        //Assert
        Assert.assertNotEquals("Chapter name can't be null!", res, chapter.getName());
    }

    @Test
    @Parameters(method = "getData")
    public void NumberIsAStringAndMaximumTwoLevel(String name, String number){
        //Arrange
        Chapter chapter = new Chapter(name, number);
        Boolean res = false;

        //Act
        if (chapter.getNumber().matches("^\\d+(\\.\\d+)?$")){
            res = true;
        }

        //Assert
        Assert.assertTrue("Number must be a string and maximum two level!", res);

    }

    @Test (expected = IllegalArgumentException.class)
    @Parameters(method = "getData")
    public void WrongNameOrNumberThrowException(String name, String number){
        //Arrange
        Chapter chapter = new Chapter(name, number);
        Boolean res = false;

        //Act

        //Assert


    }
}
