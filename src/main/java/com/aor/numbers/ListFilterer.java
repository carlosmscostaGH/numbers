package com.aor.numbers;

import java.util.ArrayList;
import java.util.List;

public class ListFilterer {
    private final GenericListFilter filter;

    public ListFilterer(GenericListFilter filter){
        this.filter = filter;
    }
    public List<Integer> filter(List<Integer> list){
        List<Integer> filtrado = new ArrayList<>();
        for (int i : list)
            if (filter.accept(i)) filtrado.add(i);
        return filtrado;
    }
}
