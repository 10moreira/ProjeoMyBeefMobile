package Daos;

import android.content.ContentValues;
import android.content.Context;

import Domain.Usuario;

/**
 * Created by mateus on 08/08/17.
 */
public class UsuarioDAO {

    DataSourceUsuario ds;
    ContentValues values;


    public UsuarioDAO(Context context) {

            ds = new DataSourceUsuario(context);

    }



    public boolean salvarUsuario(Usuario obj){

      boolean retorno = false;

        values = new ContentValues();

        values.put(DataModelUsuario.getNOME(), obj.getNome());
        values.put(DataModelUsuario.getEMAIL(), obj.getEmail());
        values.put(DataModelUsuario.getTELEFONE(), obj.getTelefone());
        values.put(DataModelUsuario.getSENHA(), obj.getSenha());
        values.put(DataModelUsuario.getPERFIL(), obj.getPerfil());

        try{
            ds.persist(values, DataModelUsuario.getTabelaUsuario());
            retorno = true;
        }catch (Exception e){

        }
        return retorno;
    }

}
