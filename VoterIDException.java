package Nov18.CreatingException;

public class VoterIDException extends Exception {
    String msg;

    VoterIDException(){
        
    }

    VoterIDException(String msg){
        super(msg);
    }

}
