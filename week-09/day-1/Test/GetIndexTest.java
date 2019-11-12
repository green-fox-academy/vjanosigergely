import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class GetIndexTest {
  GetIndex getIndex = new GetIndex();

  @Test
  public void getIndex_SearchedValueIsFirst_ReturnsOne() {
    List<Integer> numlist = Arrays.asList(1,2,3,4,5,6,7,8,9);
    Integer value = numlist.get(1);
    assertEquals(1, getIndex.getIndex(numlist,value));
  }
  @Test
  public void getIndex_SearchedValueIsSecond_ReturnsTwo() {
    List<Integer> numlist = Arrays.asList(1,2,3,4,5,6,7,8,9);
    Integer value = 3;
    assertEquals(2, getIndex.getIndex(numlist,value));
  }
  @Test
  public void getIndex_SearchedValueIsNotInList_ReturnsMinusOne() {
    List<Integer> numlist = Arrays.asList(1,2,3,4,5,6,7,8,9);
    Integer value = -1;
    assertEquals(-1, getIndex.getIndex(numlist,value));
  }
}