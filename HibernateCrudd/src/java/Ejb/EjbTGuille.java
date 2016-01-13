/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejb;

import Dao.DaoGuille;
import Model.Guille;
import static java.lang.System.out;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author william.calisaya
 */
@Stateless
public class EjbTGuille {

    private Guille guille;
    private List<Guille> listaGuille;
    private final DaoGuille daoTGuille;
    
    public EjbTGuille()
    {
        guille = new Guille();
        daoTGuille = new DaoGuille();
    }
    public boolean insert()
    {
        try 
        {
            daoTGuille.insert(guille);
            return true;
        } 
        catch (Exception ex) 
        {
            out.println(ex.getMessage());
            return false;
        }
    }

    public Guille getGuille() {
        return guille;
    }

    public void setGuille(Guille guille) {
        this.guille = guille;
    }

    public List<Guille> getListaGuille() {
        return listaGuille;
    }

    public void setListaGuille(List<Guille> listaGuille) {
        this.listaGuille = listaGuille;
    }
    
}
