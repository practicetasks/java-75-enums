package example_without_enum;

public class Event {
    private Season season;

    public Event(Season season) {
        this.season = season;
    }

    public Season getSeason() {
        return season;
    }
}
