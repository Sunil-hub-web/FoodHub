package in.fudhub.co.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import in.fudhub.co.databinding.CheckoutpageBinding;

public class CheckOutFragment extends Fragment {

    CheckoutpageBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        binding = CheckoutpageBinding.inflate(getLayoutInflater(),container,false);
        View view = binding.getRoot();

        return view;
    }
}
