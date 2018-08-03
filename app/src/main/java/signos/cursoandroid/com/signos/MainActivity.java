package signos.cursoandroid.com.signos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listaSignos;
    private String[] signos = {"Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário", "Capricórnio", "Aquário", "Peixes"};
    private String[] perfis = {"Ariano", "Taurino", "Geminiano", "Canceriano", "Leonino", "Virginiano", "Libriano", "Escorpionino", "Sagitariano", "Capricorniano", "Aquariano", "Peixiniano"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = (ListView) findViewById(R.id.listaSignosId);

        final ArrayAdapter<String> adaptadorSigno = new ArrayAdapter<>(getApplication(), android.R.layout.simple_list_item_1, android.R.id.text1, signos);
        listaSignos.setAdapter(adaptadorSigno);

        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ArrayAdapter<String> adaptadorPerfil = new ArrayAdapter<>(getApplication(), android.R.layout.simple_list_item_1, android.R.id.text1, perfis);
                int posicao = i;
                String perfil = adaptadorPerfil.getItem(posicao);
                Toast.makeText(getApplicationContext(), perfil, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    public void recreate() {
        super.recreate();
    }

    @Override
    public void finish() {
        super.finish();
    }
}
