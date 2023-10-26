package main;

import annotation.Observer;
import cell.Cell;
import listeners.CellNotificationListener;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cell cellToChange = new Cell("A2");

        ArrayList<Cell> cells = new ArrayList<Cell>();

        cells.add(new Cell("B4"));
        cells.add(new Cell("C8"));
        cells.add(new Cell("D2"));

        cells.forEach(cell -> {
            if(cellToChange.events.getClass().isAnnotationPresent(Observer.class)) {
                CellNotificationListener cellNotificationListener = new CellNotificationListener(cell);
                cellToChange.events.subscribe("change", cellNotificationListener);
            }
        });

        cellToChange.changeCell();
    }
}
