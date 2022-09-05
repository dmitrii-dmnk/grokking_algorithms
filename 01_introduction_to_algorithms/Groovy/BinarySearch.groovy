#!groovy

static int binarySearch(int[] numbers, int numberForSearch) {
    int lowElementNumber = 0
    int highElementNumber = numbers.length - 1

    while (lowElementNumber <= highElementNumber ) {
        int middleOfArray = (int) ((lowElementNumber + highElementNumber) / 2)
        int guessNumber = numbers[middleOfArray]

        if ( guessNumber == numberForSearch ) {
            return middleOfArray
        }
        if ( guessNumber > numberForSearch ) {
            highElementNumber = middleOfArray - 1
        } else {
            lowElementNumber = middleOfArray + 1
        }
    }
    return -1
}

int[] listOfNumbers = [1, 3, 5, 7, 9]
println(binarySearch(listOfNumbers, 3 ))
