package com.sdl.scoreCardGame;

public class ScoreBoard {

    //Every score board has no entries at initial
    private int entriesNum = 0;

    //An array of entries that contain player name and score.
    private GameEntry[] entryBoard;


    //Create a new scoreboard with capacity
    public ScoreBoard(int capacity) {
        entryBoard = new GameEntry[capacity];
    }

    //This method attempt to add a new score to the collection
    public void addScore(GameEntry entry){
        int newScore = entry.getScore();

        //How will know if the new entry is really a high entry?
        if(entriesNum < entryBoard.length || newScore > entryBoard[entriesNum -1].getScore()){
            //The entry number might be less than the board but the score will be less than the highest score in the game
            if(entriesNum < entryBoard.length){
                entriesNum++;
            }

            //Shift any lower score on the board rightwards to make room for the new entry
            int highestBoardScore = entriesNum - 1;
            while (highestBoardScore > 0 && entryBoard[highestBoardScore - 1].getScore() < newScore){
                //Shift the entry from highest boardscore - 1 to higestboard score
                entryBoard[highestBoardScore] = entryBoard[highestBoardScore - 1];
                //Decrement and keep moving backward
                highestBoardScore --;
            }
            //When the highestboardscore is not less than new score set to the newscore
            entryBoard[highestBoardScore] = entry;
        }
    }

    public GameEntry remove(int entryAtIndex){
        if(entryAtIndex < 0 || entryAtIndex >= entriesNum)
            throw new ArrayIndexOutOfBoundsException("Invalid index "+ entryAtIndex);

        GameEntry tempEntry = entryBoard[entryAtIndex];  //We'll use this guy to save the object to be removed.
        for (int loopIndex = entryAtIndex; loopIndex < entriesNum -1 ; loopIndex++){
            entryBoard[loopIndex] = entryBoard[loopIndex + 1]; //Move the highest score upward and
        }
        entryBoard[entriesNum - 1] = null;
        entriesNum--;
        return tempEntry;

    }

}
