import java.util.HashMap;
import java.util.Set;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Song1", "Lyrics1");
        trackList.put("Song2", "Lyrics2");
        trackList.put("Song3", "Lyrics3");
        trackList.put("Song4", "Lyrics4");

        System.out.println("Lyrics for Song1: " + trackList.get("Song1"));

        Set<String> songKeys = trackList.keySet();
        for(String key : songKeys) {
            System.out.println(key + ": " + trackList.get(key));
        }
        
    }
}