package project.projectSnake;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Food extends Rectangle{
    private int x;
    private int y;
    static int foodSize = Block.blockSize;
    private Color foodColor;

    public Food(int x, int y) {
        super(foodSize, foodSize);
        this.x = x;
        this.y = y;

        setTranslateX(this.x * foodSize); 
        setTranslateY(this.y * foodSize);

        //create new random color
        setRandomColor();
        //set color to foodColor
        setFill(foodColor);
    }

    public void setRandomColor() {
        Color newRandomColor = Color.color(Math.random(), Math.random(), Math.random());
        if(newRandomColor == Color.BLACK){
            setRandomColor();
        } else {
            foodColor = newRandomColor;
        }
    }

    public int getPosX() {
        return this.x;
    }

    public int getPosY() {
        return this.y;
    }

}
