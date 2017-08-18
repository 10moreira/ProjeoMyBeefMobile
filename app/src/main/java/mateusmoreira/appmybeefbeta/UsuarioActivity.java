package mateusmoreira.appmybeefbeta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import Daos.UsuarioDAO;
import Domain.Usuario;

public class UsuarioActivity extends AppCompatActivity implements View.OnClickListener{


        EditText editTextnomeUsuario, editTextemail, editText7Telefone, editText9senha, editTextPerfilprodutor;
        Button buttonEnviar, buttonCancelar;
        Usuario usuario, altusuario;


        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_usuario);
            //Invocando spinner no fragment com array de string.
            //    View v = inflater.inflate(R.layout.fragment_activity_crialogin, container, false);

            editTextnomeUsuario = (EditText) findViewById(R.id.editTextnomeUsuario);
            editTextemail = (EditText) findViewById(R.id.editTextemail);
            editText7Telefone = (EditText) findViewById(R.id.editText7Telefone);
            editText9senha = (EditText) findViewById(R.id.editText9senha);
            editTextPerfilprodutor = (EditText) findViewById(R.id.editTextPerfilprodutor);
            buttonCancelar = (Button) findViewById(R.id.buttonCancelar);

            buttonEnviar = (Button) findViewById(R.id.buttonEnviar);



            buttonCancelar.setOnClickListener(this);

            buttonEnviar.setOnClickListener(this);



          }


    @Override
    public void onClick(View v) {
            switch (v.getId()){
                case R.id.buttonEnviar:

                    Usuario usuario = new Usuario();

                    usuario.setNome(editTextnomeUsuario.getText().toString());
                    usuario.setEmail(editTextemail.getText().toString());
                    usuario.setTelefone(editText7Telefone.getText().toString());
                    usuario.setSenha(editText9senha.getText().toString());
                    usuario.setPerfil(editTextPerfilprodutor.getText().toString());

                    UsuarioDAO dao = new UsuarioDAO(getApplicationContext());

                    if(dao.salvarUsuario(usuario)){
                        Toast.makeText(getApplication(), "Dados cadastrados com sucesso", Toast.LENGTH_LONG).show();

                        startActivity(new Intent(this, SimulacaoActivity.class));
                      //  Intent dashboard = new Intent(UsuarioActivity.this, SimulacaoActivity.class);
                        finish();
                    }else{
                        Toast.makeText(getApplication(), "Erro ao gravar os dados no Banco de dados", Toast.LENGTH_LONG).show();
                    }

                    break;

                case R.id.button7Cancelar:

                    break;

            }
    }


    private void alert(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

    //Botão cancelar.
    public void limparCampos() {


    }

}

