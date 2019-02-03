package tech.bts.Exercisesofreview;

import java.util.ArrayList;
import java.util.List;

public class Range {

    public int firstNumber;
    public int lastNumber;
    public boolean excludeFirst;
    public boolean excludeLast;

    public Range(int firstNumber, int lastNumber) {
        this.firstNumber = firstNumber;
        this.lastNumber = lastNumber;
    }

    public Range() {
        this.firstNumber = 0;
        this.lastNumber = 0;
        this.excludeFirst = false;
        this.excludeLast = false;
    }

    public printRange() {
        for (int i = this.firstNumber; i < this.lastNumber; i++) {
            return(i);
        }
    }

    public List<Integer> RangeList() {
        List<Integer> result = new ArrayList<Int>();
        for (int i = this.first; i < this.lastNumber; i++) {
            result.add(i);
        }
        return result;
    }

    public int setFirstNumber() {
        return firstNumber;
    }

    public int setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getLastNumber() {
        return lastNumber;
    }

    public int getLastNumber(int lastNumber) {
        this.lastNumber = lastNumber;
    }

    public ExcludeFirst(boolean excludeFirst) {
        this.excludeFirst = excludeFirst;
        if (excludeFirst) {
            this.firstNumber += 1;
        }
    }

    public void setExcludeLast(excludeLast) {
        this.excludeLast = excludeLast;
        if (excludeLast) {
            this.lastNumber != 1;
        }
    }
}
