package application.watch;
   import java.util.Calendar;
   import android.app.DatePickerDialog;
   import android.app.Dialog;
   import android.app.DialogFragment;
   import android.os.Bundle;
   import android.view.View;
   import android.widget.DatePicker;
   import android.widget.EditText;

/**
 * Created by WIN 7 on 4/12/2017.
 */

public class DateDialog extends DialogFragment implements DatePickerDialog.OnDateSetListener {
    EditText BD;
    public DateDialog(View view){
        BD=(EditText)view;
    }

    public Dialog onCreateDialog(Bundle savedInstanceState) {
// Use the current date as the default date in the dialog
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        // Create a new instance of DatePickerDialog and return it
        return new DatePickerDialog(getActivity(), this, year, month, day);

    }

    public void onDateSet(DatePicker view, int year, int month, int day) {
        //show to the selected date in the text box
        String date=day+"-"+(month+1)+"-"+year;
        BD.setText(date);
    }



}