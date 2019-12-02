package com.techtorial.ventraApp;

public class Pass {


    private String monthlyPass;
    private String weekendPass;
    private String dailyPass;
    public Pass(){

    }
    public Pass(String monthlyPass,String weekendPass,String dailyPass){
        this.monthlyPass=monthlyPass;
        this.weekendPass=weekendPass;
        this.dailyPass=dailyPass;
    }
    public String getMonthlyPass(){
        return monthlyPass;
    }
    public String getWeekendPass(){
        return weekendPass;
    }
    public String getDailyPass(){
        return dailyPass;
    }
    public void setMonthlyPass(String monthlyPass){
        this.monthlyPass=monthlyPass;
    }
      public void setWeekendPass(String weekendPass) {
        this.weekendPass=weekendPass;
      }
      public void setDailyPass(String dailyPass){
        this.dailyPass=weekendPass;
      }







}
