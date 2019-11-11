import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Number {

    @Test
    void givenOneOddNumber_WhenCheckedWeirdOrNotWeird_ThenReturnWeird() {
        WeirdOrNotWeirdNumber number = new WeirdOrNotWeirdNumber();

        Assertions.assertEquals("Weird", number.checkNumber(3));
    }

    @Test
    void givenOneEvenNumberBetweenRangSixToTwenty_WhenCheckedWeird_ThenReturnWeird() {
        WeirdOrNotWeirdNumber number = new WeirdOrNotWeirdNumber();

        Assertions.assertEquals("Weird", number.checkNumber(6));
    }

    @Test
    void givenOneEvenNumberRangeBetweenTwoToFive_WhenCheckedNotWeird_ThenReturnNotWeird() {
        WeirdOrNotWeirdNumber number = new WeirdOrNotWeirdNumber();

        Assertions.assertEquals("Not Weird", number.checkNumber(2));
    }

    @Test
    void givenOneEvenNumberGreaterThanTwenty_WhenCheckedNotWeird_ThenReturnNotWeird() {
        WeirdOrNotWeirdNumber number = new WeirdOrNotWeirdNumber();

        Assertions.assertEquals("Not Weird", number.checkNumber(22));
    }

}
