package me.huteri.weather.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class MathUtil {

    public static String getNoDecimal(float temp) {

        BigDecimal bigDecimal = new BigDecimal(String.valueOf(temp));
        bigDecimal = bigDecimal.setScale(0, BigDecimal.ROUND_HALF_UP);
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyPattern("#,##0");

        return decimalFormat.format(bigDecimal);
    }
}
