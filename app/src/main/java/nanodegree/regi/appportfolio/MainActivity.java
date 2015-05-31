package nanodegree.regi.appportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public void btnTapped(View v){
       Button button = (Button)v;
       Toast.makeText(getApplicationContext(),"This will launch " + button.getText() + " app", Toast.LENGTH_SHORT).show();
   }
}
