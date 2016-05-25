package mx.yellowme.androidschool;

/**
 * Created by javikin on 5/13/16.
 */

import android.view.ViewGroup;
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
import static junit.framework.Assert.assertNotSame;


@Config(constants = BuildConfig.class, sdk = 18)
@RunWith(RobolectricGradleTestRunner.class)
public class Ejercicio2Test {
    private MainActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(MainActivity.class);
    }


    @Test
    public void validateContent() {
        EditText editText = (EditText) activity.findViewById(R.id.editTextUsuario);
        assertNotNull("editTextUsuario no Encontrado", editText);
        assertNotSame("No tiene el paddingtop correcto", editText.getPaddingTop(), "50");

    }
}