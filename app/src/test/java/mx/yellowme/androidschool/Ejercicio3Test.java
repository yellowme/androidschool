package mx.yellowme.androidschool;

/**
 * Created by javikin on 5/13/16.
 */

import android.text.InputType;
import android.widget.EditText;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNotSame;


@Config(constants = BuildConfig.class, sdk = 18)
@RunWith(RobolectricGradleTestRunner.class)
public class Ejercicio3Test {
    private MainActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(MainActivity.class);
    }


    @Test
    public void validateContent() {
        EditText editText = (EditText) activity.findViewById(R.id.editTextUsuario);

        assertEquals("El tipo de input no es de numero", InputType.TYPE_CLASS_NUMBER, editText.getInputType());

    }
}