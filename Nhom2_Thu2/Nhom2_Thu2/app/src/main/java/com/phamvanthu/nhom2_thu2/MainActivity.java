package com.phamvanthu.nhom2_thu2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;
import androidx.databinding.DataBindingUtil;

import com.phamvanthu.nhom2_thu2.database.PhoDatabase;
import com.phamvanthu.nhom2_thu2.databinding.ActivityMainBinding;
import com.phamvanthu.nhom2_thu2.databinding.ItemOderBinding;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements PhoAdapter.SpinnerListener {

    private ActivityMainBinding binding;
    private PhoAdapter adapter;
    private List<Pho> listSV = new ArrayList<>();

    private String banAn = "";
    private String monAn = "";
    private String soLuong = "";
    private String soThich = "";
    private String kM = "";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Add_Oder.class));
            }
        });

        initDataIntoDatabase();

        initData();
    }

    private void initData() {
        adapter = new PhoAdapter(getLayoutInflater());
        adapter.setData(listSV);
        binding.rcOder.setAdapter(adapter);
        adapter.setListener(this);
    }

    private void initDataIntoDatabase() {
        listSV.addAll(PhoDatabase.getInstance(this).phoDao().getAll());
        List<Pho> orderList = new ArrayList<>(PhoDatabase.getInstance(this).phoDao().getAll());
        if (orderList.size() == 0) {
            addDataIntoDatabase();
        }
    }

    private void addDataIntoDatabase() {
        Pho pho1=new Pho(1, "Phở tái" ,4, "Không hành", "Có");
        Pho pho2=new Pho(2, "Phở chín",3, "Giá đỗ", "Có");
        Pho pho3=new Pho(3, "Phở nạm",4, "Ít nước béo", "Không");

        // chèn dữ liệu vào database
        PhoDatabase.getInstance(this).phoDao().insert(pho1);
        PhoDatabase.getInstance(this).phoDao().insert(pho2);
        PhoDatabase.getInstance(this).phoDao().insert(pho3);

        listSV.addAll(PhoDatabase.getInstance(this).phoDao().getAll());
    }


    @Override
    public void onSpinnerClicked(int position) {

    }
    @Override
    public void onSpinnerLongClicked(int position) {

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}