import book.Chapter;
import org.junit.Assert;
import org.junit.Test;

public class BookTest {

    @Test
    public void ChapterNameIsNotNull(){
        //Arrage
        Chapter chapter = new Chapter("Hello", 1);
        String name = null;

        //Act

        //Assert
        Assert.assertNotEquals("Chapter name can't be null!", null, chapter.getName());
    }
}
