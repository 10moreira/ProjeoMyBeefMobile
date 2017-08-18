package Daos;

/**
 * Created by mateus on 14/08/17.
 */
public class DataModelUsuario {

    private static final String DB_NAME = "DBappMyBeef.sqlite";
    private static final String TABELA_USUARIO = "usuario";
    private static final String ID = "id";
    private static final String NOME = "nome";
    private static final String EMAIL = "email";
    private static final String TELEFONE = "telefone";
    private static final String SENHA = "senha";
    private static final String PERFIL = "perfil";
    private static final String TIPO_TEXTO = "TEXT";
    private static final String TIPO_INTEIRO = "INTEGER";
    private static final String TIPO_INTEIRO_PK = "INTEGER PRIMARY KEY";


    public static String criarTabelaUsuario(){
        String query = "CREATE TABLE " + TABELA_USUARIO;
            query += " (";
            query += ID + " " + TIPO_INTEIRO_PK + ", ";
            query += NOME + " " + TIPO_TEXTO + ", ";
            query += EMAIL + " " + TIPO_TEXTO + ", ";
            query += TELEFONE + " " + TIPO_TEXTO + ", ";
            query += SENHA + " " + TIPO_TEXTO + ", ";
            query += PERFIL + " " + TIPO_TEXTO + " ";
            query += ")";

        return query;
    }

/*
    public static String validaLogin(){

        String query = "SELECT * FROM " + TABELA_USUARIO + "WHERE" + NOME + "= ? AND " + SENHA + "= ?";

        return query;
    }

*/

    public static String getDbName() {
        return DB_NAME;
    }

    public static String getTabelaUsuario() {
        return TABELA_USUARIO;
    }

    public static String getID() {
        return ID;
    }

    public static String getNOME() {
        return NOME;
    }

    public static String getEMAIL() {
        return EMAIL;
    }

    public static String getTELEFONE() {
        return TELEFONE;
    }

    public static String getSENHA() {
        return SENHA;
    }

    public static String getPERFIL() {
        return PERFIL;
    }
}
