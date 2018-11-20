package top.liumingyi.currentapplicationtest;

import android.app.ActivityThread;

public class Utils {

  public static String hello() {
    return ActivityThread.currentApplication().getString(R.string.hello);
  }
}
