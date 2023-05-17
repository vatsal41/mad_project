package zone.eloy.projects.androidcalculator;


import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener
{
    private int openParenthesis = 0;

    private boolean dotUsed = false;

    private boolean equalClicked = false;
    private String lastExpression = "";

    private final static int EXCEPTION = -1;
    private final static int IS_NUMBER = 0;
    private final static int IS_OPERAND = 1;
    private final static int IS_OPEN_PARENTHESIS = 2;
    private final static int IS_CLOSE_PARENTHESIS = 3;
    private final static int IS_DOT = 4;

    Button buttonNumber0;
    Button buttonNumber1;
    Button buttonNumber2;
    Button buttonNumber3;
    Button buttonNumber4;
    Button buttonNumber5;
    Button buttonNumber6;
    Button buttonNumber7;
    Button buttonNumber8;
    Button buttonNumber9;

    Button buttonClear;
    Button buttonParentheses;
    Button buttonPercent;
    Button buttonDivision;
    Button buttonMultiplication;
    Button buttonSubtraction;
    Button buttonAddition;
    Button buttonEqual;
    Button buttonDot;
