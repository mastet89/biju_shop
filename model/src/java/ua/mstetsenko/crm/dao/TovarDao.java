package ua.mstetsenko.crm.dao;

import ua.mstetsenko.crm.model.Tovar;

import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: max
 * Date: 24.10.13
 */

public class TovarDao {


    public List<Tovar> findTovarList(){

        List<Tovar> tovarList = new LinkedList<Tovar>();
        for(int i=0; i<5; i++){
            tovarList.add(createNewTovar());
        }
        return tovarList;
    }

    private Tovar createNewTovar (){
        Tovar tovar = new Tovar();
        tovar.setId((long)tovar.hashCode());
        tovar.setName("Tovar Name ");
        tovar.setPrice((double) (1));
        return tovar;
    }

}
