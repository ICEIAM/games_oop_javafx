package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    public Cell[] way(Cell dest) {
        if (!isDiagonal(position, dest)) {
            throw new ImpossibleMoveException(
                    String.format("Could not move by diagonal from %s to %s", position, dest)
            );
        }
        int size = Math.abs(position.x - dest.x);
        Cell[] steps = new Cell[size];
        int deltaX = dest.x - position.x;
        int deltaY = dest.y - position.y;
        for (int index = 0; index < size; index++) {
            int x = deltaX;
            int y = deltaY;
            steps[index] = Cell.findBy(x,y);
        }
        return steps;
    }

    private boolean isDiagonal(Cell source, Cell dest) {
        return (Math.abs(dest.x - source.x)) == (Math.abs(dest.y - source.y));
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}