package com.sovoro.wordview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sovoro.R;
import com.sovoro.model.DailyWords;
import com.sovoro.model.Word;
import com.sovoro.model.WordOption;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SoVoRoWord10#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SoVoRoWord10 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "English Word";
    private static final String ARG_PARAM2 = "Korean Word";

    private Word mainWord;

    private TextView engWord;
    private TextView korWord;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SoVoRoWord10() {
        // Required empty public constructor
        mainWord= DailyWords.dailyWordsMap.get(WordOption.MAINWORD).get(9);
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SoVoRoWord10.
     */
    // TODO: Rename and change types and number of parameters
    public static SoVoRoWord10 newInstance(String param1, String param2) {
        SoVoRoWord10 fragment = new SoVoRoWord10();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_sovoro_word10, container, false);
        engWord=view.findViewById(R.id.sovoro_word_eng_10);
        korWord=view.findViewById(R.id.sovoro_word_kor_10);
        init();
        return view;
    }
    public void init() {
        engWord.setText(mainWord.getEnglishWord());
        korWord.setText(mainWord.getKoreanWord());
    }
    public void setMainWord(Word mainWord) {
        this.mainWord=mainWord;
    }
    public void setEngWord(String _engWord) {
        engWord.setText(_engWord);
    }
    public void setKorWord(String _korWord) {
        korWord.setText(_korWord);
    }
}