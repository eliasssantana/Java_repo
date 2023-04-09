public class TypeConversion {
    String a = "1";
    String b = "2";

    String result= a + b;

    public String concatStrings(String letraA, String letraB){
        if (letraA == null && letraB == null){
            letraA = a;
            letraB = b;
        }
        return a + b;
    }

}
