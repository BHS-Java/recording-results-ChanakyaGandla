
import java.util.Scanner;
public class Main implements Spec{
    
    public static void main(String[] args) {

    }

    // methods\
    public Scanner getScanner(){
        return new Scanner(System.in);
    }


    @Override
    public String askString(String question){
        return question;
    }
    @Override
    public int askNumber(String question){
        return 1;
    }
    @Override
    public Person makePerson(String name){
        return new Player(name, 500, 10);
    }
    @Override
    public void addResults(Person player){
        player
    }

    public Results getResults(Game g){
        
    } 
}