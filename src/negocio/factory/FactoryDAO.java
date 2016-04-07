package negocio.factory;

import negocio.medico.impl.MedicoDAOFileImpl;
import negocio.medico.spec.MedicoDAO;

public abstract class FactoryDAO {

    public static final int FILE = 1;
    
    public static MedicoDAO getMedicoFactory(int valor){
        switch(valor){
            case FILE:
                return new MedicoDAOFileImpl();
            default:
                throw new IllegalArgumentException();
        }
    }

    
    
}