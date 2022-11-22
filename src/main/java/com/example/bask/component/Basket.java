package com.example.bask.component;

import com.example.bask.sheet.Sheet;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private final List<Sheet> sheets;

    public Basket() {
        this.sheets = new ArrayList<>();
    }

    public void add(List<Sheet> sheets) {
        this.sheets.addAll(sheets);
    }

    public List<Sheet> get() {
        return Collections.unmodifiableList(sheets);
    }
}
