package com.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class InfiltrationTest {

    @Test
    public void testCanFastAttack() {
        assertFalse(Infiltration.canFastAttack(true));
        assertTrue(Infiltration.canFastAttack(false));
    }

    @Test
    public void testCanSpy() {
        assertTrue(Infiltration.canSpy(true, false, false));
        assertTrue(Infiltration.canSpy(false, true, false));
        assertTrue(Infiltration.canSpy(false, false, true));
        assertFalse(Infiltration.canSpy(false, false, false));
    }

    @Test
    public void testCanSignalPrisoner() {
        assertTrue(Infiltration.canSignalPrisoner(false, true));
        assertFalse(Infiltration.canSignalPrisoner(true, true));
        assertFalse(Infiltration.canSignalPrisoner(false, false));
        assertFalse(Infiltration.canSignalPrisoner(true, false));
    }

    @Test
    public void testCanFreePrisoner() {
        assertTrue(Infiltration.canFreePrisoner(true, false, true, true));
        assertTrue(Infiltration.canFreePrisoner(false, false, true, false));
        assertFalse(Infiltration.canFreePrisoner(true, true, true, true));
        assertFalse(Infiltration.canFreePrisoner(true, true, false, true));
    }

    @Test
    public void testCanRiskyAttack() {
        assertTrue(Infiltration.canRiskyAttack(false, false));
        assertFalse(Infiltration.canRiskyAttack(true, false));
        assertFalse(Infiltration.canRiskyAttack(false, true));
        assertFalse(Infiltration.canRiskyAttack(true, true));
    }
}
