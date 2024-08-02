/**
 * GenericTraining
 */
class GenericTraining<GT> {
    private GT value;
    private GT value2;

    public void setValue(GT value,GT value2){
        this.value = value;
        this.value2 = value2;
    }

    public GT getValue(){
        return this.value;
    }

    public GT getValue2(){
        return this.value2;
    }
}


public class Generics {
    
    public static void main(String[] args) {
        GenericTraining<Integer> GTS = new GenericTraining<>();
        GTS.setValue(10, 20);
        System.out.println(GTS.getValue()+GTS.getValue2());

        GenericTraining<String> GTS2 = new GenericTraining<>();
        GTS2.setValue("ddd", "eeeffs");
        System.out.println(GTS2.getValue()+GTS2.getValue2());

    }

}
