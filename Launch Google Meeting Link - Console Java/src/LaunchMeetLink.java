import java.awt.Desktop;
import java.net.URI;

public class LaunchMeetLink {
    public static void main(String[] args) {
        try {
            // Google Meet Link
            String meetLink = "https://meet.google.com/your-meet-link";

            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                URI uri = new URI(meetLink);
                desktop.browse(uri);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
