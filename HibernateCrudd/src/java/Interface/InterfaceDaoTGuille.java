
package Interface;

import Model.Guille;
import java.util.List;

/**
 *
 * @author william.calisaya
 */
public interface InterfaceDaoTGuille {
    public boolean insert(Guille guille) throws Exception;
    public List<Guille> getAll() throws Exception;
    public Guille getById(String id) throws Exception;
    public boolean delete(Guille guille) throws Exception;
    
}
