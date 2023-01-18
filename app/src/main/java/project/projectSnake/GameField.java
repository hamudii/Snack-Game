package project.projectSnake;

import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import java.util.ArrayList;


public class GameField extends Pane{
    private int width;
    private int height;
    private Food food;
    ArrayList<Block> blocks = new ArrayList<Block>();
    Snake snake;
    Score score;

    public GameField(int width, int height){
        this.width = width;
        this.height = height;
        setMinSize(width * Block.blockSize, height * Block.blockSize);
        setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));
        setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, new BorderWidths(1))));
        createFood();

        score = new Score();
    }

    public void addBlock(Block block){
        getChildren().add(block);
        blocks.add(block);
    }

    public void addSnake(Snake snake){
        this.snake = snake;
        for(Block blocks : snake.getBody()){
            addBlock(blocks);
        }
    }

    public int getW(){
        return this.width;
    }

    public int getH(){
        return height;
    }

    public void createFood(){
        int randX = (int)(Math.random() * width);
        int randY = (int)(Math.random() * height);

        //check if new food is on snake
        for(Block b : blocks){
            if(b.getX() == randX && b.getY() == randY){
                createFood();
                return;
            }
        }
        
        Food newFood = new Food(randX, randY);
        getChildren().add(newFood);
        getChildren().remove(food);
        food = newFood;
    }
    
    //update gerak tiap blocks
    public void update(){
        for(Block b : blocks){
            b.update(this);
        }
        if(isEaten(food)){
            createFood();
            score.addPoint();
            createTailBlock();
        }
    }

    public void createTailBlock(){
        Block newTail = new Block(snake.getTail().getPrevX(), snake.getTail().getPrevY(), this, snake.getTail());
        newTail.setFill(Color.WHITESMOKE);
        snake.setTail(newTail);
        addBlock(newTail);
    }

    public Snake getSnake(){
        return this.snake;
    }

    public boolean isEaten(Food food){
        if(food == null){
            return false;
        }
        return (snake.getHead().getPosX() == food.getPosX() && snake.getHead().getPosY() == food.getPosY());
    }

    public boolean isGameOver(){
        //out of bounds
        if(snake.getHead().getPosX() < 0 || snake.getHead().getPosX() >= width || snake.getHead().getPosY() < 0 || snake.getHead().getPosY() >= height){
            return true;
        }

        //collide with self
        for(Block b : blocks){
            if(b != snake.getHead() && b.getPosX() == snake.getHead().getPosX() && b.getPosY() == snake.getHead().getPosY()){
                return true;
            }
        }
        
        return false;
    }

    public void reset(Snake snake){
        getChildren().clear();
        blocks.clear();
        this.snake.getBody().clear();
        this.snake = snake;
        addSnake(snake);
        createFood();
        score.resetPoint();;
    }

    public Score getScore(){
        return score;
    }
}
