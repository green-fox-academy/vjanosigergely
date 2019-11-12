import static org.junit.Assert.*;

import org.junit.Test;

public class NumberConverterTest {
  NumberConverter numberConverter = new NumberConverter();

  @Test
  public void amountConverter() {
    int number = 100;
    String numberAsWord = "onehundred";
    assertEquals(numberAsWord,numberConverter.amountConverter(number));
  }

  @Test
  public void amountConverter_zerosForSomeValues(){
    int number = 1100;
    String numberAsWord = "onethousand onehundred";
    assertEquals(numberAsWord,numberConverter.amountConverter(number));
  }

  @Test
  public void amountConverter_secondLastDigitIsOne(){
    int number = 1151;
    String numberAsWord = "onethousand onehundred fiftyone";
    assertEquals(numberAsWord,numberConverter.amountConverter(number));
  }
}