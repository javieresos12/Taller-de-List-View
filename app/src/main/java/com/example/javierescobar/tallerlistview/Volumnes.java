package com.example.javierescobar.tallerlistview;

        import android.app.Activity;
        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;

public class Volumnes extends Activity {
    private ListView lv;
    private String[] opc;
    private Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumnes);
        lv= findViewById(R.id.IdOpcionesVolumen);
        opc= getResources().getStringArray(R.array.opcionesVolumenes);

        ArrayAdapter<String> adapter =new ArrayAdapter(this, android.R.layout.simple_list_item_1,opc);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        in = new Intent( Volumnes.this, RegistrarEsfera.class);
                        startActivity(in);
                        break;

                    case 1:
                        in = new Intent(Volumnes.this, RegistrarCilindro.class);
                        startActivity(in);
                        break;
                }
            }
        });
    }
}
