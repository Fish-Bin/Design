package com.example.liubin.design.floating_action_button;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.liubin.design.R;
import com.example.liubin.design.floating_action_button.CoinAdapter;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

public class FloatingActionButtonActivity extends AppCompatActivity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_button);
        final FloatingActionsMenu button = findViewById(R.id.multiple_actions);
        button.setOnFloatingActionsMenuUpdateListener(new FloatingActionsMenu.OnFloatingActionsMenuUpdateListener() {
            @Override
            public void onMenuExpanded() {
                findViewById(R.id.rl).setVisibility(View.VISIBLE);
            }

            @Override
            public void onMenuCollapsed() {
               findViewById(R.id.rl).setVisibility(View.GONE);
            }
        });
        findViewById(R.id.buy).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button.isExpanded())
                    button.collapse();
            }
        });
        findViewById(R.id.sell).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button.isExpanded())
                    button.collapse();
            }
        });
        RecyclerView recyclerView=findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        String[] items={"1","2","3","4","1","2","3","4","1","2","3","4","1","2","3","4","1","2","3","4","1","2","3","4","1","2","3","4","1","2","3","4","1","2","3","4"};
        recyclerView.setAdapter(new CoinAdapter(this,items));
    }
}
