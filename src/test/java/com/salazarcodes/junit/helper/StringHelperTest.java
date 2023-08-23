package com.salazarcodes.junit.helper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringHelperTest {

    // AACD => CD, ACD => CD, CDEF => CDEF, CDAA => CDAA
    StringHelper helper;

    @BeforeEach
    public void before(){
        helper = new StringHelper();
    }

    @Test
    public void testTruncateAInFirst2Positions_AinFirst2Positions() {
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
    }
    @Test
    public void testTruncateAInFirst2Positions2_AinFirstPosition() {
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }
    @Test
    public void testTruncateAInFirst2Positions2_AinNoPosition() {
        assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
    }
    @Test
    public void testTruncateAInFirst2Positions2_AinFinalPosition() {
        assertEquals("CDAA", helper.truncateAInFirst2Positions("CADAA"));
    }

    // ABCD => false, ABAB => true, AB => true, A => false
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario(){
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario(){
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_TwoLettersScenario(){
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
    }
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_OneLetterScenario(){
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
    }
}