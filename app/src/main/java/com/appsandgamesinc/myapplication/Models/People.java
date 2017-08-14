package com.appsandgamesinc.myapplication.Models;

/**
 * Created by me on 8/14/17.
 */

public class People
{
    private String name;
    private int imageId;

    public People ()
    {

    }

    public People(String name, int imageId)
    {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getImageId()
    {
        return imageId;
    }

    public void setImageId(int imageId)
    {
        this.imageId = imageId;
    }
}
