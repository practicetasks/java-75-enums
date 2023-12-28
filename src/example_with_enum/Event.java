package example_with_enum;

public class Event {
    private Season season;

    public Event(Season season) {
        this.season = season;
    }

    public Season getSeason() {
        return season;
    }
}
