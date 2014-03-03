/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutabledomainfactoryassignment.model.music;

/**
 *
 * @author kurvin
 */
public final class Song {
    private String Name;
    private String Artist;
    private String length;
    private int songId;
    private String album;
    
    public Song(songBuilder item){
        this.Name = item.Name;
        this.Artist = item.Name;
        this.length = item.length;
        this.songId = item.songId;
        this.album = item.album;
    }

    public String getName() {
        return Name;
    }

    public String getArtist() {
        return Artist;
    }

    public String getLength() {
        return length;
    }

    public int getSongId() {
        return songId;
    }

    public String getAlbum() {
        return album;
    }
    
    public void disp(){
        System.out.println("Song name: " + getName());
        System.out.println("Artist: " + getArtist());
        System.out.println("Length: " + getLength());
        System.out.println("Album: " + getAlbum());
        System.out.println("ID: " + getSongId());
    }
    
    public static class songBuilder implements Music{
        private String Name;
        private String Artist;
        private String length;
        private String album;
        private int songId;
        
        public songBuilder(int ID){
            this.songId = ID;
        }

        public songBuilder setName(String Nme) {
            this.Name = Nme;
            return this;
        }

        public songBuilder setArtist(String Art) {
            this.Artist = Art;
            return this;
        }

        public songBuilder setLength(String length) {
            this.length = length;
            return this;
        }
        
        public songBuilder setAlbum(String album){
            this.album = album;
            return this;
        }
        
        public songBuilder addToMusic(songBuilder sb){
            Media.add(sb);
            musicList.add(sb);
            return this;
        }
    }
}
