/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package her_a.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class ServiceDaoImpl implements ServiceDao {
    private List<Service> data = new ArrayList<Service>();
       
    
    public ServiceDaoImpl() {
        data.add(new Service("AB02","26/01/2023","Rani"));
        data.add(new Service("ZA22","25/01/2023","Kintan"));
    }
    @Override
    public Service save(Service service) {
        data.add(service);
        return service;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Service update(int index, Service service) {
        data.set(index, service);
        return service;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int index) {
        data.remove(index); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Service getService(int index) {
        return data.get(index); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Service> getAllService() {
        return data; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Service Hitung(int hasil) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
