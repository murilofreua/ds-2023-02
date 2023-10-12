package cell;

import publisher.EventManager;

public class Cell {
    private String name;
    public EventManager events;

    public Cell(String name) {
        this.events = new EventManager("change");
        this.name = name;
    }

    public void changeCell() {
        events.notify("change", this.name);
    }

    public String getName() { return this.name; }
}
