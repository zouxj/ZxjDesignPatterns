package com.zxj.designpatterns;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.zxj.designpatterns._01面向对象6大原则_网络库切换.Oop_Http;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] itemName={"_01面向对象6大原则_网络库切换","_02_AOP面向切面编程_淘宝京东网络处理","_03_编译时注解_ButterKnife源码分析和手写","_04_Handler通信_源码分析和手写Handler框架","_05_工厂设计模式_数据存储的特有方式","_06_装饰设计模式_RecyclerView添加头部和底部","_07_代理设计模式_实现_Retrofit_create","_08_第三方开源库_EventBus_源码分析和手写","_09_第三方开源库OKHttp_网络编程基础","_10_第三方开源库OKHttp上传进度监听和自定义缓存","_11_第三方开源库RxJava基本使用和源码分析","_12_第三方开源库RxJava_自己动手写事件变换","_13_第三方开源库RxJava_Android实用开发场景","_14第三方开源库Retrofit源码设计模式分析","_15_开发模式MVP基础框架搭建和分析","_16_开发模式MVVM基础框架搭建和分析"};
        ListView mListView = findViewById(R.id.lv_content);
        mListView.setAdapter(new ArrayAdapter(this,R.layout.item_main,itemName));
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        toActivity(Oop_Http.class);
                        break;
                }
            }
        });
    }
    private  void toActivity(Class t){
        startActivity(new Intent(this,t));
    }
}
