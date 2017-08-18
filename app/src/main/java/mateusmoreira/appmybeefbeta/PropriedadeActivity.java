package mateusmoreira.appmybeefbeta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import Daos.PropriedadeDAO;
import Domain.Propriedade;

public class PropriedadeActivity extends AppCompatActivity implements View.OnClickListener {


     EditText editTextnomePropriedade, editText10NomeLocalidade, editText5paispropriedade,
             editText8CidadePropriedade, editText9TipoPropriedade, editText5data;
     Button button6Enviar, button7Cancelar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_propriedade);

        editTextnomePropriedade = (EditText) findViewById(R.id.editTextnomePropriedade);
        editText10NomeLocalidade = (EditText) findViewById(R.id.editText10NomeLocalidade);
        editText5paispropriedade = (EditText) findViewById(R.id.editText5paispropriedade);
        editText8CidadePropriedade = (EditText) findViewById(R.id.editText8CidadePropriedade);
        editText9TipoPropriedade = (EditText) findViewById(R.id.editText9TipoPropriedade);
        editText5data = (EditText) findViewById(R.id.editText5data);

        button6Enviar = (Button) findViewById(R.id.button6Enviar);
        button7Cancelar = (Button) findViewById(R.id.button7Cancelar);

        button6Enviar.setOnClickListener(this);
        button7Cancelar.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.button6Enviar:
                Propriedade propriedade =  new Propriedade();
                propriedade.setNomepropriedade(editTextnomePropriedade.getText().toString());
                propriedade.setLocalidade(editText10NomeLocalidade.getText().toString());
                propriedade.setPais(editText5paispropriedade.getText().toString());
                propriedade.setCidade(editText8CidadePropriedade.getText().toString());
                propriedade.setTipoPropriedade(editText9TipoPropriedade.getText().toString());
                propriedade.setDatasimulacao(editText5data.getText().toString());

                PropriedadeDAO dao = new PropriedadeDAO(getApplicationContext());

                if(dao.salvarpropriedade(propriedade)){
                    Toast.makeText(getApplication(), "Propriedade cadastrada com sucesso!!", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(this, SimulacaoActivity.class));
                    finish();
                }else{
                    Toast.makeText(getApplication(), "Erro ao gravar Propriedade", Toast.LENGTH_LONG).show();
                }

                break;

            case R.id.button7Cancelar:
                break;


        }

    }
}


