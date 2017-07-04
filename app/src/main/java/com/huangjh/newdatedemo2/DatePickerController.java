package com.huangjh.newdatedemo2;

/**
 * Created by carme on 2017/7/4.
 */

public interface DatePickerController {
    int getMaxYear();

    void onDayOfMonthSelected(int year, int month, int day);

    void onDateRangeSelected(final SimpleMonthAdapter.SelectedDays<SimpleMonthAdapter.CalendarDay> selectedDays);

}
