/*
package mateusmoreira.appmybeefbeta;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.database.SQLException;

import Domain.Usuario;

/**
 * Created by mateus on 06/08/17.
 */

/*public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String TAG = "usuario";
    private static final String nome_bd = "usuario.sqlite";
    private static final int VERSAO = 1;
    private static DatabaseHelper databasehelper = null;



    public DatabaseHelper(Context context){
            super(context, nome_bd, null, VERSAO);
    }



    public static DatabaseHelper getInstance(Context context){
            if(databasehelper == null){
                    databasehelper = new DatabaseHelper(context);
                        return databasehelper;
            }else{
                return databasehelper;
            }
        }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "create table if not exists usuario" +
                "( _id integer primary key autoincrement, " +
                " nome text, " +
                " email text, " +
                " telefone text, " +
                "senha text"+
                "perfil text);";

        Log.d(TAG, "Criando a usuario contato. Aguarde ...");
        sqLiteDatabase.execSQL(sql);
        Log.d(TAG, "Tabela contatos criada");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

        Log.d("banco", "Upgrade da versão " + oldVersion + " para "
                + newVersion + ", destruindo tudo.");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS usuario");
        onCreate(sqLiteDatabase); // chama onCreate e recria o banco de dados
        Log.i("banco", "Executou o script de upgrade da tabela usuario.");
    }

    public long SalvarUsuario(Usuario usuario){

        SQLiteDatabase db = getWritableDatabase();

        try {

            ContentValues values = new ContentValues();
            values.put("nome", usuario.nome);
            values.put("email", usuario.email);
            values.put("telefone", usuario.telefone);
            values.put("senha", usuario.senha);
            values.put("perfil", usuario.perfil);

            if(usuario._id == null){
                return db.insert("usuario", null, values);
            }else {
                values.put("_id", usuario._id);
                return db.update("usuario", values, "_id=" + usuario._id, null);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            db.close();
        }
            return 0;
        }




}
*/