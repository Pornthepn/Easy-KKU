package kku.champ.easykku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class SignUpActivity extends AppCompatActivity {

    //Explicit
    private EditText nameEditText,phoneEdiText,
    userEdiText, passwordEdiText;
    private ImageView imageView;
    private Button button;
    private String nameString,phonString,userString,passwordString;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Bind Widget
        nameEditText =(EditText) findViewById(R.id.editText8);
        phoneEdiText = (EditText) findViewById(R.id.editText7);
        userEdiText = (EditText) findViewById(R.id.editText6);
        passwordEdiText = (EditText) findViewById(R.id.editText5);
        imageView = (ImageView) findViewById(R.id.imageView);
        button = (Button) findViewById(R.id.button2);


        //SignUp controller
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get Value From Edit Text
                nameString = nameEditText.getText().toString().trim();
                phonString = phoneEdiText.getText().toString().trim();
                passwordString =passwordEdiText.getText().toString().trim();

                //Chek Space
                if (nameString.equals("") || phoneEdiText.equals("") || userString.equals("") || passwordString.equals("")){
                    //Have Space
                    Log.d("12novV1","Have Space");
                    MyAlert myAlert = new MyAlert(SignUpActivity.this,R.drawable.doremon48,"มีช่องว่าง","กรุณากรอกให้ครบค่ะ");
                            myAlert.myDialog();
                }
            }  // onClick
        });

    } // Main Method

} //Main Class
