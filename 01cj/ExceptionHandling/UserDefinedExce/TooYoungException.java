 class  TooYoungException extends RuntimeException{
    TooYoungException(String msg)       //defining constructor to pass any message provide some description
    {
        super(msg);                     
    }
}



//every exception should be child class of throwable it should extend throwable class
//can also use default constructor if no decription or message is passed at runtime
