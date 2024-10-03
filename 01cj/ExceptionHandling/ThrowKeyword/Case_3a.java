public class Case_3a extends RuntimeException{
    public static void main(String[] args) {
        throw new Case_3a();
    }
}

//Exception in thread "main" Case_3a
//at Case_3a.main(Case_3a.java:3)

//name of the exception(no compile time error runtimeexception)
//we should use throw keyword only for throwable types if we use for non throwable type we get compile time error