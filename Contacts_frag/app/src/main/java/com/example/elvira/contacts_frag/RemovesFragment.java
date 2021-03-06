package com.example.elvira.contacts_frag;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Elvira on 21.10.2016.
 */
public class RemovesFragment extends Fragment {

    RecyclerView mRecyclerView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.contact_delete, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        ArrayList<Contact> removeContacts = getArguments().getParcelableArrayList("contacts");
        ContactsAdapter adapter = new ContactsAdapter(getContext(), removeContacts, null, true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mRecyclerView.getContext()));
        mRecyclerView.setAdapter(adapter);

        return view;
    }

}