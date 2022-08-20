package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertThrows;

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

    @Test (expected = ImpossibleMoveException.class)
    public void wrongDiagonalTest() throws ImpossibleMoveException {
        BishopBlack black = new BishopBlack(Cell.C1);
        black.way(Cell.C2);
        }

    @Test
    public void copyTest() {
        BishopBlack black = new BishopBlack(Cell.C2);
        assertThat(new BishopBlack(Cell.C2), is(black.copy(Cell.C2)));
    }
}
