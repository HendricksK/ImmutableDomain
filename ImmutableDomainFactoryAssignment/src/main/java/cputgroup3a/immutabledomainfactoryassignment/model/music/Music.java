/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutabledomainfactoryassignment.model.music;

import java.util.ArrayList;
import java.util.List;
import cputgroup3a.immutabledomainfactoryassignment.model.media.Media;

/**
 *
 * @author kurvin
 */
public interface Music extends Media{
    
    public List<Music> musicList = new ArrayList();

}
