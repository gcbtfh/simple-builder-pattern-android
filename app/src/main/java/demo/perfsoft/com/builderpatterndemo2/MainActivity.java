package demo.perfsoft.com.builderpatterndemo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EmployeeBuilder builder = new EmployeeBuilder();
        builder.setId(7);
        builder.setName("Hung");

        Employee employee = builder.builder();

        Toast.makeText(this, employee.toString(), Toast.LENGTH_SHORT).show();
        Log.i("HUNG",employee.toString());
    }
}
