import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main implements Spec{
    

    private Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        //Main I = new Main();
        //String name = I.askString("What is thyself name");
        //int height = I.askNumber("What is your height (in cm), good lad.");
        //int age = I.askNumber("How old are ye laddie");

        //Player[] p = new Player[]{
            //new Player(name, height, age)
        //};

        Game g = new Game();
        g.climbStairs(5, 5, 50, 0, 1);
        g.createPlayersFromCSV();
        g.printAllPlayers();
        System.out.println("Are we getting a reading?");
    }

    // methods\
    public Scanner getScanner(){
        return s;
    }


    @Override
    public String askString(String question){
        System.out.println(question);
        return getScanner().nextLine();
    }
    @Override
    public int askNumber(String question){
        System.out.println(question);
        return getScanner().nextInt();
    }
    @Override
    public Person makePerson(String name){
        return new Player(name, 500, 10);
    }
    @Override
    public void addResults(Person player){
        player.setResults(new Test("A result...?"));
    }
    @Override
    public Results getResults(Game g){
        return g.getT();
    }
        
}