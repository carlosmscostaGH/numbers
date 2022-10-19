package com.aor.numbers;

public class DivisibleByFilter implements GenericListFilter{
    private int filter;

    public DivisibleByFilter(int divisor) {
        this.filter = divisor;
    }

    @Override
    public boolean accept(Integer number) {
        if (number % filter == 0){
            return true;
        }
        return false;
    }
}
