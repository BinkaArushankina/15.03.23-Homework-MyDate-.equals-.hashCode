package Homework;

import equals_hashcode.Order;

import java.util.Objects;

public class MyDate {
    private String day;
    private String month;
    private int year;

    public MyDate(String day, String month,int year){
        this.day=day;
        this.month= month;
        this.year=year;
    }
    public String getDay(){
        return day;
    }
    public String getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setDay(String day){
        this.day=day;
    }
    public void setMonth(String month) {
        this.month = month;
    }
    public void setYear(int year){
        this.year=year;
    }


    public boolean equals(Object o){
        if(this==o)return  true;
        if(!(o instanceof MyDate))return  false;
        MyDate myDate = (MyDate)o;
        return year==myDate.year && day.equals(myDate.day) && month.equals(myDate.month);
    }

    public int hashCode(){
        return Objects.hash(day,month,year);
    }


}
