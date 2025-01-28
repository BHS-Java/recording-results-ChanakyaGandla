public class Test implements Results{
    //PROPERTIES --------------------
    private String result = "I havent taken this test yet.";
    //CONSTRUCTOR --------------------
    public Test(){

    }
    public Test(String result){
        this.result = result;
    }

    @Override
    public String getResult(){
        return this.result;
    }

    @Override
    public void setResult(String newResult){
        this.result = newResult;
    }
    //METHODS ---------------------
}
