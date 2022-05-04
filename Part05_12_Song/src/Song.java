public class Song {
 
    private String artist;
    private String name;
    private int durationInSeconds;
 
    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Song)) {        
        return false;
    }
        
        Song comparedSong = (Song) compared;
        
        if (artist.equals(comparedSong.artist) &&
           name.equals(comparedSong.name) &&
           durationInSeconds == comparedSong.durationInSeconds) {
          return true;
        }
        return false;
    }
 
    @Override
    public String toString() {
        return artist + ": " + name + " (" + durationInSeconds + " s)";
    }
}