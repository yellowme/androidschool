package mx.yellowme.androidschool;

/**
 * Created by javikin on 5/13/16.
 */

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;


@Config(constants = BuildConfig.class, sdk = 18)
@RunWith(RobolectricGradleTestRunner.class)
public class Ejercicio6Test {
    private MainActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(MainActivity.class);
    }


    @Test
    public void validateContent() {

        activity.findViewById(R.id.buttonAction).performClick();

        EditText editText = (EditText) activity.findViewById(R.id.editTextUsuario);
        TextView textView = (TextView) activity.findViewById(R.id.textViewUsuario);

        assertEquals("Los valores del input no coincide con el del text", editText.getText() , textView.getText());


    }
}