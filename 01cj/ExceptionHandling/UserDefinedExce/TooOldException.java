public class TooOldException extends RuntimeException {
    TooOldException(String msg){
        super(msg);
    }
}



//to make our description available to default exception handler -super keyword

//RuntimmeEXception - unchecked exceptions-handling try catch or throws keyword is not required
// Exception - Unhandled exception type TooOldException no need to use throw keyword
