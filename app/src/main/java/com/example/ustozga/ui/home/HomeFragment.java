package com.example.ustozga.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.ustozga.MainActivity2;
import com.example.ustozga.MainActivity3;
import com.example.ustozga.R;
import com.example.ustozga.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment implements UserAdapter.SelectedUser {

    private FragmentHomeBinding binding;

    RecyclerView recyclerView;
    List<ModelRcycler> modelRcyclers = new ArrayList<>();
    UserAdapter userAdapter;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // ruyhatni eloni va sozlanmasi
        recyclerView = root.findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(requireContext(),0));

        initial();

        userAdapter  = new UserAdapter(modelRcyclers,  this);
        recyclerView.setAdapter(userAdapter);


        return root;
    }

    private void initial() {
        modelRcyclers.add(new ModelRcycler(R.drawable.kirish,"Kirish","Qo‘llanma  uch qismdan  iborat bo‘lib,  uning birinchi qismida  sonlar nazariyasida muhim bo‘lgan","https://github.com/asadbekakmedov2001/sonlar_nazariyasi/blob/main/kirish.pdf"));
        modelRcyclers.add(new ModelRcycler(R.drawable.birbob,"I BOB.\tBUTUN SONLAR HALQASIDA BO'LINISH NAZARIYASI ELEMENTLARI","",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.ikkibob,"II BOB.\tSONLI FUNKSIYALAR VA ULARNING XOSSALARI","",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.uchbob,"III BOB.\tTAQQOSLAMALAR NAZARIYASI ELEMENTLARI","",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.turtbob,"IV BOB.\tBIR NOMA'LUMLI TAQQOSLAMALAR","",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.beshbob,"V BOB.\tBOSHLANG'ICH ILDIZLAR VA INDEKSLAR","",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.oltibob,"VI BOB.\tUZLUKSIZ KASRLAR VA ULARNING TADBIQLARI","",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.izohli,"IZOHLI LUG‘AT (GLOSARIY)","","https://github.com/asadbekakmedov2001/sonlar_nazariyasi/blob/main/izohli.pdf"));
        modelRcyclers.add(new ModelRcycler(R.drawable.ki,"FOYDALANISH UCHUN ILOVALAR","","https://github.com/asadbekakmedov2001/sonlar_nazariyasi/blob/main/ilovalar.pdf"));
        modelRcyclers.add(new ModelRcycler(R.drawable.literature,"ADABIYOTLAR","Qo‘llanma  uch qismdan  iborat bo‘lib,  uning birinchi qismida  sonlar nazariyasida muhim bo‘lgan" +
                "2. Isroilov M. I. Soleyev A. Sonlar nazariyasiga kirish. Toshkent, «Fan», 2003, 190 s.\n","https://github.com/asadbekakmedov2001/sonlar_nazariyasi/blob/main/adabiyot.pdf"));


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void selectedUser(ModelRcycler modelRcycler) {

        if (modelRcycler.getLessonName().toLowerCase().startsWith("kirish") ||
                modelRcycler.getLessonName().toLowerCase().startsWith("izohli") ||
                modelRcycler.getLessonName().toLowerCase().startsWith("foydalanish") ||
                modelRcycler.getLessonName().toLowerCase().startsWith("adabiyot")
        ){
//
            startActivity(new Intent(getContext(), MainActivity3.class).putExtra("data",modelRcycler.getLoadUrl()));
        }
        else {

            startActivity(new Intent(getContext(), MainActivity2.class).putExtra("swimmers",modelRcyclers.indexOf(modelRcycler)));


        }

    }

//    @Override
//    public void onPause() {
//        super.onPause();
//        modelRcyclers.clear();
//    }

    @Override
    public void onStart() {
        super.onStart();
        modelRcyclers.clear();
        initial();
    }
}