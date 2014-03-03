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
public final class Artist {
    private String alias;
    private String artistName;
    private String nationality;
    private int artistId;
    
    public Artist(artistBuilder artB){
        alias = artB.alias;
        artistName = artB.artistName;
        nationality = artB.nationality;
    }

    public String getAlias() {
        return alias;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getNationality() {
        return nationality;
    }

    public int getArtistId() {
        return artistId;
    }
    
    public void disp(){
        System.out.println("Artist Alias: " + getAlias());
        System.out.println("Artist Name: " + getArtistName());
        System.out.println("Artist Nationality: " + getNationality());
    }
    
    public static class artistBuilder implements Music{
        private String alias;
        private String artistName;
        private String nationality;
        private int artistId;
        
        
        
        public artistBuilder(int ID){
            this.artistId = ID;
        }

        public artistBuilder setAlias(String alias) {
            this.alias = alias;
            return this;
        }

        public artistBuilder setArtistName(String artistName) {
            this.artistName = artistName;
            return this;
        }

        public artistBuilder setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        
        public artistBuilder addToMusic(artistBuilder item){
            Media.add(item);
            musicList.add(item);
            return this;
        }
    }
    
}
