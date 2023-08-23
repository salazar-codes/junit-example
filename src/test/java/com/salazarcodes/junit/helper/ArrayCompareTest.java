package com.salazarcodes.junit.helper;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.Arrays;

@Tag("suiteA")
public class ArrayCompareTest {

    @Test
    public void testArraySort_NullArray() {
        int[] numbers = null;
        assertThrows(NullPointerException.class, ()->{Arrays.sort(numbers);});
    }

    @Test
    void timeoutNotExceededWithResult() {
        // The following assertion succeeds, and returns the supplied object.
        assertTimeout(Duration.ofMillis(1000), () -> {
            int array[] = {12,23,4};
            for (int i=1; i<=1000000; i++){
                array[0] = i;
                Arrays.sort(array);
            }
        });
    }
}
