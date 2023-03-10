package com.example.lateangels.SelectionScreens;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cameroncampbell.WGUandroid.Database.SchoolRepository;
import com.cameroncampbell.WGUandroid.Entities.CourseEntity;
import com.cameroncampbell.WGUandroid.Entities.TermEntity;
import com.cameroncampbell.WGUandroid.R;
import com.cameroncampbell.WGUandroid.RecyclerViewAdapters.TermsRecAdapter;

import java.util.List;

public class EditTermActivity extends AppCompatActivity {

    //private TermViewModel mTermViewModel;
    //private CourseViewModel mCourseViewModel;
    private SchoolRepository schoolRepository;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_term);

        //mTermViewModel = new ViewModelProvider(this).get(TermViewModel.class);
        //mCourseViewModel = new ViewModelProvider(this).get(CourseViewModel.class);

        String recVersion = "Edit";
        RecyclerView termsRecycler = findViewById(R.id.termsRecycler);

        schoolRepository = new SchoolRepository(getApplication());

        final TermsRecAdapter adapter = new TermsRecAdapter(this, recVersion);
        termsRecycler.setAdapter(adapter);
        termsRecycler.setLayoutManager(new LinearLayoutManager(this));
        List<TermEntity> allTerms = schoolRepository.getAllTerms();
        List<CourseEntity> allCourses = schoolRepository.getAllCourses();
        adapter.setTermWords(allTerms);
        adapter.setCourseWords(allCourses);
        /*mTermViewModel.getAllTerms().observe(this, new Observer<List<TermEntity>>(){
            @Override
            public void onChanged(@Nullable final List<TermEntity> termWords) {
                ArrayList<TermEntity> myList = new ArrayList();
                myList.addAll(termWords);
                adapter.setTermWords(myList);
            }
        });

        mCourseViewModel.getAllCourses().observe(this, new Observer<List<CourseEntity>>(){
            @Override
            public void onChanged(@Nullable final List<CourseEntity> courseWords) {
                ArrayList<CourseEntity> myOtherList = new ArrayList();
                myOtherList.addAll(courseWords);
                adapter.setCourseWords(myOtherList);
            }
        });*/
    }
}