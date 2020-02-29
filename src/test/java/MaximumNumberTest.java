import com.generics.MaximumNumberProblem;
import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {
    //Testing Integer Value
    @Test
    public void givenIntegerMaxNumber_WhenAtFirstPosition_ShouldReturnSameNumber() {
        Assert.assertSame(50, new MaximumNumberProblem<>(50, 20, 30).findMaximumNumber());
    }

    @Test
    public void givenIntegerMaxNumber_WhenAtSecondPosition_ShouldReturnSameNumber() {
        Assert.assertSame(50, new MaximumNumberProblem<>(20, 50, 30).findMaximumNumber());
    }

    @Test
    public void givenIntegerMaxNumber_WhenAtThirdPosition_ShouldReturnSameNumber() {
        Assert.assertSame(30, new MaximumNumberProblem<>(10, 20, 30).findMaximumNumber());
    }

    //Testing Float Value
    @Test
    public void givenFloatMaxNumber_WhenAtFirstPosition_ShouldReturnSameNumber() {
        Assert.assertEquals(50.2f, new MaximumNumberProblem<>(50.2f, 20.2f, 30.2f).findMaximumNumber(), 0.0);
    }

    @Test
    public void givenFloatMaxNumber_WhenAtSecondPosition_ShouldReturnSameNumber() {
        Assert.assertEquals(50.2f, new MaximumNumberProblem<>(20.2f, 50.2f, 30.2f).findMaximumNumber(), 0.0);
    }

    @Test
    public void givenFloatMaxNumber_WhenAtThirdPosition_ShouldReturnSameNumber() {
        Assert.assertEquals(50.2f, new MaximumNumberProblem<>(20.2f, 30.2f, 50.2f).findMaximumNumber(), 0.0);
    }

    //Testing String Value
    @Test
    public void givenStringValue_WhenAtFirstPosition_ShouldReturnMaxStringValue() {
        Assert.assertEquals("Peach", new MaximumNumberProblem<>("Peach", "Apple", "Banana").findMaximumNumber());
    }

    @Test
    public void givenStringValue_WhenAtSecondPosition_ShouldReturnMaxStringValue() {
        Assert.assertEquals("Peach", new MaximumNumberProblem<>("Apple", "Peach", "Banana").findMaximumNumber());
    }

    @Test
    public void givenStringValue_WhenAtThirdPosition_ShouldReturnMaxStringValue() {
        Assert.assertEquals("Peach", new MaximumNumberProblem<>("Apple", "Banana", "Peach").findMaximumNumber());
    }

    //Testing Optional Value
    @Test
    public void givenIntegerMaxNumber_WhenAtFirstPosWithMultipleValues_ShouldReturnSameNumber() {
        Assert.assertSame(10, MaximumNumberProblem.findMaximumNumber(10, 9, 8, 7, 6, 5));
    }

    @Test
    public void givenFloatMaxNumber_WhenAtFirstPosWithMultipleValues_ShouldReturnSameNumber() {
        Assert.assertEquals(10.2f, MaximumNumberProblem.findMaximumNumber(10.2f, 9.2f, 8.2f, 7.2f, 6.2f, 5.2f), 0.0);
    }

    @Test
    public void givenStringMaxNumber_WhenAtFirstPosWithMultipleValues_ShouldReturnSameNumber() {
        Assert.assertEquals("Watermelon", MaximumNumberProblem.findMaximumNumber("Watermelon", "Apple", "Mango", "Orange", "Pineapple", "Watermelon"));
    }
}
