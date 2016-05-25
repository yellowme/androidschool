package mx.yellowme.androidschool;

/**
 * Created by javikin on 5/13/16.
 */

import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertNotNull;


@Config(constants = BuildConfig.class, sdk = 18)
@RunWith(RobolectricGradleTestRunner.class)
public class Ejercicio1Test {
    private MainActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(MainActivity.class);
    }


    @Test
    public void validateTextViewContent() {
        TextView textView = (TextView) activity.findViewById(R.id.textViewUsuario);
        assertNotNull("textViewUsuario no Encontrado", textView);

    }
}