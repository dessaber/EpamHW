package javase01.t02.Inheritance;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;

/**
 * Created by m-levin on 08.05.2017.
 */

public abstract class Stationery {

    public enum Color { BLACK, BLUE, RED, GREEN, VIOLET }

    private String name;
    private Color color;
    private int cost;

    public static void main (String[] args) {

        ArrayList<Stationery> beginnersKit = equipKit();
        for (Stationery s: beginnersKit)
            System.out.println(s);

    }

    public static ArrayList<Stationery> equipKit () {
        ArrayList<Stationery> kit = new ArrayList<>();
        kit.add(new Pen("An Erich Krause pen", Stationery.Color.BLUE, 12, 100));
        kit.add(new Eraser("A Tukzar eraser", Stationery.Color.BLUE, true, 36));
        kit.add(new Marker("A Proff marker", Stationery.Color.GREEN, 15, 70));
        kit.add(new Stapler("A Citizen stapler", Stationery.Color.BLACK, 240));

        return kit;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {

        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}

abstract class WorkWithDocuments extends Stationery {}


abstract class Editing extends Stationery {

    // Some erasers don't work with ink
    private boolean isInkCompatible;

    public boolean isInkCompatible() {
        return isInkCompatible;
    }

    public void setInkCompatible(boolean inkCompatible) {
        isInkCompatible = inkCompatible;
    }

}

abstract class Writing extends Stationery {

    private int length; // in centimeters

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}





