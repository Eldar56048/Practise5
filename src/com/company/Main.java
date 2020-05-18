package com.company;

import com.Interfaces.Gemstone;
import com.Interfaces.OnlineStore;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        OnlineStore store=new OnlineStore();
        store.begin();
    }
}
