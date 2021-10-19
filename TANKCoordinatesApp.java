import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    EditText coordinates;
    TextView getCoordinates;
    Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coordinates = findViewById(R.id.EnterCoordinates);

        getCoordinates = findViewById(R.id.coordinateDisplay);

        submit = findViewById(R.id.submitButton);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCoordinates.setText("Proceeding to: " + coordinates.getText().toString());
                getCoordinates.setVisibility(View.VISIBLE);
            }
        });

    }
} 
