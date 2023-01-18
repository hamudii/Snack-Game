package project.projectSnake;

import java.util.ArrayList;

import javafx.scene.paint.Color;

public class Snake {
    private int snakeLength = 5;

    private ArrayList<Block> body = new ArrayList<Block>();
    private Block head;
    private Block tail;
    private GameField gameField;
    private Direction direction = Direction.UP;

    public Snake(GameField gameField) {
        this.gameField = gameField;
        int startX = gameField.getW() / 2;
        int startY = gameField.getH() / 2;

        head = new Block(startX, startY, this.gameField, null);
        head.setFill(Color.RED);
        head.setStroke(Color.GOLD);
        body.add(head);

        tail = head;

        //add tail
        for(int i = 1; i < snakeLength; i++){
            Block newTail = new Block(startX, startY+i, gameField, tail);
            newTail.setFill(Color.WHITESMOKE);
            head.setStroke(Color.GOLD);
            body.add(newTail);
            tail = newTail;
        }
    }

    public ArrayList<Block> getBody() {
        return body;
    }

    public Block getHead() {
        return head;
    }

    public Block getTail() {
        return tail;
    }

    public void setHead(Block head) {
        this.head = head;
    }

    public void setTail(Block tail) {
        this.tail = tail;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

}
