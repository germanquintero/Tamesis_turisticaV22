package mainactivity.germanquintero.com.tamesis_turisticav22;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyMenu extends ListFragment {

    String[] items ={
            "Inicio",
            "Bares",
            "Hoteles",
            "Sitios de Interés",
            "Demografia",
            "Acerca de",
            "Ver Mapa",

    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,items));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {

            if (position==0) {
                home fragment = new home();
                fragmentTransaction.replace(R.id.frame2, fragment).commit();

            }

            if (position==1) {
                Bar fragment = new Bar();
                fragmentTransaction.replace(R.id.frame2, fragment).commit();
            }

            if (position==2) {
                hotel fragment = new hotel();
                fragmentTransaction.replace(R.id.frame2, fragment).commit();
            }


            if (position==3) {
                Turismo fragment = new Turismo();
                fragmentTransaction.replace(R.id.frame2, fragment).commit();
            }

            if (position==4) {
                Demografia fragment = new Demografia();
                fragmentTransaction.replace(R.id.frame2, fragment).commit();
            }
            if (position==5) {
                acercade fragment = new acercade();
                fragmentTransaction.replace(R.id.frame2, fragment).commit();
            }

            if (position==6) {
                Intent my_mapa= new Intent(getActivity().getApplicationContext(), MapsActivity.class);
                startActivity(my_mapa);
                // MapsActivity fragment = new MapsActivity();
                //fragmentTransaction.replace(R.id.frame3, fragment).commit();
            }

        }

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){

            if (position==0) {
                home fragment = new home();
                fragmentTransaction.replace(R.id.frame3, fragment).commit();


            }

            if (position==1) {
                Bar fragment = new Bar();
                fragmentTransaction.replace(R.id.frame3, fragment).commit();
            }

            if (position==2) {
                hotel fragment = new hotel();
                fragmentTransaction.replace(R.id.frame3, fragment).commit();
            }


            if (position==3) {
                Turismo fragment = new Turismo();
                fragmentTransaction.replace(R.id.frame3, fragment).commit();
            }

            if (position==4) {
                Demografia fragment = new Demografia();
                fragmentTransaction.replace(R.id.frame3, fragment).commit();
            }
            if (position==5) {
                acercade fragment = new acercade();
                fragmentTransaction.replace(R.id.frame3, fragment).commit();
            }
            if (position==6) {
                Intent my_mapa= new Intent(getActivity().getApplicationContext(), MapsActivity.class);
                startActivity(my_mapa);
               // MapsActivity fragment = new MapsActivity();
                //fragmentTransaction.replace(R.id.frame3, fragment).commit();
            }

        }

    }

}