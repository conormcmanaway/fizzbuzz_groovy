class FizzBuzz {

    def public calculate(listOfNumbers) {
        def list = []
        listOfNumbers.each {
        	if (it == 3) {
        		list << "Fizz"
                return
        	} 

            if (it == 5) {											
        		list << "Buzz"
                return
        	} 

            list << it
        }
        list
    }
}