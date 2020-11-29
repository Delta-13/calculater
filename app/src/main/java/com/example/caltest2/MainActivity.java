package com.example.caltest2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Stack;
import java.math.BigDecimal;
import java.lang.Math;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,
            btn_7,btn_8,btn_9,btn_clear,btn_percent,
            btn_del, btn_lefter, btu_righted, btu_PandaM,
            btn_squ2,btn_sin,btn_cos,btn_div,btn_mul,
            btn_sub,btn_add,btn_equ,btn_p;
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_0.setOnClickListener(this);

        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_1.setOnClickListener(this);

        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_2.setOnClickListener(this);

        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_3.setOnClickListener(this);

        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_4.setOnClickListener(this);

        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_5.setOnClickListener(this);

        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_6.setOnClickListener(this);

        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_7.setOnClickListener(this);

        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_8.setOnClickListener(this);

        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_9.setOnClickListener(this);

        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_clear.setOnClickListener(this);

        btn_percent = (Button) findViewById(R.id.btn_percent);
        btn_percent.setOnClickListener(this);

        btn_del = (Button) findViewById(R.id.btn_del);
        btn_del.setOnClickListener(this);

        btn_lefter = (Button) findViewById(R.id.btn_leftbra);
        btn_lefter.setOnClickListener(this);

        btu_righted = (Button) findViewById(R.id.btn_rightbra);
        btu_righted.setOnClickListener(this);

        btu_PandaM = (Button) findViewById(R.id.btn_PandM);
        btu_PandaM.setOnClickListener(this);

        btn_squ2 = (Button) findViewById(R.id.btn_squ2);
        btn_squ2.setOnClickListener(this);

        btn_sin = (Button) findViewById(R.id.btn_sin);
        btn_sin.setOnClickListener(this);

        btn_cos = (Button) findViewById(R.id.btn_cos);
        btn_cos.setOnClickListener(this);

        btn_div = (Button) findViewById(R.id.btn_div);
        btn_div.setOnClickListener(this);

        btn_mul = (Button) findViewById(R.id.btn_mul);
        btn_mul.setOnClickListener(this);

        btn_sub = (Button) findViewById(R.id.btn_sub);
        btn_sub.setOnClickListener(this);

        btn_add = (Button) findViewById(R.id.btn_add);
        btn_add.setOnClickListener(this);

        btn_equ = (Button) findViewById(R.id.btn_equ);
        btn_equ.setOnClickListener(this);

        btn_p = (Button) findViewById(R.id.btn_p);
        btn_p.setOnClickListener(this);

        text=(EditText) findViewById(R.id.text);
    }
    @Override
    public void onClick(View v) {
        String str = text.getText().toString();
        boolean b = str.charAt(str.length() - 1) == '+' || str.charAt(str.length() - 1) == '-' ||
                str.charAt(str.length() - 1) == '×' || str.charAt(str.length() - 1) == '÷' ||
                str.charAt(str.length() - 1) == '.' || str.charAt(str.length() - 1) == '(';
        boolean y = str.contains("()") || str.contains("÷×") || str.contains("×÷") || str.contains("×+") ||
                str.contains("+×") || str.contains("+÷") || str.contains("÷+") || str.contains("+-") || str.contains("-+");
        boolean b1 = str.contains("+") || str.contains("-") || str.contains("×") || str.contains("÷");
        switch(v.getId()){
            case R.id.btn_del:
                if(str.length()>1){
                    str=str.substring(0,str.length()-1);
                }
                else{
                    str="0";
                }
                text.setText(str);
                break;
            case R.id.btn_clear:
                str="0";
                text.setText(str);
                break;
            case R.id.btn_0:
                if (str.equals("0")){
                    str="0";
                }
                else{
                    str+="0";
                }
                text.setText(str);
                break;
            case R.id.btn_1:
                if (str.equals("0")){
                    str="1";
                }
                else{
                    str+="1";
                }
                text.setText(str);
                break;
            case R.id.btn_2:
                if (str.equals("0")){
                    str="2";
                }
                else{
                    str+="2";
                }
                text.setText(str);
                break;
            case R.id.btn_3:
                if (str.equals("0")){
                    str="3";
                }
                else{
                    str+="3";
                }
                text.setText(str);
                break;
            case R.id.btn_4:
                if (str.equals("0")){
                    str="4";
                }
                else{
                    str+="4";
                }
                text.setText(str);
                break;
            case R.id.btn_5:
                if (str.equals("0")){
                    str="5";
                }
                else{
                    str+="5";
                }
                text.setText(str);
                break;
            case R.id.btn_6:
                if (str.equals("0")){
                    str="6";
                }
                else{
                    str+="6";
                }
                text.setText(str);
                break;
            case R.id.btn_7:
                if (str.equals("0")){
                    str="7";
                }
                else{
                    str+="7";
                }
                text.setText(str);
                break;
            case R.id.btn_8:
                if (str.equals("0")){
                    str="8";
                }
                else{
                    str+="8";
                }
                text.setText(str);
                break;
            case R.id.btn_9:
                if (str.equals("0")){
                    str="9";
                }
                else{
                    str+="9";
                }
                text.setText(str);
                break;
            case R.id.btn_p:
//                Toast.makeText(MainActivity.this, str.length(), Toast.LENGTH_LONG).show();
                if(b || str.charAt(str.length() - 1) == ')') {
                    Toast.makeText(MainActivity.this, "Input error!0", Toast.LENGTH_SHORT).show();
                }
//                else if(str.charAt(str.length() - 1)  >= 48 && 57 >= str.charAt(str.length()-1)){
//                    int sign = 0, sign1 = 0;
//                    int i;
//                    for(i = str.length(); i > 0; i--){
//                        char c = str.charAt(i);
//                        if(c != '+' && c != '-' && c != '×' && c != '÷')
//                            sign1 = 1;
//                        if(sign1 == 1 && str.contains(".")){
//                            sign = 1;
//                        }
//                        break;
//                    }
//                    if (sign == 1){
//                        Toast.makeText(MainActivity.this, "Input error!01234", Toast.LENGTH_SHORT).show();
//                        text.setText(str);
//                    }
//                }
                else {
                    str += ".";
                }
                text.setText(str);
                break;
            case R.id.btn_add:
                if(b){
                    str = str.substring(0,str.length() - 1);
                }

                str += "+";
                text.setText(str);
                break;
            case R.id.btn_sub:
                if(b){
                    str = str.substring(0,str.length() - 1);
                }
                str += "-";
                text.setText(str);
                break;
            case R.id.btn_mul:
                if(b){
                    str = str.substring(0,str.length() - 1);
                }
                str += "×";
                text.setText(str);
                break;
            case R.id.btn_div:
                if(b){
                    str = str.substring(0,str.length() - 1);
                }
                str += "÷";
                text.setText(str);
                break;
            case R.id.btn_leftbra:
                if (str.length()==1){
                    str="(";
                }
                else if(!str.contains("+")&&!str.contains("-")&&!str.contains("×")&&!str.contains("÷")){
                    str="("+str;
                }
                else {
                    str += "(";
                }
                text.setText(str);
                break;
            case R.id.btn_rightbra:
                if (str.length()==1){
                    str="0";
                }
                else {
                    str += ")";
                }
                text.setText(str);
                break;
            case R.id.btn_equ:
                if(b){
                    Toast.makeText(MainActivity.this,"Please complete the formula!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else if(y){
                    Toast.makeText(MainActivity.this,"Please complete the formula!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else {
                    String ero = isMatched(str);
                    if (ero.equals("no error")) {
                        String re = getResult();
                        if (re.contains("Infinity")) {
                            Toast.makeText(MainActivity.this, "0 cannot be used as a divior!", Toast.LENGTH_SHORT).show();
                            text.setText("0");
                        } else {
                            text.setText(re);
                        }
                    } else {
                        Toast.makeText(MainActivity.this, ero, Toast.LENGTH_SHORT).show();
                    }
                }
                break;
            case R.id.btn_squ2:
                if(str.charAt(0)=='-'){
                    Toast.makeText(MainActivity.this,"Negative numbers cannot be squared!",Toast.LENGTH_SHORT).show();
                    text.setText("0");
                }
                else if(b1){
                    Toast.makeText(MainActivity.this,"Symbols cannot be squared!",Toast.LENGTH_SHORT).show();
                    text.setText("0");
                }
                else if(str.charAt(0) == '+' || str.charAt(0) == '-' || str.charAt(0) == '×' || str.charAt(0) == '÷'){
                    Toast.makeText(MainActivity.this,"Symbols cannot be squared!",Toast.LENGTH_SHORT).show();
                    text.setText("0");
            }
                else{
                    double x=Double.parseDouble(str);
                    x=Math.sqrt(x);
                    String x2=String.format("%.9f",x);
                    x2 = x2.replaceAll("0+?$", "");//去掉多余的0
                    x2 = x2.replaceAll("[.]$", "");//如最后一位是.则去掉
                    text.setText(x2);
                }
                break;
            case R.id.btn_percent:
                if (b1 || str.contains("(") || str.contains(")")){
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    text.setText("0");
                } else {
                    double per=Double.parseDouble(str);
                    per=per/100;
                    String per1=""+per;
                    per1 = per1.replaceAll("0+?$", "");//去掉多余的0
                    per1 = per1.replaceAll("[.]$", "");//如最后一位是.则去掉
                    text.setText(per1);
                }
                break;
            case R.id.btn_sin:
                double sinn=Double.parseDouble(str);
                sinn=Math.toRadians(sinn);
                sinn=Math.sin(sinn);
                String sinn1=String.format("%.9f",sinn);//规避极小误差
                sinn1 = sinn1.replaceAll("0+?$", "");//去掉多余的0
                sinn1 = sinn1.replaceAll("[.]$", "");//如最后一位是.则去掉
                text.setText(sinn1);
                break;
            case R.id.btn_cos:
                double coss=Double.parseDouble(str);
                coss=Math.toRadians(coss);
                coss=Math.cos(coss);
                String coss1=String.format("%.9f",coss);//规避极小误差
                coss1 = coss1.replaceAll("0+?$", "");//去掉多余的0
                coss1 = coss1.replaceAll("[.]$", "");//如最后一位是.则去掉
                text.setText(coss1);
                break;
            case R.id.btn_PandM:
                if(str.charAt(0)>='0'&&str.charAt(0)<='9'){
                    if(str.equals("0")){
                        text.setText("0");
                    }
                    else{
                        text.setText("-"+str);
                    }
                }
                else if(str.charAt(0)=='-')
                    text.setText(str.substring(1,str.length()));
                else
                    text.setText(str);
                break;
            default:
                break;
        }
    }

    //将中缀表达式转换成后缀表达式
    public static StringBuffer toPostfix(String infix){
        Stack<String> stack=new Stack<String>();   //运算符栈,顺序栈
        StringBuffer postfix=new StringBuffer(infix.length()*2);   //后缀表达式字符串
        if('-' == infix.charAt(0)){
            infix = 0 + infix;
        }
        int i=0;
        while(i<infix.length()){
            char ch=infix.charAt(i);
            switch(ch){
                case '+':
                case '-':
                    while(!stack.isEmpty()&&!stack.peek().equals("(")) //如果栈不为空且栈顶元素不是"(",则出栈
                        postfix.append(stack.pop());   //且添加到后缀表达式串
                    stack.push(ch+""); //ch入栈
                    i++;
                    break;

                case '×':
                case '÷':
                    while(!stack.isEmpty()&&(stack.peek().equals("×")||stack.peek().equals("÷")))  //如果栈顶元素不为空且栈顶元素是"*"或是"/"时,则出栈
                        postfix.append(stack.pop());
                    stack.push(ch+"");
                    i++;
                    break;

                case '(':
                    stack.push(ch+""); //直接入栈
                    i++;
                    break;

                case ')':
                    String out=stack.pop();
                    while(out!=null&&!out.equals("(")){    //如果栈顶元素不为空且不为"("时
                        postfix.append(out);   //添加到后缀表达式串
                        out=stack.pop();   //把此时位于栈顶的"("弹出
                    }
                    i++;
                    break;

                default:
                    while((i<infix.length()&&ch>='0'&&ch<='9')||(i<infix.length()&&ch=='.')){
                        postfix.append(ch);    //如果是数字直接添加到后缀表达式串
                        i++;
                        if(i<infix.length())
                            ch=infix.charAt(i);
                    }
                    postfix.append(" ");
            }

        }
        while(!stack.isEmpty())       //所有运算符出栈
            postfix.append(stack.pop());   //添加到后缀表达式中
        return postfix;
    }

    //计算后缀表达式
    public static Double toValue(StringBuffer postfix){
        Stack<Double> stack=new Stack<Double>();   //操作数栈,链式栈
        double value=0;
        int j=0;
        for(int i=0;i<postfix.length();i++){
            j=i;
            char ch=postfix.charAt(i);
            if ((ch>='0'&&ch<='9')||ch=='.') {
                value=0;
                while(ch!=' '){
                    while(ch!=' '&&ch!='.'){
                        value=value*10+ch-'0';
                        j++;
                        ch=postfix.charAt(++i);
                    }
                    if(ch!=' '&&ch=='.')
                        ch=postfix.charAt(++i);
                    while(ch!=' '&&(i>=j+1)){
                        BigDecimal valueBD=new BigDecimal(Double.toString(value));
                        BigDecimal chBD=new BigDecimal(Double.toString(ch-'0'));
                        BigDecimal nBD=new BigDecimal(Double.toString(Math.pow(10,i-j)));
                        double temp=chBD.divide(nBD).doubleValue();
                        BigDecimal tempBD=new BigDecimal(Double.toString(temp));
                        value=valueBD.add(tempBD).doubleValue();
                        ch=postfix.charAt(++i);
                    }

                    stack.push(value);
                }

            }
            else{
                if(ch!=' '){
                    Double y=stack.pop();
                    Double x=stack.pop();
                    switch(ch){
                        case'+':
                            value=x+y;
                            break;
                        case'-':
                            value=x-y;
                            break;
                        case'×':
                            value=x*y;
                            break;
                        case'÷':
                            value=x/y;
                            break;
                    }
                    stack.push(value);
                }
            }

        }
        return stack.pop();
    }
    public String getResult(){
        String infix = text.getText().toString();
        StringBuffer postfix=toPostfix(infix);
        Double result=toValue(postfix);
        String re=String.format("%.7f",result);//规避极小误差
        re = re.replaceAll("0+?$", "");//去掉多余的0
        re = re.replaceAll("[.]$", "");//如最后一位是.则去掉
        return re;
    }

    public static String isMatched(String infix){
        Stack<String> stack=new Stack<String>();
        for (int i=0;i<infix.length();i++){
            char ch=infix.charAt(i);
            switch(ch){
                case'(':
                    stack.push(ch+"");
                    break;
                case')':
                    if(stack.isEmpty()||!stack.pop().equals("("))
                        return "expect   (";
            }
        }
        return(stack.isEmpty())?"no error":"expect   )";
    }
}