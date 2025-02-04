import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Game {


    //PROPERTIES-------------------
    private Test t = new Test("The game has not started yet.");
    private char[][] s;
    private Player[] p;
    private File f = new File("C:\\Github\\recording-results-ChanakyaGandla-1\\src\\players.csv");



    //CONSTRUCTORS

    public Game(){
        
    }
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Game(Player[] p){
        this.p = p;

        String names = "";
        for(int i = 0; i < p.length; i++){
            names = names + p[i].getName() + " " + p[i].getHeight();
        }

        setT(new Test(names));
        System.out.println(getT().getResult());

    }


    //METHODSS
    public Scanner getScan() throws FileNotFoundException{
        return new Scanner(f);
    }


    public Test getT() {
        return t;
    }

    public void setT(Test t) {
        this.t = t;
    }

    public void createStairs(int size){
        for (int y = 0; y < size; y++){
            for (int x = 0; x < size; x++){
                setSPos(x, y, ' ');
            }
        }
    }

    public void drawLine(int x, int y, int len, char s, int d){
        int[][] dir = new int[][]{
            {1,0}, // right
            {0,1}, // up
            {-1,0}, // left
            {0,-1} // down
        };     

        for (int i = 0; i < len; i++){
            setSPos(x+dir[d][0]*i, y+dir[d][1]*i, s);
        }
    }

    public void printStairs(){
        for(int y = 0; y < getS().length; y++){
            for(int x = 0; x < getS().length; x++){
                System.out.print(getS()[y][x]);
            }
            System.out.println();
        }
    }
    public char[][] getS() {
        return s;
    }

    public void setS(char[][] s) {
        this.s = s;
    }
    public void setSPos(int x, int y, char set){
        this.s[y][x] = set;
    }
    public void climbStairs(int steps, int longg, int size, int dir1, int dir2){
        int[][] dir = new int[][]{
            {1,0}, // right
            {0,1}, // up
            {-1,0}, // left
            {0,-1} // down
        };  
        // sets all indicies of the stairs array to something.
        s = new char    [size][size];
        createStairs(size);

        int drawX = 0;
        int drawY = 0;

        for (int i = 0; i < steps; i++){
            drawLine(drawX, drawY, longg, 'O', dir1);
            drawX = drawX + longg*dir[dir1][0];
            drawY = drawY + longg*dir[dir1][1];
            drawLine(drawX, drawY, longg, 'I', dir2);
            drawX = drawX + longg*dir[dir2][0];
            drawY = drawY + longg*dir[dir2][1];
        }
        printStairs();
    }
    public Player[] createPlayersFromCSV() throws FileNotFoundException {
        Scanner s = getScan();
        int lines = 0;
        while (s.hasNextLine()) {
            lines++;
            s.nextLine();
            
        }
        s.reset();
        Player[] j = new Player[lines];
        int num = 0;
        while(s.hasNextLine()){
            String[] z = s.nextLine().split(" ");
            j[num] = new Player(z[0], Integer.parseInt(z[1]), Integer.parseInt(z[2]));
            num++;
        }
        return j;
    }

    public void printAllPlayers() {
        for(int i = 0; i < this.p.length; i++){
            System.out.println(this.p[i].getName());
            System.out.println(this.p[i].getAge());
            System.out.println(this.p[i].getHeight());
        }
    }
}
