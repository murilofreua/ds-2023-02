package main;

import cell.Cell;
import listeners.CellNotificationListener;

public class Main {
    public static void main(String[] args) {
        Cell cellToChange = new Cell("A2");

        Cell cellToListen1 = new Cell("B4");
        Cell cellToListen2 = new Cell("C8");
        Cell cellToListen3 = new Cell("D2");

        CellNotificationListener cellNotificationListener1 = new CellNotificationListener(cellToListen1);
        CellNotificationListener cellNotificationListener2 = new CellNotificationListener(cellToListen2);
        CellNotificationListener cellNotificationListener3 = new CellNotificationListener(cellToListen3);

        cellToChange.events.subscribe("change", cellNotificationListener1);
        cellToChange.events.subscribe("change", cellNotificationListener2);
        cellToChange.events.subscribe("change", cellNotificationListener3);

        cellToChange.changeCell();

        cellToChange.events.unsubscribe("change", cellNotificationListener3);
        System.out.print('\n');

        cellToChange.changeCell();
    }
}