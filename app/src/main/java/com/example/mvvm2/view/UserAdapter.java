package com.example.mvvm2.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvvm2.R;
import com.example.mvvm2.databinding.ItemUserBinding;
import com.example.mvvm2.viewmodel.UserViewModel;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.CustomHolder> {

    private ArrayList<UserViewModel> arrayList;
    private LayoutInflater layoutInflater;


    public UserAdapter(ArrayList<UserViewModel> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public CustomHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (layoutInflater == null)
            layoutInflater = LayoutInflater.from(parent.getContext());
        ItemUserBinding itemUserBinding = DataBindingUtil.inflate(layoutInflater,
                R.layout.item_user, parent, false);
        return new CustomHolder(itemUserBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomHolder holder, int position) {
        UserViewModel userViewModel = arrayList.get(position);
        holder.bind(userViewModel);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class CustomHolder extends RecyclerView.ViewHolder {

        private ItemUserBinding itemUserBinding;

        public CustomHolder(ItemUserBinding itemUserBinding) {
            super(itemUserBinding.getRoot());
            this.itemUserBinding = itemUserBinding;
        }

        private void bind(UserViewModel userViewModel) {
            this.itemUserBinding.setItem(userViewModel);
            this.itemUserBinding.executePendingBindings();
        }

        public ItemUserBinding getItemUserBinding() {
            return itemUserBinding;
        }

        public void setItemUserBinding(ItemUserBinding itemUserBinding) {
            this.itemUserBinding = itemUserBinding;
        }
    }

    public ArrayList<UserViewModel> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<UserViewModel> arrayList) {
        this.arrayList = arrayList;
    }

    public LayoutInflater getLayoutInflater() {
        return layoutInflater;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.layoutInflater = layoutInflater;
    }
}
