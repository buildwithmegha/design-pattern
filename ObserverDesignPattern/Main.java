// Main.java
public class Main {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel("Let's Unfold");

        Observer s1 = new Subscriber("Megha");
        Observer s2 = new Subscriber("Aarav");
        Observer s3 = new Subscriber("Riya");

        channel.subscribe(s1);
        channel.subscribe(s2);
        channel.subscribe(s3);

        channel.uploadVideo("Day 1: Starting 30-Day Study Challenge");
        channel.uploadVideo("Day 2: Beating Procrastination");

        // Unsubscribe one user
        channel.unsubscribe(s2);

        channel.uploadVideo("Day 3: How to Stay Consistent!");
    }
}
