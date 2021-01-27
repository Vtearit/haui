package com.phamvanthu.nhom2_thu2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;
import androidx.databinding.DataBindingUtil;

import com.phamvanthu.nhom2_thu2.database.PhoDatabase;
import com.phamvanthu.nhom2_thu2.databinding.ItemOderBinding;

import java.util.LinkedList;
import java.util.List;

public class Add_Oder extends AppCompatActivity implements PhoAdapter.SpinnerListener {

    private ItemOderBinding binding;
    private List<Pho> data=new LinkedList<>();
    private PhoAdapter adapter;

    private String banAn = null;
    private String monAn = null;
    private String soLuong = null;
    private String soThich = null;
    private String kM = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.add_activity);

    }


    @Override
    public void onSpinnerClicked(int position) {

    }

    @Override
    public void onSpinnerLongClicked(int position) {

    }
}