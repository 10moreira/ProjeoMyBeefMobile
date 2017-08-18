package Daos;

/**
 * Created by mateus on 14/08/17.
 */
public class DataModelPropriedade {

    private static final String DB_NAME = "DBappMyBeef.sqlite";
    private static final String TABELA_PROPRIEDADE = "propriedade";
    private static final String ID = "id";
    private static final String NOMEPROPRIEDADE = "nomepropriedade";
    private static final String LOCALIDADE = "localidade";
    private static final String PAIS = "pais";
    private static final String CIDADE = "cidade";
    private static final String TIPOPROPRIEDADE = "tipopropriedade";
    private static final String DATASIMULACAO = "datasimulacao";
    private static final String TIPO_TEXTO = "TEXT";
    private static final String TIPO_INTEIRO = "INTEGER";
    private static final String TIPO_INTEIRO_PK = "INTEGER PRIMARY KEY";


    public static String criaTabelaPropriedade(){
        String query = "CREATE TABLE " + TABELA_PROPRIEDADE;
        query += " (";
        query += ID + " " + TIPO_INTEIRO_PK + ", ";
        query += NOMEPROPRIEDADE + " " + TIPO_TEXTO + ", ";
        query += LOCALIDADE + " " + TIPO_TEXTO + ", ";
        query += PAIS + " " + TIPO_TEXTO + ", ";
        query += CIDADE + " " + TIPO_TEXTO + ", ";
        query += TIPOPROPRIEDADE + " " + TIPO_TEXTO + ", ";
        query += DATASIMULACAO + " " + TIPO_TEXTO + " ";
        query += ")";

        return query;
    }

    public static String getDbName() {
        return DB_NAME;
    }

    public static String getTabelaPropriedade() {
        return TABELA_PROPRIEDADE;
    }

    public static String getID() {
        return ID;
    }

    public static String getNOMEPROPRIEDADE() {
        return NOMEPROPRIEDADE;
    }

    public static String getLOCALIDADE() {
        return LOCALIDADE;
    }

    public static String getPAIS() {
        return PAIS;
    }

    public static String getCIDADE() {
        return CIDADE;
    }

    public static String getTIPOPROPRIEDADE() {
        return TIPOPROPRIEDADE;
    }

    public static String getDATASIMULACAO() {
        return DATASIMULACAO;
    }
}
