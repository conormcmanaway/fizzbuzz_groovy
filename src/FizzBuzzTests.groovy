import org.junit.Test
import org.junit.Ignore

class FizzBuzzTests extends GroovyTestCase {

    @Test
    void testFirstFailingTest() {
        def x = new FizzBuzz()

        assert [] == x.calculate([])
    }
}