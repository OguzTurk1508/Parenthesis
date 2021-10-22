import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InputValidatorTest {

    private InputValidator inputValidator;

    @BeforeEach
    void beforeEach() {
        inputValidator = new InputValidator();
    }

    @Test
    @DisplayName("valid input = ()")
    public void validOneParenthesisInputShouldReturnTrue(){

        String input = new String("()");

        boolean assertBool = inputValidator.parenthesisValidator(input);
        Assertions.assertTrue(assertBool);
    }

    @Test
    @DisplayName("valid input = ()[]{}")
    public void validThreeParenthesisInputShouldReturnTrue(){

        String input = new String("()[]{}");

        boolean assertBool = inputValidator.parenthesisValidator(input);
        Assertions.assertTrue(assertBool);
    }

    @Test
    @DisplayName("invalid input = (]")
    public void invalidInputShouldReturnFalse(){

        String input = new String("(]");

        boolean assertBool = inputValidator.parenthesisValidator(input);
        Assertions.assertFalse(assertBool);
    }

    @Test
    @DisplayName("valid input = (x12[yz]a)")
    public void validInputShouldReturnTrue(){

        String input = new String("(x12[yz]a)");

        boolean assertBool = inputValidator.parenthesisValidator(input);
        Assertions.assertTrue(assertBool);
    }

    @Test
    @DisplayName("invalid input = {1a2b()")
    public void invalidInputThereIsNoClosingParenthesisShouldReturnFalse(){

        String input = new String("{1a2b()");

        boolean assertBool = inputValidator.parenthesisValidator(input);
        Assertions.assertFalse(assertBool);
    }

    @Test
    @DisplayName("invalid input = ){a}")
    public void invalidInputFirstElementClosingParenthesis(){

        String input = new String("){a}");

        boolean assertBool = inputValidator.parenthesisValidator(input);
        Assertions.assertFalse(assertBool);
    }

    @Test
    @DisplayName("invalid input = oguzturk")
    public void invalidInputThereIsNoParenthesis(){

        String input = new String("oguzturk");

        boolean assertBool = inputValidator.parenthesisValidator(input);
        Assertions.assertFalse(assertBool);
    }
}