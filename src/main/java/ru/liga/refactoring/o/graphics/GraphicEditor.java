package ru.liga.refactoring.o.graphics;

import ru.liga.refactoring.o.domain.Circle;
import ru.liga.refactoring.o.domain.Rectangle;
import ru.liga.refactoring.o.domain.Shape;

public class GraphicEditor{
    public GraphicEditor() {
        // Конструктор
    }

    public void drawCircle(Circle c){
        System.out.println("Circle");
    }

    public void drawRectangle(Rectangle r){
        System.out.println("Rectangle");
    }

    public void drawShape(Shape s) {
        if(s.getType() == 1){
            this.drawRectangle((Rectangle) s);
        }
        else if(s.getType() == 2){
            this.drawCircle((Circle) s);
        }
    }
}