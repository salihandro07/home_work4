package com.example.home_work4;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> {

    private List<String> countries;
    private OnCountryClickListener listener;

    public interface OnCountryClickListener {
        void onCountryClick(String country);
    }

    public CountryAdapter(List<String> countries, OnCountryClickListener listener) {
        this.countries = countries;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String country = countries.get(position);
        holder.textView.setText(country);
        holder.itemView.setOnClickListener(v -> listener.onCountryClick(country));
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(android.R.id.text1);
        }
    }
}
