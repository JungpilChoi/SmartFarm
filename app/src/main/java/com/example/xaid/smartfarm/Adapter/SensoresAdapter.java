package com.example.xaid.smartfarm.Adapter;

import android.content.Context;
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

public class SensoresAdapter extends BaseAdapter{
    private ArrayList<Sensor> mDataset;
    private Context context;

    public SensoresAdapter(Context context, ArrayList<Sensor> Sensores) {
        context = context;
        mDataset = Sensores;
    }

    @Override
    public int getCount() {
        return mDataset.size();
    }

    @Override
    public Object getItem(int position) {
        return mDataset.get(position);
    }

    @Override
    public long getItemId(int position) {
        return mDataset.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.sensores_card, parent, false);

        TextView mTipoView, mDescricaoView;
        Switch mSwitch;

        mTipoView = (TextView) v.findViewById(R.id.tipo_text);
        mSwitch = (Switch) v.findViewById(R.id.estado_switch);
        mDescricaoView = (TextView) v.findViewById(R.id.descricao_text);

        switch (mDataset.get(position).getTipo()) {
            case Tipo.FLUXO_DA_AGUA:
                mTipoView.setText(Tipo.FLUXO_DA_AGUA_STRING);
                break;
            case Tipo.PRESSAO:
                mTipoView.setText(Tipo.PRESSAO_STRING);
                break;
            case Tipo.UMIDADE_DO_SOLO:
                mTipoView.setText(Tipo.UMIDADE_DO_SOLO_STRING);
                break;
            case Tipo.VOLUME_RESERVATORIO:
                mTipoView.setText(Tipo.VOLUME_RESERVATORIO_STRING);
                break;
        }

        mSwitch.setChecked(mDataset.get(position).getEstado());

        mDescricaoView.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");

        return v;
    }
}
