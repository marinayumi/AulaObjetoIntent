package br.com.fiap.exemplodeintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrir(View v){
        Intent it = new Intent(this, OtherActivity.class);

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Marina");
        pessoa.setIdade(19);
        pessoa.setDeficiente(false);

        it.putExtra("pessoa", pessoa);

        // it.putExtra("nome", "Marina");
        //it.putExtra("idade", 19);
        // it.putExtra("deficiente", false);


        startActivity(it);
    }
}
