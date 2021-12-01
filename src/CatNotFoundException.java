import java.util.ArrayList;

public class CatNotFoundException extends RuntimeException{
    static void catNotFoundException() {
        if(new MyCatCafe().catList.isEmpty()){
            throw new CatNotFoundException();
        }
    }
}
