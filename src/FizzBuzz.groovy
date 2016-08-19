class FizzBuzz {

    def public calculate(listOfNumbers) {
        def list = []
        listOfNumbers.each {
        	if (it == 3) {
        		list << "Fizz"
        	} else {											
        		list << it
        	} 
        }
        list
    }
}