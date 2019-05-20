package br.com.digitalhouse.digital.materialdesignexercicio01;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class LoginActivity extends AppCompatActivity {

    //usar Input Layout no lugar de TextInputEditText
    TextInputLayout nomeTextInputLayout;
    TextInputLayout emailTextInputLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nomeTextInputLayout =  findViewById(R.id.textInputLayoutName);
        emailTextInputLayout = findViewById(R.id.textInputLayoutEmail);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //converte o editavel para string
                String nome = nomeTextInputLayout.getEditText().getText().toString();
                String email = emailTextInputLayout.getEditText().getText().toString();

                if(nome.isEmpty()){
                    Snackbar.make(nomeTextInputLayout, "Campo deve ser preenchido",
                            Snackbar.LENGTH_SHORT).show();
                }

                if (email.isEmpty()){
                    Snackbar.make(nomeTextInputLayout, "Campo deve ser preenchido",
                            Snackbar.LENGTH_SHORT).show();
                }

                if(!(nome.isEmpty()) && !(email.isEmpty())){
                    Snackbar.make(nomeTextInputLayout, "Usuário cadastrado com sucesso",
                            Snackbar.LENGTH_SHORT).show();
                }
            }
        });
    }
}

