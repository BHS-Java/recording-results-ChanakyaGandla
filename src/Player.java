public class Player implements Person{
    //PROPERTIES ------------------------
    private String name = "Bobert";
    private int height = 6 + 2/12;
    private int age = 17;
    private Test mathTest = new Test("I aced it!");
    //CONSTRUCTOR ------------------------
    public Player(String name, int height, int age){
        this.name = name;
        this.height = height;
        this.age = age;
    }

    //METHODS ------------------------

    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public int getHeight(){
        return this.height;
    }
    @Override
    public int getAge(){
        return this.age;
    }
    @Override
    public Results getResults(){
        return this.mathTest;
    }
    public void setResults(Test test){
        this.mathTest = test;
    }
}
