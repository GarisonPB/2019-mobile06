package id.ac.polinema.idealbodyweight.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import id.ac.polinema.idealbodyweight.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link resultFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class resultFragment extends Fragment {
    private OnFragmentInteractionListener mListener;
    private String information;

    public resultFragment() {
        // Required empty public constructor

    }
    public void setInformation(String information){
        this.information = information;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_result, container, false);
        View view = inflater.inflate(R.layout.fragment_result, container, false);
        TextView informationText = view.findViewById(R.id.text_information);
        informationText.setText(information);
        Button tryAgainButton = view.findViewById(R.id.button_try_again);
        tryAgainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mListener != null) {
                    mListener.onTryAgainButtonClicked("BrocaIndex");
                    Fragment fragment = getFragmentManager().findFragmentById(R.id.fragment_container);
                    mListener.onTryAgainButtonClicked(fragment.getTag());
                }
            }
        });
        return  view;
    }

    // TODO: Rename method, update argument and hook method into UI event

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onTryAgainButtonClicked(String tag);
    }
}