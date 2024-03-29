package com.example.julio.julio;

import android.media.Image;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by pedro on 2/20/16.
 */
public class Section implements Serializable{



    ArrayList<Element> content;
    String title;
    String description;
    int id;
    int color;

    public Section(ArrayList<Element> content,String title,String description,int id,int color){
        this.content = content;
        this.title = title;
        this.description = description;
        this.id = id;
        this.color = color;
    }

    public static Section getSectionById(ArrayList<Section> sections,int sectionId){
        for(Section section:sections){
            if(section.id == sectionId){
                return section;
            }
        }
        return null;

    }
}
