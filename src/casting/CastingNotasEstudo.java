package casting;
/*
 * Casting: Operação de transformar um tipo de dados em outro
 * Widening Casting vs Narrowing Casting
 */
public class CastingNotasEstudo {
    
    public static void main(String[] args) {
        //Widening Castring (Implícito)
       byte variavelPequena = 1;
       int variavelGrande = variavelPequena;

       short variavelShort = 10;
       int variavelInt = variavelShort;

       System.out.println(variavelGrande);
       System.out.println(variavelInt);

    }
}
