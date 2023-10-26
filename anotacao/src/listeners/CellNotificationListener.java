package listeners;

import cell.Cell;

public class CellNotificationListener implements EventListener {
    private Cell cell;

    public CellNotificationListener(Cell cell) {
        this.cell = cell;
    }

    @Override
    public void update(String name) {
        System.out.println("Reavaliar " + cell.getName() + " por mudança ocorrida em " + name + "!");
    }
}