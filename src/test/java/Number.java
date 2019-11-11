import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Number {

    @Test
    void givenOneOddNumber_WhenCheckedWeirdOrNotWeird_ThenReturnWeird() {
        WeirdOrNotWeirdNumber number = new WeirdOrNotWeirdNumber();

        Assertions.assertEquals("Weird", number.checkNumber(3));
    }

}
