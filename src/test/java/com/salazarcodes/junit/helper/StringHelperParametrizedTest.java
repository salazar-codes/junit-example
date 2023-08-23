package com.salazarcodes.junit.helper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@Tag("suiteA")
class StringHelperParametrizedTest {

    StringHelper helper;

    @BeforeEach
    public void before(){
        helper = new StringHelper();
    }

    private static Stream<Arguments> testTruncateAInFirst2Positions_Conditions() {
        return Stream.of(
                Arguments.of("AACD","CD"),
                Arguments.of("ACD","CD"),
                Arguments.of("CD","CD"),
                Arguments.of("CDEF","CDEF"),
                Arguments.of("CDAA","CDAA")
        );
    }

    @ParameterizedTest
    @MethodSource("testTruncateAInFirst2Positions_Conditions")
    public void testTruncateAInFirst2Positions(String input, String expectedOutput) {
        assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
    }

    private static Stream<Arguments> testAreFirstAndLastTwoCharactersTheSame_Conditions() {
        return Stream.of(
                Arguments.of("ABCD",false),
                Arguments.of("ABAB",true),
                Arguments.of("AB",true),
                Arguments.of("A",false)
        );
    }

    @ParameterizedTest
    @MethodSource("testAreFirstAndLastTwoCharactersTheSame_Conditions")
    public void testAreFirstAndLastTwoCharactersTheSame(String input, boolean expectedOutput){
        assertEquals(expectedOutput,helper.areFirstAndLastTwoCharactersTheSame(input));
    }
}