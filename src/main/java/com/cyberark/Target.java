package com.cyberark;

public class Target { 
    
    public static enum Color {
        RED, GREEN
    }
    private Color myColor;

    public Target() {
        myColor = Color.GREEN;
    }

    public Color getCurColor(){
        return this.myColor;
    }

    public void setColorToRed(){
        this.myColor = Color.RED;
    }

    public void setColorToGreen(){
        this.myColor = Color.GREEN;
    }

    public static void main(final String[] args) {
        final Target target = new Target();
        // target.myColor = Color.RED;
      System.out.println(target.myColor);
    }
  }