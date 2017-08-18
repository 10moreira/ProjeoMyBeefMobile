package mateusmoreira.appmybeefbeta;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText3nomelogin, editText4senha;
    Button button3Login, buttonCriaLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        editText3nomelogin = (EditText) findViewById(R.id.editText3nomelogin);
        editText4senha = (EditText) findViewById(R.id.editText9senha);

        button3Login = (Button) findViewById(R.id.button3Login);
        buttonCriaLogin = (Button) findViewById(R.id.buttonCriaLogin);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
    }

    public void abrirCriarLogin(View v){

        startActivity(new Intent(getBaseContext(), UsuarioActivity.class));
    }

    public void abrirLogin(View v) {

        if (editText3nomelogin.getText().toString().length() <= 0) {
            Toast.makeText(getApplication(), "Não deixe seu login em branco!!", Toast.LENGTH_LONG).show();
            editText3nomelogin.requestFocus();
        }
    }



/*
    public void  clickVerificaLogin(View v){

        editText3nomelogin = (EditText) findViewById(R.id.editText3nomelogin);
        editText4senha = (EditText) findViewById(R.id.editText9senha);

        if(editText3nomelogin.getText().toString().length()<=0){
            editText3nomelogin.setError("Informe o seu login!!");
            editText3nomelogin.requestFocus();

        }else if(editText4senha.getText().toString().length() <=0){
            editText4senha.setError("Preencha o campo com sua senha!!");
            editText4senha.requestFocus();
        }else{
            SQLiteDatabase db = openOrCreateDatabase("DBappMyBeef.sqlite", Context.MODE_PRIVATE, null);
            StringBuilder sqlUsuario = new StringBuilder();

            sqlUsuario.append("SELECT conut(*) FROM usuario WHERE nome='" + editText3nomelogin + "' AND senha='" + editText4senha + "';");

            db.execSQL(sqlUsuario.toString());

            if(){

            }else{

            }
            startActivity(new Intent(this, SimulacaoActivity.class));

        }
    }
*/
    @Override
    public void onClick(View v) {


    }
}
