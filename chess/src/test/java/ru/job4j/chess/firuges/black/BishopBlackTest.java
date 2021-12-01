package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Cell posActual = bishopBlack.position();
        Cell posExpected = Cell.findBy(Cell.A1.getX(), Cell.A1.getY());
        Assert.assertEquals(posExpected, posActual);
    }

    @Test
    public void copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Figure bishopBlackDest = bishopBlack.copy(Cell.C3);
        Cell posActual = bishopBlackDest.position();
        Cell posExpected = Cell.findBy(Cell.C3.getX(), Cell.C3.getY());
        Assert.assertEquals(posExpected, posActual);
    }

    @Test
    public void way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.G5);
        Cell[] arrayActual = bishopBlack.way(Cell.C1);
        Cell[] arrayExpected = new Cell[] {Cell.F4, Cell.E3, Cell.D2, Cell.C1};
        Assert.assertArrayEquals(arrayExpected, arrayActual);
    }
}