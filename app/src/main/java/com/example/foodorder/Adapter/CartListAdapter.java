package com.example.foodorder.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodorder.Domain.FoodDomain;
import com.example.foodorder.Helper.ManagementCart;
import com.example.foodorder.Interface.ChangeNumberItemsListener;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CartListAdapter extends RecyclerView.Adapter<CartListAdapter.ViewHolder> {
    private ArrayList<FoodDomain> foodDomains;
    private ManagementCart managementCart;
    private ChangeNumberItemsListener changeNumberItemsListener;

    public CartListAdapter(ArrayList<FoodDomain> foodDomains, ManagementCart managementCart, ChangeNumberItemsListener changeNumberItemsListener) {
        foodDomains = foodDomains;
        this.managementCart = managementCart;
        this.changeNumberItemsListener = changeNumberItemsListener;
    }


    @NonNull
    @Override
    public CartListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CartListAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return foodDomains.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title, feeEachIteam;
        ImageView pic, plusItem, minusItem;
        TextView totalEachItems, num;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.t)
        }
    }

}
