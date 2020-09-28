package com.example.calculator;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {
    StringBuilder str;
    Button num0,num1,num2,num3,num4,num5,num6,num7,num8,num9,add,sub,mul,div,l_bracket,r_bracket
            ,point,pai,percent,result,help,ac,del,quit,sin,cos,tan,factorial,square,menu;
    EditText edit_box;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        str = new  StringBuilder();
        edit_box = findViewById(R.id.edit1);
        num0 = findViewById(R.id.num0);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        l_bracket = findViewById(R.id.l_bracket);
        r_bracket = findViewById(R.id.r_bracket);
        del = findViewById(R.id.del);
        point = findViewById(R.id.point);
        pai = findViewById(R.id.pai);
        result = findViewById(R.id.result);
        help = findViewById(R.id.help);
        ac = findViewById(R.id.ac);
        percent = findViewById(R.id.percent);
        quit = findViewById(R.id.quit);
        sin = findViewById(R.id.sin);
        cos = findViewById(R.id.cos);
        tan = findViewById(R.id.tan);
        factorial = findViewById(R.id.factorial);
        square = findViewById(R.id.square);
        menu = findViewById(R.id.menu);

        result.setCursorVisible(true);
        disableShowInput(edit_box);

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("0");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("1");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("2");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("3");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("4");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("5");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("6");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("7");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("8");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("9");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("+");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("-");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("*");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("/");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        l_bracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("(");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        r_bracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append(")");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append(".");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        pai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("3.14");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("/100");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder RPN = new StringBuilder();
                String s = str+"\0"; //将输入的数据转换为string
                Calculater c = new Calculater(s,RPN);
                float re = c.calculate();
                s = re+"";
                edit_box.setText(s);
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.delete(0,str.length());
                edit_box.setText("");
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.delete(str.length()-1,str.length());
                edit_box.setText(str);
            }
        });
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,activity_2.class));
            }
        });
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });

        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            Log.i("info","landscape"); // 横屏
            sin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String s = str.toString();
                    Double result = getSin(s);
                    s = result+"";
                    edit_box.setText(s);
                }
            });
            cos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String s = str.toString();
                    Double result = getCos(s);
                    s = result+"";
                    edit_box.setText(s);
                }
            });
            tan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String s = str.toString();
                    Double result = getTan(s);
                    s = result+"";
                    edit_box.setText(s);
                }
            });
            factorial.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    str.append("!");
                    edit_box.setText(str);
                    edit_box.setSelection(edit_box.getText().length());
                }
            });
            square.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String s = str.toString();
                    Double result = getSquare(s);
                    s = result+"";
                    edit_box.setText(s);
                }
            });
            help.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("这是一个帮助").setTitle("");
                    builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(MainActivity.this,"这是一个帮助",Toast.LENGTH_LONG).show();
                        }
                    });
                }
            });

        } else if(this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            Log.i("info","portrait"); // 竖屏
        }
    }

    public void disableShowInput(EditText et) {
        Class<EditText> cls = EditText.class;
        Method method;
        try {
            method = cls.getMethod("setShowSoftInputOnFocus", boolean.class);
            method.setAccessible(true);
            method.invoke(et, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    double pi = 3.1415;
    public double getSin(String string){
        double a = Double.parseDouble(string);
        return Math.sin(a*180/pi);
    }
    public double getCos(String string){
        double a = Double.parseDouble(string);
        return Math.cos(a*180/pi);
    }
    public double getTan(String string){
        double a = Double.parseDouble(string);
        return Math.sin(a*180/pi);
    }
    public double getSquare(String string){
        double a = Double.parseDouble(string);
        return Math.pow(a,2);
    }
}