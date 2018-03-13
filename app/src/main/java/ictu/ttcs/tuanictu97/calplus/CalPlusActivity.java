package ictu.ttcs.tuanictu97.calplus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CalPlusActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnDecimal, btnBack, btnSeven, btnEight, btnNine, btnDivide, btnFour, btnFive, btnClear, btnNleft, btnNright,
            btnSix, btnMultiply, btnOne, btnTow, btnThree, btnSubtract, btnZero, btnEquals, btnAdd;
    TextView txtSolution, txtOnput;
    String textMath = "";
    String elementMath[] = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_plus);
        txtSolution = (TextView) findViewById(R.id.txtSolution);
        txtOnput = (TextView) findViewById(R.id.txtOnput);
        btnDecimal = (Button) findViewById(R.id.btnDecimal);
        btnNleft = (Button) findViewById(R.id.btnNLeft);
        btnNright = (Button) findViewById(R.id.btnNRight);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine = (Button) findViewById(R.id.btnNine);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnOne = (Button) findViewById(R.id.btnOne);
        btnTow = (Button) findViewById(R.id.btnTow);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnSubtract = (Button) findViewById(R.id.btnSubtract);
        btnZero = (Button) findViewById(R.id.btnZero);
        btnEquals = (Button) findViewById(R.id.btnEquals);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd = (Button) findViewById(R.id.btnAdd);

        btnBack.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnNleft.setOnClickListener(this);
        btnNright.setOnClickListener(this);
        btnDecimal.setOnClickListener(this);
        btnBack.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnOne.setOnClickListener(this);
        btnTow.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnZero.setOnClickListener(this);
        btnEquals.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            // event button point
            case R.id.btnDecimal:
                    textMath += ".";
                    txtSolution.setText(textMath);
                break;
            case R.id.btnNLeft:
                textMath += "(";
                txtSolution.setText(textMath);
                break;
            case R.id.btnNRight:
                textMath += ")";
                txtSolution.setText(textMath);
                break;
            case R.id.btnClear:
                textMath = "";
                txtSolution.setText(textMath);
                txtOnput.setText("0");
                break;
            case R.id.btnBack:
                Toast.makeText(CalPlusActivity.this,"Chưa xử lý....!", Toast.LENGTH_LONG).show();
                break;
            case R.id.btnSeven:
                textMath += "7";
                txtSolution.setText(textMath);
                break;
            case R.id.btnEight:
                textMath += "8";
                txtSolution.setText(textMath);
                break;
            case R.id.btnNine:
                textMath += "9";
                txtSolution.setText(textMath);
                break;
            case R.id.btnDivide:
                textMath += "/";
                txtSolution.setText(textMath);
                break;
            case R.id.btnFour:
                textMath += "4";
                txtSolution.setText(textMath);
                break;
            case R.id.btnFive:
                textMath += "5";
                txtSolution.setText(textMath);
                break;
            case R.id.btnSix:
                textMath += "6";
                txtSolution.setText(textMath);
                break;
            case R.id.btnMultiply:
                textMath += "*";
                txtSolution.setText(textMath);
                break;
            case R.id.btnOne:
                textMath += "1";
                txtSolution.setText(textMath);
                break;
            case R.id.btnTow:
                textMath += "2";
                txtSolution.setText(textMath);
                break;
            case R.id.btnThree:
                textMath += "3";
                txtSolution.setText(textMath);
                break;
            case R.id.btnSubtract:
                textMath += "-";
                txtSolution.setText(textMath);
                break;
            case R.id.btnZero:
                textMath += "0";
                txtSolution.setText(textMath);
                break;
            case R.id.btnEquals:
                String sMath = txtSolution.getText().toString();
                InfixToPostfix  IFP = new InfixToPostfix();
                if (sMath.length()>0){
                    try {
                        elementMath = IFP.processString(sMath);
                        elementMath = IFP.postfix(elementMath);
                        String result = IFP.valueMath(elementMath);
                        txtOnput.setText(result);
                    }catch (Exception e){
                        Toast.makeText(CalPlusActivity.this, "Lỗi...!", Toast.LENGTH_LONG).show();
                    }
                }
                break;
            case R.id.btnAdd:
                textMath += "+";
                txtSolution.setText(textMath);
                break;
            default:
                break;
        }
    }
}
