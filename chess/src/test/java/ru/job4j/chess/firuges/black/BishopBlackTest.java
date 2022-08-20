package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {

    @Test
    public void positionTest() {
        BishopBlack black = new BishopBlack(Cell.E7);
        assertThat(Cell.E7, is(black.position()));
    }

    @Test
    public void moveTest() {
        BishopBlack black = new BishopBlack(Cell.C1);
        Cell[] test = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(test, is(black.way(Cell.G5)));
    }

    @Test
    public void copyTest() {
        BishopBlack black = new BishopBlack(Cell.C1);
        assertThat(Cell.C1, is(black.copy(Cell.C1)));
    }
}
