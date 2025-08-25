package com.example.myapplication;
import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class CalculationData implements Parcelable {
    private static final long serialVersionID = 1L;

    private int num1;
    private int num2;

    CalculationData(int num1,int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    int getNum1() {
        return num1;
    }

    int getNum2() {
        return num2;
    }

    public int sumCalculation(int num1, int num2) {
        return num1 + num2;
    }

    protected CalculationData(Parcel in) {
        num1 = in.readInt();
        num2 = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest,int flag) {
        dest.writeInt(num1);
        dest.writeInt(num2);

    }
    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<CalculationData> CREATOR = new Creator<CalculationData>() {
        @Override
        public CalculationData createFromParcel(Parcel in) {
            return new CalculationData(in);
        }

        @Override
        public CalculationData[] newArray(int size) {
            return new CalculationData[size];
        }
    };
}