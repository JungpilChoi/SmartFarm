package com.example.xaid.smartfarm.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Switch;
import android.widget.TextView;

import com.example.xaid.smartfarm.Interface.Tipo;
import com.example.xaid.smartfarm.Models.Sensor;
import com.example.xaid.smartfarm.R;

import java.util.ArrayList;

/**
 * Created by herib on 23/03/2017.
 */

public class SensoresAdapter extends RecyclerView.Adapter{
    private ArrayList<Sensor> mDataset;
    private Context context;

    public SensoresAdapter(Context context, ArrayList<Sensor> Sensores) {
        context = context;
        mDataset = Sensores;
    }

    public class SensorViewHolder extends RecyclerView.ViewHolder {

        final TextView mTipoView, mDescricaoView;
        final Switch mSwitch;

        public SensorViewHolder(View view) {
            super(view);
            mTipoView = (TextView) view.findViewById(R.id.tipo_text);
            mSwitch = (Switch) view.findViewById(R.id.estado_switch);
            mDescricaoView = (TextView) view.findViewById(R.id.descricao_text);
        }

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.sensores_card, parent, false);
        SensorViewHolder holder = new SensorViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        SensorViewHolder viewHolder = (SensorViewHolder) holder;
        switch (mDataset.get(position).getTipo()) {
            case Tipo.FLUXO_DA_AGUA:
                viewHolder.mTipoView.setText(Tipo.FLUXO_DA_AGUA_STRING);
                break;
            case Tipo.PRESSAO:
                viewHolder.mTipoView.setText(Tipo.PRESSAO_STRING);
                break;
            case Tipo.UMIDADE_DO_SOLO:
                viewHolder.mTipoView.setText(Tipo.UMIDADE_DO_SOLO_STRING);
                break;
            case Tipo.VOLUME_RESERVATORIO:
                viewHolder.mTipoView.setText(Tipo.VOLUME_RESERVATORIO_STRING);
                break;
        }

        viewHolder.mSwitch.setChecked(mDataset.get(position).getEstado());

        viewHolder.mDescricaoView.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
