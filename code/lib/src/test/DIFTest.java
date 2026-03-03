
//The class contains four static methods: findLast, countPositive, lastZero, and oddOrPos.

//Each method has a defect. You will need to write JUnit tests that reveal each defect and establish a fix.

package uk.ac.shef.com3529;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DIFTest {

    @Test
    public void returnsIndexZero_whenElementIsFirst() {
        assertEquals(0, DIF.findLast(new int[]{5, 1, 2, 3}, 5));
    }

    @Test
    public void returnsCorrectIndex_whenElementIsInMiddle() {
        assertEquals(2, DIF.findLast(new int[]{1, 2, 3, 4}, 3));
    }

    @Test
    public void returnsLastIndex_whenElementIsLast() {
        assertEquals(3, DIF.findLast(new int[]{1, 2, 3, 4}, 4));
    }

    // ===== Multiple occurrence cases =====

    @Test
    public void returnsLastIndex_whenOccurrencesAreSeparated() {
        assertEquals(3, DIF.findLast(new int[]{1, 2, 1, 1}, 1));
    }

    @Test
    public void returnsLastIndex_whenOccurrencesAreAdjacent() {
        assertEquals(2, DIF.findLast(new int[]{2, 3, 3, 4}, 3));
    }

    @Test
    public void returnsIndexOne_whenFirstTwoElementsMatch() {
        assertEquals(1, DIF.findLast(new int[]{7, 7, 3, 4}, 7));
    }

    @Test
    public void returnsMinusOne_whenElementNotPresent() {
        assertEquals(-1, DIF.findLast(new int[]{1, 2, 3, 4}, 5));
    }

    @Test
    public void throwsNullPointerException_whenArrayIsNull() {
        assertThrows(NullPointerException.class, () -> 
            DIF.findLast(null, 5)
        );
    }

    @Test
    public void returnsMinusOne_whenArrayIsEmpty() {
        assertEquals(-1, DIF.findLast(new int[]{}, 5));
    }
}
