package br.usjt.deswebmob.aulaactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declaraçao do botao que ira chamar outra Activitie
    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getApplicationContext(), "onCreate Metodo Chamado MainActivity",Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_main);
        //Fazendo cast do Botao para findByViewId
        botao = (Button) findViewById(R.id.botaoId);
        //Adicionando Açao para o botao ser Utilizado
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Para navegar entre as Activities chamamos o startActivitie
                //Primeiro Instanciamos um novo Intent(), depois os parametros que nesse caso serao
                //As Classes , Primeiro a classe em que estamos depois a Classe que queremos ir
                //Portanto passaremos a MainActivities com um this,
                //Depois passamos a Classe que iremos chamar a SegundaActivity com um Class
                startActivity(new Intent(MainActivity.this, SegundaActivity.class));
            }
        });


    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart Metodo Chamado MainActivity",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop Metodo Chamado MainActivity",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestroy Metodo Chamado MainActivity",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause Metodo Chamado MainActivity",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "onResume Metodo Chamado MainActivity",Toast.LENGTH_SHORT).show();
    }

}
