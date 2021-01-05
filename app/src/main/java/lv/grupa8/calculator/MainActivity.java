package lv.grupa8.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button memorySave;
    Button memoryClear;
    Button memoryRead;
    Button zero;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button split;
    Button multiply;
    Button count;
    Button substract;
    Button equal;
    Button point;
    Button clear;
    TextView result;
    String activities;
    String number1;
    Boolean splitbool = false;
    Boolean multiplybool = false;
    Boolean countbool = false;
    Boolean substractbool = false;
    Boolean resultCheck = false;
    double sk1;
    double sk2;
    SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.darbibas);
        preferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        memorySave = (Button) findViewById(R.id.buttonMS);
        memorySave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                savePreference();
            }
        });
        memoryRead = (Button) findViewById(R.id.buttonMR);
        memoryRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textStr = preferences.getString("Number", null);
                if  (textStr == null || textStr.equals("0")){
                    Toast.makeText(MainActivity.this,"Nekas nav saglabāts", Toast.LENGTH_SHORT).show();
                }else {
                    result.setText(textStr);
                    Toast.makeText(MainActivity.this,"Preference nolasīta", Toast.LENGTH_SHORT).show();
                }
            }
        });
        memoryClear = (Button) findViewById(R.id.buttonMC);
        memoryClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferences.edit().remove("Number").commit();
                Toast.makeText(MainActivity.this,"Preference izdzēsta", Toast.LENGTH_SHORT).show();
            }
        });
        clear = (Button) findViewById(R.id.buttonClear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("0");
            }
        });
        zero = (Button) findViewById(R.id.button0);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultCheck) {
                    resultCheck = false;
                    result.setText("");
                }
                activities = result.getText().toString();
                if (activities.equals("0")) {
                    result.setText("");
                    activities = "";
                }
                result.setText(activities + "0");
            }
        });
        one = (Button) findViewById(R.id.button1);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultCheck) {
                    resultCheck = false;
                    result.setText("");
                }
                activities = result.getText().toString();
                if (activities.equals("0")) {
                    result.setText("");
                    activities = "";
                }
                result.setText(activities + "1");
            }
        });
        two = (Button) findViewById(R.id.button2);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultCheck) {
                    resultCheck = false;
                    result.setText("");
                }
                activities = result.getText().toString();
                if (activities.equals("0")) {
                    result.setText("");
                    activities = "";
                }
                result.setText(activities + "2");
            }
        });
        three = (Button) findViewById(R.id.button3);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultCheck) {
                    resultCheck = false;
                    result.setText("");
                }
                activities = result.getText().toString();
                if (activities.equals("0")) {
                    result.setText("");
                    activities = "";
                }
                result.setText(activities + "3");
            }
        });
        four = (Button) findViewById(R.id.button4);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultCheck) {
                    resultCheck = false;
                    result.setText("");
                }
                activities = result.getText().toString();
                if (activities.equals("0")) {
                    result.setText("");
                    activities = "";
                }
                result.setText(activities + "4");
            }
        });
        five = (Button) findViewById(R.id.button5);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultCheck) {
                    resultCheck = false;
                    result.setText("");
                }
                activities = result.getText().toString();
                if (activities.equals("0")) {
                    result.setText("");
                    activities = "";
                }
                result.setText(activities + "5");
            }
        });
        six = (Button) findViewById(R.id.button6);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultCheck) {
                    resultCheck = false;
                    result.setText("");
                }
                activities = result.getText().toString();
                if (activities.equals("0")) {
                    result.setText("");
                    activities = "";
                }
                result.setText(activities + "6");
            }
        });
        seven = (Button) findViewById(R.id.button7);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultCheck) {
                    resultCheck = false;
                    result.setText("");
                }
                activities = result.getText().toString();
                if (activities.equals("0")) {
                    result.setText("");
                    activities = "";
                }
                result.setText(activities + "7");
            }
        });
        eight = (Button) findViewById(R.id.button8);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultCheck) {
                    resultCheck = false;
                    result.setText("");
                }
                activities = result.getText().toString();
                if (activities.equals("0")) {
                    result.setText("");
                    activities = "";
                }
                result.setText(activities + "8");
            }
        });
        nine = (Button) findViewById(R.id.button9);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultCheck) {
                    resultCheck = false;
                    result.setText("");
                }
                activities = result.getText().toString();
                if (activities.equals("0")) {
                    result.setText("");
                    activities = "";
                }
                result.setText(activities + "9");
            }
        });
        point = (Button) findViewById(R.id.Buttonkom);
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultCheck) {
                    resultCheck = false;
                    result.setText("");
                }
                activities = result.getText().toString();
                if (activities.contains(".")) {
                    Toast.makeText(MainActivity.this, "Skaitlim nevar būt vairāki komati!", Toast.LENGTH_LONG).show();
                } else if (activities.equals("")) {
                    result.setText(activities + "0.");
                }else{
                    result.setText(activities + ".");
                }


            }
        });
        split = (Button) findViewById(R.id.buttonSplit);
        split.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (splitbool) {
                    sk1 = Double.parseDouble(number1);
                    activities = result.getText().toString();
                    sk2 = Double.parseDouble(activities);
                    sk1 = sk1 / sk2;
                    number1 = String.valueOf(sk1);
                    number1 = fmt(sk1);
                    result.setText(number1);
                    resultCheck = true;
                } else {
                    activities = result.getText().toString();
                    number1 = activities;
                    splitbool = true;
                    result.setText("");
                }
            }
        });
        multiply = (Button) findViewById(R.id.buttonMultiply);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (multiplybool) {
                    sk1 = Double.parseDouble(number1);
                    activities = result.getText().toString();
                    sk2 = Double.parseDouble(activities);
                    sk1 = sk1 * sk2;
                    number1 = String.valueOf(sk1);
                    number1 = fmt(sk1);
                    result.setText(number1);
                    resultCheck = true;
                } else {
                    activities = result.getText().toString();
                    number1 = activities;
                    multiplybool = true;
                    result.setText("");
                }
            }
        });
        count = (Button) findViewById(R.id.buttonCount);
        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (countbool) {
                    sk1 = Double.parseDouble(number1);
                    activities = result.getText().toString();
                    sk2 = Double.parseDouble(activities);
                    sk1 = sk1 + sk2;
                    number1 = String.valueOf(sk1);
                    number1 = fmt(sk1);
                    result.setText(number1);
                    resultCheck = true;
                } else {
                    activities = result.getText().toString();
                    number1 = activities;
                    countbool = true;
                    result.setText("");
                }
            }
        });
        substract = (Button) findViewById(R.id.buttonSubtrac);
        substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (substractbool) {
                    sk1 = Double.parseDouble(number1);
                    activities = result.getText().toString();
                    sk2 = Double.parseDouble(activities);
                    sk1 = sk1 - sk2;
                    number1 = String.valueOf(sk1);
                    number1 = fmt(sk1);
                    result.setText(number1);
                    resultCheck = true;
                } else {
                    activities = result.getText().toString();
                    number1 = activities;
                    substractbool = true;
                    result.setText("");
                }
            }
        });
        equal = (Button) findViewById(R.id.buttonSum);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sk1 = Double.parseDouble(number1);
                activities = result.getText().toString();
                sk2 = Double.parseDouble(activities);
                if (splitbool) {
                    sk1 = sk1 / sk2;
                    number1 = String.valueOf(sk1);
                    number1 = fmt(sk1);
                    result.setText(number1);
                    splitbool = false;
                } else if (multiplybool) {
                    sk1 = sk1 * sk2;
                    number1 = String.valueOf(sk1);
                    number1 = fmt(sk1);
                    result.setText(number1);
                    multiplybool = false;
                } else if (countbool) {
                    sk1 = sk1 + sk2;
                    number1 = String.valueOf(sk1);
                    number1 = fmt(sk1);
                    result.setText(number1);
                    countbool = false;
                } else if (substractbool) {
                    sk1 = sk1 - sk2;
                    number1 = String.valueOf(sk1);
                    number1 = fmt(sk1);
                    result.setText(number1);
                    substractbool = false;
                }
                resultCheck = true;
            }
        });
    }

    //Metode kas nonem veselam skaitlim .0
    public static String fmt(double d) {
        if (d == (long) d)
            return String.format("%d", (long) d);
        else
            return String.format("%s", d);
    }

    public void savePreference() {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("Number", result.getText().toString());
        editor.commit();
        String textStr = result.getText().toString();
        if (textStr.equals("0")) {
            Toast.makeText(MainActivity.this, "Ievadiet kādu citu skaitli", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Skaitlis saglabāts", Toast.LENGTH_SHORT).show();
        }
    }
}