package com.example.extend_exercise_1117;

import androidx.annotation.NonNull;
import androidx.room.*;
import java.text.SimpleDateFormat;
import java.util.*;

    @Entity
    public class JobInWeek {

        @PrimaryKey
        @NonNull
        private String title;

        @ColumnInfo
        private String desciption;

        @ColumnInfo
        private Date dateFinish;

        @ColumnInfo
        private Date hourFinish;
        public JobInWeek(String title, String desciption, Date dateFinish, Date hourFinish) {
            this.title = title;
            this.desciption = desciption;
            this.dateFinish = dateFinish;
            this.hourFinish = hourFinish;
        }

        public JobInWeek() {

        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDesciption() {
            return desciption;
        }

        public void setDesciption(String desciption) {
            this.desciption = desciption;
        }

        public Date getDateFinish() {
            return dateFinish;
        }

        public void setDateFinish(Date dateFinish) {
            this.dateFinish = dateFinish;
        }

        public Date getHourFinish() {
            return hourFinish;
        }

        public void setHourFinish(Date hourFinish) {
            this.hourFinish = hourFinish;
        }
        public String getDateFormat(Date d)
        {
            SimpleDateFormat dft=new  SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
            return dft.format(d);
        }
        /**
         * lấy định dạng giờ phút
         * @param d
         * @return
         */
        public String getHourFormat(Date d)
        {
            SimpleDateFormat dft=new SimpleDateFormat("hh:mm a", Locale.getDefault());
            return dft.format(d);
        }
        @Override
        public String toString() {
            return this.title+"-"+
                    getDateFormat(this.dateFinish)+"-"+
                    getHourFormat(this.hourFinish);
        }
    }
