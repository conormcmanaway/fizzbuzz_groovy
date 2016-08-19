import org.junit.Test
import org.junit.Ignore

class FizzBuzzTests extends GroovyTestCase {

    @Test
    void testShouldFirstFailingTest() {
        def x = new FizzBuzz()

        assert [] == x.calculate([])
    }
}