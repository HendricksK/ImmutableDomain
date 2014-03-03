/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cputgroup3a.immutabledomainfactoryassignment.model.vote;

import cputgroup3a.immutabledomainfactoryassignment.model.music.Music;

/**
 *
 * @author kurvin
 */
public final class VoteDown implements Music {

    private int vote;
    private int VoteId;

    public VoteDown(voteBuilder vb) {
        this.VoteId = vb.VoteId;
        this.vote = vb.vote;
    }

    public static class voteBuilder implements Music
    {
        private int vote;
        private int VoteId;

        public voteBuilder(int ID){
            this.VoteId = ID;
        }
        
        public voteBuilder setVote(int vote) {
            this.vote = vote;
            return this;
        }
        
        public voteBuilder addToMedia(voteBuilder vb){
            Media.add(vb);
            return this;
        }
        
    }
    
    
}
