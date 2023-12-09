
public class Tema2 {
    public static void main(String[] args) {
        char miCaracter = 'a';
        System.out.println("miCaracter = "+miCaracter);
        char varChar='\u0021';
        System.out.println("varChar = " + varChar);
        char varCharUnicode= '!';
        System.out.println("varCharUnicode = " + varCharUnicode);
        char varCharDecimal= 33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        var varChar1= '\u0021';
        System.out.println("varChar1 = " + varChar1);
        var varCharDecimal1= 33;
        System.out.println("varCharDecimal1 = " + varCharDecimal1);
        var varCharDecimal2= "33";//se imprime en forma de string(ver debug)
        System.out.println("varCharDecimal2 = " + varCharDecimal2);
        var varCharUnicode1= '!';
        System.out.println("varCharUnicode1 = " + varCharUnicode);
        int variableEnteraSigno= '!';//muestra el codigo ASCII
        System.out.println("variableEnteraSigno = " + variableEnteraSigno);
    }
}
