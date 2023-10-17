import greenfoot.*;

public class awan extends Properti{
    
    void awan(){
        GreenfootImage aw = new GreenfootImage("awan2.png");
        int lebar=40;
        int tinggi= 40;
        aw.scale(lebar,tinggi);
        setImage(aw);
    }
    
    public void act(){
        setLocation(getX(),getY()+1);
        if(isAtEdge())
        setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),0);
    }
}