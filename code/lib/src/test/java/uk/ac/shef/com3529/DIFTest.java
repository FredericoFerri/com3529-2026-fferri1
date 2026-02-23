
//The class contains four static methods: findLast, countPositive, lastZero, and oddOrPos.

//Each method has a defect. You will need to write JUnit tests that reveal each defect and establish a fix.

package uk.ac.shef.com3529;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DIFTest {

    @Test
    public void shouldReturnIndexZeroWhenElementIsFirst() {
        assertEquals(0, DIFFixed.findLast(new int[]{5, 1, 2, 3}, 5));
    }

    @Test
    public void shouldReturnCorrectIndexWhenElementIsInMiddle() {
        assertEquals(2, DIFFixed.findLast(new int[]{1, 2, 3, 4}, 3));
    }

    @Test
    public void shouldReturnLastIndexWhenElementIsLast() {
        assertEquals(3, DIFFixed.findLast(new int[]{1, 2, 3, 4}, 4));
    }

    // ===== Multiple occurrence cases =====

    @Test
    public void shouldReturnLastIndexWhenOccurrencesAreSeparated() {
        assertEquals(3, DIFFixed.findLast(new int[]{1, 2, 1, 1}, 1));
    }

    @Test
    public void shouldReturnLastIndexWhenOccurrencesAreAdjacent() {
        assertEquals(2, DIFFixed.findLast(new int[]{2, 3, 3, 4}, 3));
    }

    @Test
    public void shouldReturnIndexOneWhenFirstTwoElementsMatch() {
        assertEquals(1, DIFFixed.findLast(new int[]{7, 7, 3, 4}, 7));
    }

    @Test
    public void shouldReturnMinusOneWhenElementNotPresent() {
        assertEquals(-1, DIFFixed.findLast(new int[]{1, 2, 3, 4}, 5));
    }

    @Test
    public void shouldthrowNullPointerExceptionWhenArrayIsNull() {
        assertThrows(NullPointerException.class, () -> 
            DIFFixed.findLast(null, 5)
        );
    }

    @Test
    public void shouldReturnMinusOneWhenArrayIsEmpty() {
        assertEquals(-1, DIFFixed.findLast(new int[]{}, 5));
    }
}
