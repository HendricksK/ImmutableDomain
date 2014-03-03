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
public final class Album {

    private String albumName;
    private String release;
    private int albumId;

    public Album(albumBuilder ab) {
        albumName = ab.albumName;
        release = ab.release;
        albumId = ab.albumId;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getRelease() {
        return release;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void disp() {
        System.out.println("Album name is: " + getAlbumName());
        System.out.println("Album ID is: " + getAlbumId());
        System.out.println("Release date is: " + getRelease());
    }

    public static class albumBuilder implements Music {

        private String albumName;
        private String release;
        private int albumId;

        public albumBuilder(int ID) {
            this.albumId = ID;
        }

        public albumBuilder setAlbumName(String albumName) {
            this.albumName = albumName;
            return this;
        }

        public albumBuilder setRelease(String release) {
            this.release = release;
            return this;
        }

        public albumBuilder addToMusic(albumBuilder item) {
            Media.add(item);
            musicList.add(item);
            return this;
        }

    }
}
