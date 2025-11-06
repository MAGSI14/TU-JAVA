import java.util.*;
public class EventLog {
    private List <String> events;
    private final int MAX_EVENTS = 100;

    public EventLog() {
        this.events = new ArrayList<>();
    }

    public EventLog(List<String> events) throws TooManyEvents {
        if (events.size()>MAX_EVENTS){
            throw new TooManyEvents("Too many events!");
        }
        this.events = new ArrayList<>(events);
    }

    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> newEvents) throws TooManyEvents{
        if(newEvents.size()>MAX_EVENTS){
            throw new TooManyEvents("Cannot add those events!");
        }
        this.events = newEvents;
    }

    public void addEvent(String newestEvent) throws TooManyEvents{
        if(this.events.size()+1>MAX_EVENTS){
            throw new TooManyEvents("Cannot add a new event! The event list is already full!");
        } else{
            this.events.add(newestEvent);
        }
    }

    public void Print(){
        for (int i = 1; i <= this.events.size(); i++) {
            System.out.println(this.events.get(i));
        }
    }
}
