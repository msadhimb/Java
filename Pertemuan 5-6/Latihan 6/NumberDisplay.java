public class NumberDisplay {
    //atribute atau properti atau variabel
    private int limit;
    private int value;

    //method konstruktor
    public NumberDisplay(int rollOverLimit){
        limit = rollOverLimit;
        value = 0;
    }

    //method biasa
    public int getValue(){
        return value;
    }
    public void setValue(int replacementValue){
        if(replacementValue >= 0 && replacementValue < limit){
            value = replacementValue;
        }
    }
    public String getDisplayValue(){
        if(value < 10){
            return "0" + value;
        }else{
            return "" + value;
        }
    }
    public void increment(){
        value += 1 % limit;
        //value, kasus jam 12, lalu increment
        //limit = 12
        //value = (12+12)%12
        //value = 1
    }
}
