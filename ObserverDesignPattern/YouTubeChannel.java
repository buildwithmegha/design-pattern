import java.util.ArrayList;
import java.util.List;

// YouTubeChannel.java
public class YouTubeChannel implements Subject {
    private List<Observer> subscribers = new ArrayList<>();
    private String channelName;

    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
        System.out.println("New subscriber added!");
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
        System.out.println("Subscriber removed!");
    }

    @Override
    public void notifySubscribers(String videoTitle) {
        for (Observer subscriber : subscribers) {
            subscriber.update(videoTitle);
        }
    }

    // Additional method to upload video
    public void uploadVideo(String videoTitle) {
        System.out.println("\n" + channelName + " uploaded a new video: " + videoTitle);
        notifySubscribers(videoTitle);
    }
}
