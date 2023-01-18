package project.projectSnake;

import javafx.scene.shape.Rectangle;

public class Block extends Rectangle{
    static int blockSize = 5;
    private int x;
    private int y;
    private int prevX;
    private int prevY;
    private Block previous;

    public Block(int x, int y, GameField gameField, Block prev){
        super(blockSize, blockSize);
        this.x = x;
        this.y = y;

        setTranslateX(x * blockSize);
        setTranslateY(y * blockSize);
        previous = prev;
    }

    public int getPosX() {
        return this.x;
    }

    public int getPosY() {
        return this.y;
    }

    public int getPrevX() {
        return this.prevX;
    }

    public int getPrevY() {
        return this.prevY;
    }
    
    public void moveUp() {
        y--;
    }

    public void moveDown() {
        y++;
    }

    public void moveRight() {
        x++;
    }

    public void moveLeft() {
        x--;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void update(GameField gameField){
        prevX = x;
        prevY = y;
        if (previous == null) {
            switch (gameField.snake.getDirection()) {
            case UP:
                moveUp();
                break;
            case DOWN:
                moveDown();
                break;
            case RIGHT:
                moveRight();
                break;
            case LEFT:
                moveLeft();
                break;
            }
        } else {
            x = previous.prevX;
            y = previous.prevY;
        }
        setTranslateX(x * blockSize);
        setTranslateY(y * blockSize);
    }


}
