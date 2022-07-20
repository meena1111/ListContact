package com.example.listcontact;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.listcontact.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    ContactAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<String> list = new ArrayList<>();
        list.add("https://avatars.mds.yandex.net/i?id=0cb23772f97093c7057ac30329e590e4-5286448-images-thumbs&n=13");
        list.add("https://avatars.mds.yandex.net/i?id=0cb23772f97093c7057ac30329e590e4-5286448-images-thumbs&n=13");
        list.add("https://avatars.mds.yandex.net/i?id=0cb23772f97093c7057ac30329e590e4-5286448-images-thumbs&n=13");
        list.add("https://avatars.mds.yandex.net/i?id=0cb23772f97093c7057ac30329e590e4-5286448-images-thumbs&n=13");
        list.add("https://avatars.mds.yandex.net/i?id=0cb23772f97093c7057ac30329e590e4-5286448-images-thumbs&n=13");
        list.add("https://avatars.mds.yandex.net/i?id=0cb23772f97093c7057ac30329e590e4-5286448-images-thumbs&n=13");
        list.add("https://avatars.mds.yandex.net/i?id=0cb23772f97093c7057ac30329e590e4-5286448-images-thumbs&n=13");
        list.add("https://avatars.mds.yandex.net/i?id=0cb23772f97093c7057ac30329e590e4-5286448-images-thumbs&n=13");
        list.add("https://avatars.mds.yandex.net/i?id=0cb23772f97093c7057ac30329e590e4-5286448-images-thumbs&n=13");
        list.add("https://avatars.mds.yandex.net/i?id=0cb23772f97093c7057ac30329e590e4-5286448-images-thumbs&n=13");
        list.add("https://avatars.mds.yandex.net/i?id=0cb23772f97093c7057ac30329e590e4-5286448-images-thumbs&n=13");
        list.add("https://avatars.mds.yandex.net/i?id=0cb23772f97093c7057ac30329e590e4-5286448-images-thumbs&n=13");
        list.add("https://avatars.mds.yandex.net/i?id=0cb23772f97093c7057ac30329e590e4-5286448-images-thumbs&n=13");
        list.add("https://avatars.mds.yandex.net/i?id=0cb23772f97093c7057ac30329e590e4-5286448-images-thumbs&n=13");
        list.add("https://avatars.mds.yandex.net/i?id=0cb23772f97093c7057ac30329e590e4-5286448-images-thumbs&n=13");
        list.add("https://avatars.mds.yandex.net/i?id=0cb23772f97093c7057ac30329e590e4-5286448-images-thumbs&n=13");
        list.add("https://avatars.mds.yandex.net/i?id=0cb23772f97093c7057ac30329e590e4-5286448-images-thumbs&n=13");
        list.add("https://avatars.mds.yandex.net/i?id=0cb23772f97093c7057ac30329e590e4-5286448-images-thumbs&n=13");
        list.add("https://avatars.mds.yandex.net/i?id=0cb23772f97093c7057ac30329e590e4-5286448-images-thumbs&n=13");

        adapter = new ContactAdapter(list);
        binding.recycler.setAdapter(adapter);

    }
}
