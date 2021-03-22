package com.example.githubuser;

import java.util.ArrayList;

public class UserData {
    private static String[] gitName = {
            "Omar Jeffery Pineiro",
            "Jaden Smith",
            "Jake hill",
            "Nayvadius DeMun Wilburn",
            "Drake",
            "Jay Rock",
            "Travis Scott",
            "Rakim Mayers",
            "Gustav Elijah Åhr",
            "Symere Bysil Woods"
    };

    private static String[] gitUsername = {
            "omar",
            "jadensmith",
            "iamjakehill",
            "future",
            "drake",
            "jrock",
            "traviss",
            "rmayers",
            "elijah",
            "uzi"
    };

    private static int[] gitPhoto = {
            R.drawable.audi,
            R.drawable.ghost_jaden,
            R.drawable.gucci_coffin,
            R.drawable.jersey_future,
            R.drawable.life_is_good,
            R.drawable.money_trees,
            R.drawable.pick_up_the,
            R.drawable.praise_the_lord,
            R.drawable.ridin_strikers,
            R.drawable.sanguine_paradise,
    };

    static ArrayList<User> getListData() {
        ArrayList<User> list = new ArrayList<>();
        for (int position = 0; position < gitName.length; position++) {
            User user = new User();
            user.setName(gitName[position]);
            user.setUsername(gitUsername[position]);
            user.setPhoto(gitPhoto[position]);
            list.add(user);
        }
        return list;
    }
}
