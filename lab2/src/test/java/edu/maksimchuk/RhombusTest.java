package edu.maksimchuk;

/**
 @author Tom
 @project lab2
 @class RhombusTest
 @version 1.0.0
 @since 30.03.2025 - 19.39
 */

import org.junit.Assert;
import org.junit.Test;

public class RhombusTest {

    @Test
    public void calculateAreaMustBe24() {
        Rhombus rhombus = new Rhombus(6, 8);
        Assert.assertEquals(24.0, rhombus.calculateArea(), 0.0001);
    }

    @Test
    public void calculatePerimeterMustBe20() {
        Rhombus rhombus = new Rhombus(6, 8);
        Assert.assertEquals(20.0, rhombus.calculatePerimeter(), 0.0001);
    }

    @Test
    public void isSquareMustReturnTrueForEqualDiagonals() {
        Rhombus rhombus = new Rhombus(6, 6);
        Assert.assertTrue(rhombus.isSquare());
    }

    @Test
    public void isSquareMustReturnFalseForUnequalDiagonals() {
        Rhombus rhombus = new Rhombus(6, 8);
        Assert.assertFalse(rhombus.isSquare());
    }

    @Test
    public void setDiagonalsMustUpdateValuesTo10And12() {
        Rhombus rhombus = new Rhombus(6, 8);
        rhombus.setDiagonals(10, 12);
        Assert.assertEquals(10, rhombus.getDiagonal1(), 0.0001);
        Assert.assertEquals(12, rhombus.getDiagonal2(), 0.0001);
    }

    @Test
    public void getDiagonal1MustReturn6() {
        Rhombus rhombus = new Rhombus(6, 8);
        Assert.assertEquals(6, rhombus.getDiagonal1(), 0.0001);
    }

    @Test
    public void getDiagonal2MustReturn8() {
        Rhombus rhombus = new Rhombus(6, 8);
        Assert.assertEquals(8, rhombus.getDiagonal2(), 0.0001);
    }
}
