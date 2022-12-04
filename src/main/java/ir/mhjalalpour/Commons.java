package ir.mhjalalpour;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Commons {
static Object newObject = new Object(){};
    private static int outcounter;
    public static String errorLog = "";

    public static void outln(Object o) {
        System.out.println(o);
    }

    public static String exc(Exception e) {
        String sometext = String.valueOf(e);
        String ExceptionTexts = "";
        outcounter++;
        sometext = " Exception!!! " + outcounter + "-err(line" + Thread.currentThread().getStackTrace()[0].getLineNumber() + ")==> " + sometext;
        ExceptionTexts += sometext;
        sometext = e.getMessage();
        outcounter++;
        sometext = "\n" + outcounter + "-err(line" + Thread.currentThread().getStackTrace()[0].getLineNumber() + ")==> " + sometext;
        ExceptionTexts += sometext;
        sometext = String.valueOf(e.getCause());
        outcounter++;
        sometext = "\n" + outcounter + "-err(line" + Thread.currentThread().getStackTrace()[1].getLineNumber() + ")==> " + sometext;
        ExceptionTexts += sometext;
        ExceptionTexts += "End of Exception reporting";
        outln(ExceptionTexts);
        Logger.getLogger(newObject.getClass().getName()).log(Level.SEVERE, null, e);
//			JOptionPane.showMessageDialog(null, "خطایی رخ داده" + "\n" + e.getMessage() + "\n" + ExceptionTexts, "خطا", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
        errorLog += ExceptionTexts;
        return ExceptionTexts;
    }

}
