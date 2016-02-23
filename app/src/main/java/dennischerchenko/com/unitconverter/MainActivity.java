package dennischerchenko.com.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Button btnConvertToCM;
    //EditText txtInches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //btnConvertToCM = (Button) findViewById(R.id.btnConvertToCM);
    //txtInches = (EditText) findViewById(R.id.txtInches);

    /*
    btnConvertToCM.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick(View v){

            double inches = 100.0;
            double centimeters;

            centimeters = inches*2.54;

            txtInches.setText(centimeters.toString());

        }

    });
    */

    public void convert(View view) {
        double inches = 100.0;
        double centimeters;

        centimeters = inches*2.54;

        txtInches.setText(centimeters.toString());
    }
    /*
    public void onClickMakeAToast(View v){
        Toast.makeText(getBaseContext(), "I would like to propse a Toast", Toast);
    }
    */


    /*
    public class MyClass extends Activity
    {

        @Override
        public void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main);

            Button button = (Button) findViewById(R.id.button1);

            button.setOnClickListener(new OnClickListener()
            {
                public void onClick(View v)
                {
                    ImageView iv = (ImageView) findViewById(R.id.imageview1);
                    iv.setVisibility(View.VISIBLE);
                }
            });

        }
    }
    */



}
