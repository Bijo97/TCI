import org.junit.Test;

import static org.junit.Assert.*;

public class BasicStatisticTest {

    @Test
    public void numberOfDataItems0WhenNone() {
        //Arrange
        BasicStatistic sut = new BasicStatistic();
        //Act
        int result = sut.numberOfDataItems();
        //Assert
        assertEquals("Expected result should be 0", 0, result);
    }

    @Test
    public void numberOfDataItems0WhenCleared() {
        //Arrange
        BasicStatistic sut = new BasicStatistic();
        //Act
//        sut.addDoubleToData(1.0);
        sut.clearData();
        int result = sut.numberOfDataItems();
        //Assert
        assertEquals("Expected result should be 0", 0, result);
    }

    @Test
    public void numberOfDataItemsNot0WhenNewDataAdded() {
        //Arrange
        BasicStatistic sut = new BasicStatistic();
        //Act
        sut.addDoubleToData(1.0);
        int result = sut.numberOfDataItems();
        //Assert
        assertNotEquals("Expected result shouldn't be 0", 0, result);
    }

    @Test
    public void numberOfDataItemsXWhenXDataAdded() {
        //Arrange
        BasicStatistic sut = new BasicStatistic();
        //Act
        sut.addDoubleToData(1.0);
        sut.addDoubleToData(2.0);
        sut.addDoubleToData(3.0);
        int result = sut.numberOfDataItems();
        //Assert
        assertEquals("Expected result should be 3", 3, result);
    }

    @Test
    public void sumOfAllDataItemsWhenXDataAdded() {
        //Arrange
        BasicStatistic sut = new BasicStatistic();
        //Act
        sut.addDoubleToData(1.0);
        sut.addDoubleToData(2.0);
        sut.addDoubleToData(3.0);
        double result = sut.sum();
        //Assert
        assertEquals(6.0, result, 1e-8);
    }
}