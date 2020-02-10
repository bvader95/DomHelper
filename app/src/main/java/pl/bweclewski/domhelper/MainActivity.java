package pl.bweclewski.domhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {
  

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    generateProblem();
  }
  
  @SuppressLint("SetTextI18n")
  private void generateProblem() {
    int term1;
    int term2;
    term1 = ThreadLocalRandom.current().nextInt(1,10);
    term2 = ThreadLocalRandom.current().nextInt(1, 10-term1+1);
    TextView equation = findViewById(R.id.equationTextView);
    equation.setText(term1 + "+" + term2);
  }
}
