public class WeirdOrNotWeirdNumber {
    public String checkNumber(int number) {
        if (number % 2 == 0) {
            if ((number >= 6 && number <= 20)) {
                return "Weird";
            }
            if ((number >= 2 && number <= 5) || number >= 20) {
                return "Not Weird";
            }
        }
        return "Weird";
    }


}
/*
If  is odd, print Weird
If  is even and in the inclusive range of  2to5 , print Not Weird
If  is even and in the inclusive range of 6 to 20, print Weird
If  is even and greater than 20, print Not Weird
 */
