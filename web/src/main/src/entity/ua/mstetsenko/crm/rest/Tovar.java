package entity.ua.mstetsenko.crm.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.mstetsenko.crm.dao.TovarDao;
import ua.test.HW;

import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: max
 * Date: 24.10.13
 */

@Controller
@RequestMapping("/tovar")
public class Tovar {

    @Autowired
    private TovarDao tovarDao;



    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    @Produces("text/xml;charset=utf-8")
    public Response getNoticeInfosByMarketIdVersion1SubVersion0(Map<String, String> input
    ) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HW test = new HW();

        return Response.status(200).entity(tovarDao.findTovarList()).build();

    }
}
