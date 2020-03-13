package ru.liga.oop.l;

/**
 * Created by dzharkov on 13.03.2020.
 */

public class Main {
    static void resize(Rectangle r, int new_width, int new_height){
        r.setWidth(new_width);
        r.setHeight(new_height);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Square s = new Square();
        resize(r,2,3);
        resize(s,2,3);
        System.out.println(r.getArea());
        System.out.println(s.getArea());
    }
}
