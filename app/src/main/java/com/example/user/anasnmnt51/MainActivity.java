package com.example.user.anasnmnt51;

//Package objects contain version information about the implementation and specification of a Java package
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //here i have created main class
//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
//extends is for extending a class. implements is for implementing an interface
//AppCompatActivity is a parent class

    TextView text;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Variables, methods, and constructors, which are declared protected in a superclass can be accessed only by the subclasses
        // in other package or any class within the package of the protected members class.
        //void is a Java keyword.  Used at method declaration and definition to specify that the method does not return any type,
        // the method returns void.
        //onCreate Called when the activity is first created. This is where you should do all of your normal static set up: create views,
        // bind data to lists, etc. This method also provides you with a Bundle containing the activity's previously frozen state,
        // if there was one.Always followed by onStart().
        //Bundle is most often used for passing data through various Activities.
// This callback is called only when there is a saved instance previously saved using onSaveInstanceState().
// We restore some state in onCreate() while we can optionally restore other state here, possibly usable after onStart() has
// completed.The savedInstanceState Bundle is same as the one used in onCreate().

        super.onCreate(savedInstanceState);
        // call the super class onCreate to complete the creation of activity like the view hierarchy
        setContentView(R.layout.activity_main);
        //R means Resource
        //layout means design
        //  main is the xml you have created under res->layout->main.xml
        //  Whenever you want to change your current Look of an Activity or when you move from one Activity to another .
        // The other Activity must have a design to show . So we call this method in onCreate and this is the second statement to set
        // the design
        text= findViewById(R.id.text);
        //TextView displays text to the user and optionally allows them to edit it. A TextView is a complete text editor,
        // however the basic class is configured to not allow editing.
        //Typecating textview with connecting an id
        button=findViewById(R.id.start);
        //Button is a Push-button which can be pressed, or clicked, by the user to perform an action.
        //setOnClickListener-Register a callback to be invoked when this view is clicked. If this view is not clickable, it becomes
        // clickable.
        button.setOnClickListener(new View.OnClickListener() {
            // View.OnClickListener: The callback that will run.This value may be null.
            @Override
            public void onClick(View v) {
                //onClick(View v)-Called when a view has been clicked.
                //Animation is the process of creating motion and shape change
                Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.myanim);
                text.startAnimation(animation);
                //AnimationUtils-Defines common utilities for working with animations.
                //loadAnimation(Context context, int id)-Loads an Animation object from a resource


            }
        });
    }
}

