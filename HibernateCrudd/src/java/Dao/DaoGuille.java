package Dao;

import HibernateUtil.HibernateUtil;
import Interface.InterfaceDaoTGuille;
import Model.Guille;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author william.calisaya
 */
public class DaoGuille implements InterfaceDaoTGuille{

    private Session session;
    
    @Override
    public boolean insert(Guille guille) throws Exception {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(guille);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public List<Guille> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Guille getById(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Guille guille) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
