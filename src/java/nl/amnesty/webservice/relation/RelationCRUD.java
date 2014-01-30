/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.amnesty.webservice.relation;

import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import nl.amnesty.crm.entity.Person;
import nl.amnesty.crm.entity.Relation;
import nl.amnesty.crm.entity.Relationtype;

/**
 *
 * @author ed
 * algemene webservices uitgezet uit beveiligingsoogpunt
 */
@WebService()
@Stateless()
public class RelationCRUD {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "dummy")
    public String dummy() {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     
    @WebMethod(operationName = "create")
    public long create(@WebParam(name = "Personfrom") Person personfrom,
            @WebParam(name = "Personto") Person personto,
            @WebParam(name = "Relationtype") Relationtype relationtype) {
        //TODO write your implementation code here:
        long relationid = 123456789;
        return relationid;
    }
    */

    /**
     * Web service operation
     
    @WebMethod(operationName = "read")
    public Relationtype read(@WebParam(name = "Relationid") long relationid) {
        //TODO write your implementation code here:
        Relation relation = new Relation();
        Person personfrom = new Person();
        relation.setPersonfrom(personfrom);
        Person personto = new Person();
        relation.setPersonto(personto);
        Relationtype relationtype = new Relationtype();
        relation.setRelationtype(relationtype);
        return relationtype;
    }
    */

    /**
     * Web service operation
     
    @WebMethod(operationName = "update")
    public long update(@WebParam(name = "Relationid") long relationid,
            @WebParam(name = "Personfrom") Person personfrom,
            @WebParam(name = "Personto") Person personto,
            @WebParam(name = "Relationtype") Relationtype relationtype) {
        //TODO write your implementation code here:
        return relationid;
    }
    */

    /**
     * Web service operation
     
    @WebMethod(operationName = "delete")
    public long delete(@WebParam(name = "Relationid") long relationid) {
        //TODO write your implementation code here:
        return relationid;
    }
    */
}
