import java.util.ArrayList;
public class Song {

    private String title;
    private String artist;

    public Song (String a, String b){
        title = a;
        artist = b;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
    private ArrayList<String> listens = new ArrayList<>();
    public int howMany(ArrayList<String> arrayList) {
        int original = listens.size();
        for (String s: arrayList) {
            if (!listens.contains(s.toLowerCase())) listens.add(s.toLowerCase());
        }
        return listens.size()-original;
    }


}
