public class Player {
    private int playerX=1, playerY=1;

    public void resetPosition(char[][] currentMap){
        currentMap[playerY][playerX]=' ';
        playerX = 1; playerY = 1;
        currentMap[1][1]='P';
    }

    public boolean move(String move, char[][] currentMap){
        
        int newX=playerX, newY=playerY;
        switch(move){
            case ("W"): newY--; break;
            case ("A"): newX--; break;
            case ("S"): newY++; break;
            case ("D"): newX++; break;
            default: return false;
        }

        if (currentMap[newY][newX]=='#'){return false;}
        if(currentMap[newY][newX]=='E'){return true;}

        currentMap[playerY][playerX]=' ';
        currentMap[newY][newX]='P';
        playerX=newX; playerY=newY;
        return false;
        }

}