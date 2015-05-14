package kz.abcsoft.listfragmentdemo1;

import android.app.ListFragment;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainList extends ListFragment {
    String [] data = new String[]{"one", "two", "three", "four"} ;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, data) ;
        setListAdapter(adapter);
    }
}
