
package com.example.btth2_prac03;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder> {

    private Context context;
    private List<Country> countryList;

    public CountryAdapter(Context context, List<Country> countryList) {
        this.context = context;
        this.countryList = countryList;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_country, parent, false);
        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        Country country = countryList.get(position);
        holder.tvCountryName.setText(country.getName());
        holder.tvCapital.setText(country.getCapital());
        holder.ivFlag.setImageResource(country.getFlagResId());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, CountryDetailActivity.class);

            intent.putExtra("country", country.getFlagResId());
            intent.putExtra("name", country.getName());
            intent.putExtra("capital", country.getCapital());
            intent.putExtra("population", country.getPopulation());
            intent.putExtra("area", country.getArea());
            intent.putExtra("density", country.getDensity());
            intent.putExtra("worldShare", country.getWorldShare());
            intent.putExtra("flagResId", country.getFlagResId());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }

    public static class CountryViewHolder extends RecyclerView.ViewHolder {
        TextView tvCountryName, tvCapital;
        ImageView ivFlag;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvCountryName = itemView.findViewById(R.id.tvCountryName);
            tvCapital = itemView.findViewById(R.id.tvCapital);
            ivFlag = itemView.findViewById(R.id.ivFlag);
        }
    }
}
