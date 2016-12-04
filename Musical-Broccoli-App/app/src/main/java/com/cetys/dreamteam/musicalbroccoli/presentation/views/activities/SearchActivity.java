package com.cetys.dreamteam.musicalbroccoli.presentation.views.activities;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.Toast;

import com.cetys.dreamteam.musicalbroccoli.R;
import com.cetys.dreamteam.musicalbroccoli.TourStopApplication;
import com.cetys.dreamteam.musicalbroccoli.databinding.SearchActivityBinding;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.SearchActivityModule;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.SearchViewModel;

import javax.inject.Inject;


public class SearchActivity extends BaseActivity {

    @Inject
    SearchActivityBinding binding;
    @Inject
    SearchViewModel viewModel;

    CalendarView calendar;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );

        //sets the main layout of the activity
        setContentView( R.layout.search_activity );

        initActivityComponent();
        initBinding();
        //initializes the calendarview
        //initializeCalendar();
    }

    // TODO: FIX THIS ACTIVITY pls
    public void initializeCalendar() {

        //  calendar = (CalendarView) findViewById(R.id.calendar);

        // sets whether to show the week number.
        calendar.setShowWeekNumber( false );

        // sets the first day of week according to Calendar.
        // here we set Monday as the first day of the Calendar
        calendar.setFirstDayOfWeek( 2 );

        //The background color for the selected week.
        calendar.setSelectedWeekBackgroundColor( getResources().getColor( R.color.blue ) );

        //sets the color for the dates of an unfocused month.
        calendar.setUnfocusedMonthDateColor( getResources().getColor( R.color.transparent ) );

        //sets the color for the separator line between weeks.
        calendar.setWeekSeparatorLineColor( getResources().getColor( R.color.transparent ) );

        //sets the color for the vertical bar shown at the beginning and at the end of the selected date.
        calendar.setSelectedDateVerticalBar( R.color.darkblue );

        //sets the listener to be notified upon selected date change.
        calendar.setOnDateChangeListener( new OnDateChangeListener() {

            //show the selected date as a toast
            @Override

            public void onSelectedDayChange( CalendarView view, int year, int month, int day ) {
                Toast.makeText( getApplicationContext(), day + "/" + month + "/" + year,
                        Toast.LENGTH_LONG ).show();
            }
        } );
    }

    @Override
    protected void initActivityComponent() {
        TourStopApplication.get( this ).getAppComponent()
                .plus( new SearchActivityModule( this ) ).inject( this );
    }

    @Override
    protected void initBinding() {
        binding.setViewModel( viewModel );
    }
}