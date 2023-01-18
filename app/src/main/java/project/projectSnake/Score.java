package project.projectSnake;

import java.io.*;
import java.util.*;

public class Score {
    private Integer point;
    private Integer rank;
    private String name;

    public Score() {
        this.point = 0;
    }

    public Score(Integer rank, Integer point, String name) {
        this.rank = rank;
        this.point = point;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return this.point;
    }

    public void addPoint() {
        this.point++;
    }

    public void resetPoint() {
        this.point = 0;
    }

    public void saveToScoreboard() {
        try {
            // create csv file
            File scoreFile = new File("src/main/resources/scoreboard.csv");
            if (!scoreFile.exists()) {
                try {
                    scoreFile.createNewFile();
                } catch (Exception e) {
                    return;
                }
            }
            // write to csv file
            FileWriter writeFile = new FileWriter(scoreFile, true);
            writeFile.write(this.point + "," + this.name + "\n");
            System.out.println("Score saved to scoreboard");
            writeFile.close();
            // sortScoreboard();
        } catch (Exception e) {
            return;
        }
    }

    public void sortScoreboard() {
        try {
            // read csv file
            File scoreFile = new File("src/main/resources/scoreboard.csv");
            BufferedReader reader = new BufferedReader(new FileReader(scoreFile));
            String line = "";
            String[] tempArr;
            List<Integer> scoreList = new ArrayList<Integer>();
            List<String> nameList = new ArrayList<String>();
            while ((line = reader.readLine()) != null) {
                tempArr = line.split(",");
                scoreList.add(Integer.parseInt(tempArr[0]));
                nameList.add(tempArr[1]);
            }
            reader.close();

            // sort csv file
            for (int i = 0; i < scoreList.size(); i++) {
                for (int j = i + 1; j < scoreList.size(); j++) {
                    if (scoreList.get(i) < scoreList.get(j)) {
                        int tempScore = scoreList.get(i);
                        String tempName = nameList.get(i);
                        scoreList.set(i, scoreList.get(j));
                        nameList.set(i, nameList.get(j));
                        scoreList.set(j, tempScore);
                        nameList.set(j, tempName);
                    }
                }
            }

            // write to csv file
            FileWriter writeFile = new FileWriter(scoreFile);
            for (int i = 0; i < scoreList.size(); i++) {
                writeFile.write(scoreList.get(i) + "," + nameList.get(i) + "\n");
            }
            writeFile.close();
        } catch (Exception e) {
            return;
        }
    }

    public int readScoreBoard(String[] nameArray, String[] pointArray) {
        FileReader readFile = null;
        BufferedReader reader = null;
        sortScoreboard();
        try {
            readFile = new FileReader("src/main/resources/scoreboard.csv");
            reader = new BufferedReader(readFile);

            String line = reader.readLine();
            int i = 0;
            while (line != null) {
                String[] values = line.split(",");
                nameArray[i] = values[1];
                pointArray[i] = values[0];
                i++;
                line = reader.readLine();
            }
            reader.close();
            return i;
        } catch (Exception e) {
            System.out.println("Fail");
            return 0;
        }
    }


}
