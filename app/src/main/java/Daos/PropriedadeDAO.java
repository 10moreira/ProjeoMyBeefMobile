package Daos;

import android.content.ContentValues;
import android.content.Context;

import Domain.Propriedade;

/**
 * Created by mateus on 12/08/17.
 */
public class PropriedadeDAO {

DataSourcePropriedade ds;
ContentValues values;


    public PropriedadeDAO(Context context) {
        ds = new DataSourcePropriedade(context);
    }


    public boolean salvarpropriedade(Propriedade propriedade){

            boolean retorno = false;

        values = new ContentValues();

        values.put(DataModelPropriedade.getNOMEPROPRIEDADE(), propriedade.getNomepropriedade());
        values.put(DataModelPropriedade.getLOCALIDADE(), propriedade.getLocalidade());
        values.put(DataModelPropriedade.getPAIS(), propriedade.getPais());
        values.put(DataModelPropriedade.getCIDADE(), propriedade.getCidade());
        values.put(DataModelPropriedade.getTIPOPROPRIEDADE(), propriedade.getTipoPropriedade());
        values.put(DataModelPropriedade.getDATASIMULACAO(), propriedade.getDatasimulacao());


        try{
            ds.persist(values, DataModelPropriedade.getTabelaPropriedade());
            retorno = true;
        }catch (Exception e){

        }

        return retorno;

    }
}
