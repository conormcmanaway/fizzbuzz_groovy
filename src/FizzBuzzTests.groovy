import org.junit.Test
import org.junit.Ignore

class FizzBuzzTests extends GroovyTestCase {

    @Test
    void testFirstFailingTest() {
        def x = new FizzBuzz()

        assert [] == x.calculate([])
    }

     @Test
    void testShouldReturn1WhenPassed1() {
        def x = new FizzBuzz()

        assert [1] == x.calculate([1])
    }

    @Test
    void testShouldReturnFizzWhenPassed3() {
        def x = new FizzBuzz()

        assert ["Fizz"] == x.calculate([3])
    }
}