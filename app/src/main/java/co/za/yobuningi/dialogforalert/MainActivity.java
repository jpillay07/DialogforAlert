package co.za.yobuningi.dialogforalert;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowAlert(View view) {
        AlertDialog.Builder myAlertBuilder = new
                AlertDialog.Builder(MainActivity.this);

        myAlertBuilder.setTitle(getString(R.string.dialog_title)).setMessage(getString(R.string.dialog_message));

        myAlertBuilder.setPositiveButton(getString(R.string.dialog_positive_label), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, R.string.dialog_toast_positive, Toast.LENGTH_SHORT).show();
            }
        });

        myAlertBuilder.setNegativeButton(getString(R.string.dialog_negative_label), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, R.string.dialog_toast_negative, Toast.LENGTH_SHORT).show();
            }
        });

        myAlertBuilder.show();
    }
}
