import com.generics.MaximumNumberProblem;
import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {

    @Test
    public void givenIntegerMaxNumber_WhenAtFirstPosition_ShouldReturnSameNumber() {
        MaximumNumberProblem maximumNumberProblemObj = new MaximumNumberProblem(50, 20, 30);
        Comparable maximumNumber = maximumNumberProblemObj.findMaximumNumber();
        Assert.assertSame(50, maximumNumber);
    }

    @Test
    public void givenIntegerMaxNumber_WhenAtSecondPosition_ShouldReturnSameNumber() {
        MaximumNumberProblem maximumNumberProblemObj = new MaximumNumberProblem(50, 20, 30);
        Comparable maximumNumber = maximumNumberProblemObj.findMaximumNumber();
        Assert.assertSame(50, maximumNumber);
    }

    @Test
    public void givenIntegerMaxNumber_WhenAtThirdPosition_ShouldReturnSameNumber() {
        MaximumNumberProblem maximumNumberProblemObj = new MaximumNumberProblem(10, 20, 30);
        Comparable maximumNumber = maximumNumberProblemObj.findMaximumNumber();
        Assert.assertSame(30, maximumNumber);
    }

    @Test
    public void givenFloatMaxNumber_WhenAtFirstPosition_ShouldReturnSameNumber() {
        MaximumNumberProblem maximumNumberProblemObj = new MaximumNumberProblem(50.2f, 20.2f, 30.2f);
        Comparable maximumNumber = maximumNumberProblemObj.findMaximumNumber();
        Assert.assertEquals(50.2f, (Float) maximumNumber, 0.0f);
    }

    @Test
    public void givenFloatMaxNumber_WhenAtSecondPosition_ShouldReturnSameNumber() {
        MaximumNumberProblem maximumNumberProblemObj = new MaximumNumberProblem(50.2f, 20.2f, 30.2f);
        Comparable maximumNumber = maximumNumberProblemObj.findMaximumNumber();
        Assert.assertEquals(50.2f, (Float) maximumNumber, 0.0f);
    }

    @Test
    public void givenFloatMaxNumber_WhenAtThirdPosition_ShouldReturnSameNumber() {
        MaximumNumberProblem maximumNumberProblemObj = new MaximumNumberProblem(50.2f, 20.2f, 30.2f);
        Comparable maximumNumber = maximumNumberProblemObj.findMaximumNumber();
        Assert.assertEquals(50.2f, (Float) maximumNumber, 0.0f);
    }

    @Test
    public void givenStringValue_WhenAtFirstPosition_ShouldReturnMaxStringValue() {
        MaximumNumberProblem maximumNumberProblemObj = new MaximumNumberProblem("xyz", "abc", "def");
        Comparable maximumNumber = maximumNumberProblemObj.findMaximumNumber();
        Assert.assertEquals("xyz", maximumNumber);
    }

    @Test
    public void givenStringValue_WhenAtSecondPosition_ShouldReturnMaxStringValue() {
        MaximumNumberProblem maximumNumberProblemObj = new MaximumNumberProblem("abc", "xyz", "def");
        Comparable maximumNumber = maximumNumberProblemObj.findMaximumNumber();
        Assert.assertEquals("xyz", maximumNumber);
    }

    @Test
    public void givenStringValue_WhenAtThirdPosition_ShouldReturnMaxStringValue() {
        MaximumNumberProblem maximumNumberProblemObj = new MaximumNumberProblem("abc", "def", "xyz");
        Comparable maximumNumber = maximumNumberProblemObj.findMaximumNumber();
        Assert.assertEquals("xyz", maximumNumber);
    }

}
